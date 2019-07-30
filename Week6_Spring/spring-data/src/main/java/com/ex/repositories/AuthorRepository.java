package com.ex.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ex.beans.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer>{

	
	public  List<Author> findByfirstName(String firstName);
	
	//look up jpa repository this is not needed because theres a like method that
	//exists already
	@Query("Select a from author a where LOWER(a.bio) like LOWER(%:bio%")
	public List <Author> findByBio(@Param("bio")String keywords);
}