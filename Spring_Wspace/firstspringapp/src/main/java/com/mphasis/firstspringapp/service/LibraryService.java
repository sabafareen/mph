package com.mphasis.firstspringapp.service;

import java.util.List;

public class LibraryService {
	private String libraryName;
	private List<BookService> books;
 
	public LibraryService(List<BookService> books) {
		this.books = books;
	}
 
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
 
	public String getLibraryName() {
		return libraryName;
	}
 
	public List<BookService> getBooks() {
		return books;
	}
}
