package com.techbee.registrationTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.techbee.registration.Customer;

public class CustomerTest {


	Customer user= new Customer();
	@Before
	public void setUp() throws Exception {
		Customer user= new Customer();
	}

	

	@Test
	public void testGetFirstName() {
		Customer user1= new Customer("hass", "elh", 929334812 , "kjkjjjss@ll.com", "elhakjkjkjkjkjkkkk", 33);
		
        assertEquals("hass",user1.getFirstName());
	}


	@Test
	public void testSetEmailAdress() {
	
		Customer user= new Customer();
        assertEquals(true,user.setEmailAdress("tytyt@"));
        assertEquals(false,user.setEmailAdress("tytyt"));

	}
    
	@Test
	public void testSetEmailAdressWrong() {
		Customer user= new Customer();

        assertEquals(false,user.setEmailAdress("tytyt"));

	}
	@Test
	public void testGetAge20() {
		Customer user= new Customer();

        assertEquals(true,user.setAge(20));

	}
	@Test
	public void testGetAge12() {
		Customer user= new Customer();

        assertEquals(false,user.setAge(12));

	}
	@After
	public void tearDown() throws Exception {
		user=null;
	}

}
