package com.ebugtracker.customer.services;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ebugtracker.customer.entity.Bug;
import com.ebugtracker.customer.entity.Customer;
import com.ebugtracker.customer.dao.IBugRepository;
import com.ebugtracker.customer.dao.ICustomerRepository;
import com.ebugtracker.customer.service.BugServiceImpl;


	@RunWith(SpringRunner.class)
	@SpringBootTest

	public class CustomerServiceTest {
		
	@MockBean
	private ICustomerRepository repo;
	
	private IBugRepository bgs;
	
	private BugServiceImpl cts;
	
	Bug bug = new Bug();

	Customer customer = new Customer();

	


	 @Test
	void testName() {
	customer.setCustomerName("Vishnu");
	assertNotNull(customer.getCustomerName());
	}
	
	
		
		
		
		@Test
		void testSnippet() {
			bug.setSnippet("error code");
		assertNotNull(bug.getSnippet());
		}
		
		@Test
		void testRemedy() {
			bug.setRemedy("solution");
		assertNotNull(bug.getRemedy());
		}

		
}

