package com.mphasis.librarymanagement.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="library_books")
public class Book {
@Id
@Column(name="id" ,length=5)
private long id;
@Column(name="title" ,length=5)
private String title;
@Column(name="author" ,length=5)
private String author;
@Column(name="isbn" ,length=5)
private String isbn;
@Column(name="pyear" ,length=5)
private int pyear;
public Book() {

}
public Book(long id, String title, String author, String isbn, int pyear) {
	super();
	this.id = id;
	this.title = title;
	this.author = author;
	this.isbn = isbn;
	this.pyear = pyear;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public int getPyear() {
	return pyear;
}
public void setPyear(int pyear) {
	this.pyear = pyear;
}
@Override
public int hashCode() {
	return Objects.hash(id);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	return id == other.id;
}


}

