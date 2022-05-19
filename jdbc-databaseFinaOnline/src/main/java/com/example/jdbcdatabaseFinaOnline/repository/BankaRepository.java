package com.example.jdbcdatabaseFinaOnline.repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.jdbcdatabaseFinaOnline.data.Banka;

@Transactional
@Repository
public class BankaRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private RowMapper<Banka> rowMapper = (ResultSet rs, int rowNum) -> {
		Banka banka = new Banka();
		banka.setId(rs.getInt(1));
		banka.setNazivBanke(rs.getString(2));
		banka.setAdresaBanke(rs.getString(3));
		banka.setTstamp(rs.getTimestamp(4));
		
		
		return banka;
		
	};
	
	public List<Banka> getAll(){
		return jdbcTemplate.query("SELECT * FROM books_data  ", rowMapper);
		
	}
	
	public boolean addBank(Banka banka) {
		List<Object> params = new ArrayList<>();
		params.add(banka.getNazivBanke());
		params.add(banka.getAdresaBanke());
		
		if (jdbcTemplate.update("INSERT INTO books_data   (NAME,ADDRESS) VALUES(?,?)", params.toArray()) > 0) {
			return true;
		} else {
			return false;
		}
	}

}
