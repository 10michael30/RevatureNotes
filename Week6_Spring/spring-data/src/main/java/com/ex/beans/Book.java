package com.ex.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Books")
public class Book {
	
	@Id
	@Column(name="Book_Id")
	@SequenceGenerator(name="book_seq_gen",sequenceName="Book_SEQ",allocationSize=1)
	@GeneratedValue(generator="book_seq_gen",strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="Title",nullable=false)
	private String title;
	
	@Column(name="ISBN",nullable=false,unique=true)
	private String isbn;
	
	@Column(name="Price",nullable=false)
	private double price;
	
	@JoinColumn(name="Genre_ID")
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Genre genre;
	
	
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name="Book_Authors",joinColumns=@JoinColumn(name="Book_ID"),inverseJoinColumns=@JoinColumn(name="Author_ID))"))
	private Set<Author> authors;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}


	public Set<Author> getAuthors() {
		return authors;
	}


	public Book() {
		super();
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn + ", price=" + price + ", genre=" + genre
				+ ", authors=" + authors + "]";
	}


	public Book(String title, String isbn, double price, Genre genre, Set<Author> authors) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.genre = genre;
		this.authors = authors;
	}


	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	

}
