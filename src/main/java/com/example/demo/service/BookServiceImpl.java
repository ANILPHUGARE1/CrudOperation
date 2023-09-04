package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.entity.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository repository;

	public BookServiceImpl(BookRepository repository) {
		super();
		this.repository = repository;
	}

	// this method is used to insert and update record
	@Override
	public String upsertBook(Book book) {

		Integer bookId = book.getBookId();

		System.out.println(book);

		repository.save(book);

		System.out.println(book);

		if (bookId == null) {
			return "Record Inserted";
		} else {
			return "Record Updated";
		}
	}

	@Override
	public List<Book> getAllBooks() {
	return (List<Book>) repository.findAll();
	
	}

	@Override
	public String deleteBook(Integer bookId) {

		repository.deleteById(bookId);
		return "Book has been deleted successfully";
	}

}
