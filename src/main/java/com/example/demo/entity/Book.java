package com.example.demo.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;


@Entity
@Data
@Table(name="BOOK_TABLE")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BOOK_ID")
	private Integer bookId;
	
	@Column(name="BOOK_NAME")
	private String bookName;
	
	
	@Column(name="BOOK_PRICE")
	private Double bookPrice;
	
	
}
