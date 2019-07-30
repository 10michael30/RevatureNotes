package com.example.demo;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.PlatformTransactionManager;

import com.revature.repository.IceCreamRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RepositoryTest {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Autowired
	private IceCreamRepository iceCreamRepository;
	
	@Autowired
	private PlatformTransactionManager platformTransactionmanager;
		
	
	
	@Test
	public void iceCreamRepoShouldNotBeNull() {
		assertNotNull(iceCreamRepository);
	}
}