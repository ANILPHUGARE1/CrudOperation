package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;


public interface BookService {

	public String upsertBook(Book book);
	
	public List<Book> getAllBooks();
	
	public String deleteBook(Integer bookId);
	
}
