package com.mphasis.firstspringapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.firstspringapp.service.BookService;
import com.mphasis.firstspringapp.service.LibraryService;

public class MainAppBookLibrary {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext container = 
        new ClassPathXmlApplicationContext("spring-config.xml");

    LibraryService libraryService = container.getBean("libraryService", LibraryService.class);
    System.out.println("Library Name: " + libraryService.getLibraryName());
    System.out.println("Books in Library:");

    for (BookService bookService : libraryService.getBooks()) {
        System.out.println("- " + bookService.getTitle() +
                           " by " + bookService.getAuthor());
    }

    container.close();
}
}