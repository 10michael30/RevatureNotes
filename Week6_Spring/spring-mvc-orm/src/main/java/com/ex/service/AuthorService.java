package com.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ex.beans.Author;
import com.ex.repository.AuthorRepository;

@Service("authorService")
@Transactional
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepo;
	
	
	
	public List<Author> getAll(){
		
		return authorRepo.getAll();
	}
	
	public Author getbyId(int id) {
		return authorRepo.getById(id);
	}
	
	public Author addAuthor(Author a) {
		//do some validation to make sure author isnt in db
		//or whatver "business logic" youd require
		return authorRepo.add(a);
	}

}