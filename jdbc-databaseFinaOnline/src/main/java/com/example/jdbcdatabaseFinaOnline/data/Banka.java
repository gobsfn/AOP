package com.example.jdbcdatabaseFinaOnline.data;

import java.sql.Timestamp;

public class Banka {
	
	int id;
	String nazivBanke;
	String adresaBanke;
	Timestamp  tstamp;
	
	
	public Timestamp getTstamp() {
		return tstamp;
	}
	public void setTstamp(Timestamp tstamp) {
		this.tstamp = tstamp;
	}
	public Banka(int id, String nazivBanke, String adresaBanke) {
		this.id = id;
		this.nazivBanke = nazivBanke;
		this.adresaBanke = adresaBanke;
	}
	public Banka() {

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNazivBanke() {
		return nazivBanke;
	}
	public void setNazivBanke(String nazivBanke) {
		this.nazivBanke = nazivBanke;
	}
	public String getAdresaBanke() {
		return adresaBanke;
	}
	public void setAdresaBanke(String adresaBanke) {
		this.adresaBanke = adresaBanke;
	}

}
