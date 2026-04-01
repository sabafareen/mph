package com.mphasis.librarymanagement.model;


import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;                         
    private String author;

    @ManyToMany(mappedBy = "books")
    private Set<Student> students = new HashSet<>();

    // Getters & setters
    public Long getId() { return id; }
    public Set<Student> getStudents() { 
    	return students; 
    }
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
    
    
}
