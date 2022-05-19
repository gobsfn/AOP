package com.example.crudoperations.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudoperations.model.Books;
import com.example.crudoperations.repository.BooksRepository;

@Service
public class BooksService {
	
	@Autowired
	BooksRepository booksRepository;

	public List<Books> getAllBooks() {
		List<Books> books = new ArrayList<>();
		booksRepository.findAll().forEach(oneBook -> books.add(oneBook));
		return books;
	}

	public Books getBooksByID(int bookID) {
		return booksRepository.findById(bookID).get();
	}

	public void delete(int bookID) {
		booksRepository.deleteById(bookID);
		
	}

	public void update(Books books, int bookID) {
		booksRepository.save(books);
		
	}

	public void saveOrUpdate(Books books) {
		booksRepository.save(books);
		
	}

	

}
