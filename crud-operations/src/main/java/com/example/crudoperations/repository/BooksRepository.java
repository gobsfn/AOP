package com.example.crudoperations.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.crudoperations.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {

}
