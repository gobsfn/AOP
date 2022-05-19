package com.example.crudoperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudoperations.model.Books;
import com.example.crudoperations.service.BooksService;

@RestController
public class BooksController {
	
	@Autowired
	BooksService booksService;

	@GetMapping("/book")
	private List<Books> getAllBooks(){
		return booksService.getAllBooks();
	}
	
	@GetMapping("/book/{bookID}")
	private Books getBooks(@PathVariable("bookID") int bookId){
		return booksService.getBooksByID(bookId);
	}
	
	@DeleteMapping("/book/{bookID}")
	private void deleteBook(@PathVariable("BookID") int bookId) {
		booksService.delete(bookId);
	}
	
	@PostMapping("/books")
	private int saveBook(@RequestBody Books books) {
		booksService.saveOrUpdate(books);
		return books.getBookID();
	}
	
	@PutMapping("/books")
	private Books update(@RequestBody Books books) {
		booksService.saveOrUpdate(books);
		return books;
	}
	
	
}
