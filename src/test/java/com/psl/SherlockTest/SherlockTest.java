package com.psl.SherlockTest;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.psl.Sherlock.dao.ICitizenDAO;
import com.psl.Sherlock.dao.ICreditHistoryDAO;
import com.psl.Sherlock.dao.ICriminalDAO;


@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "SpringDispatcherTest-servlet.xml")
public class SherlockTest {	

	@Autowired
	ICitizenDAO dao;
	
	@Autowired
	ICriminalDAO criminalDAO;
	
	@Autowired
	ICreditHistoryDAO credtD_DAO;
	
	@Test
	public void getCitizenDetailsTest(){
		System.out.println(".........................Testing CitizenDetails Module...........................");
		
		assertEquals("class com.psl.Sherlock.entity.Citizen", dao.getCitizenDetails("1234").getClass().toString());
		assertTrue(dao.getCitizenDetails("12345").getUIN()!=null);
	}

	@Test
	public void getCriminalDetailsTest(){
		System.out.println(".........................Testing CriminalDetails Module...........................");
		
		assertTrue(criminalDAO.getCriminalDetails("1234").size()>0);
		assertTrue(criminalDAO.getCriminalDetails("1234").get(0).getCrimeId()!=new BigDecimal("0"));
	}
	
	@Test
	public void getCreditHistoryDetailsTest(){
		System.out.println(".........................Testing CeditHistoryDetails Module...........................");

		assertEquals(1, credtD_DAO.getCreditHistoryDetails("123").size());
		assertTrue(credtD_DAO.getCreditHistoryDetails("123").get(0).getCreditHistoryID()!=null);
	}
}