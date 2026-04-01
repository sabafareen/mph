package com.mphasis.librarymanagement.model;


import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ManyToMany(
        cascade = { CascadeType.PERSIST, CascadeType.MERGE }
    )
    @JoinTable(
        name = "student_book",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private Set<Book> books = new HashSet<>();

    // Convenience methods
    public void borrowBook(Book book) {
        books.add(book);
        book.getStudents().add(this);
    }

    public void returnBook(Book book) {
        books.remove(book);
        book.getStudents().remove(this);
    }

    // Getters & setters
    public Long getId() { return id; }
    public Set<Book> getBooks() { return books; }
}

