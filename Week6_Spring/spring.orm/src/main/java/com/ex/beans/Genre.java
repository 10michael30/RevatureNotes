package com.ex.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="Genres")
public class Genre {
	
	
@Override
	public String toString() {
		return "Genre [id=" + id + ", name=" + name + "]";
	}
@Id
@Column(name="Genre_Id")
@SequenceGenerator(name="G_seq_gen",sequenceName="Genre_SEQ")
@GeneratedValue(generator="G_seq_gen",strategy=GenerationType.SEQUENCE)
private int id;


@Column(name="Genre_Name",nullable=false)
private String name;
public Genre() {
	super();
}
public Genre(String name) {
	super();
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}