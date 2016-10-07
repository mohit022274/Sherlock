package com.psl.SherlockTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.psl.Sherlock.service.CitizenService;
import com.psl.Sherlock.service.CreditHistoryService;
import com.psl.Sherlock.service.CriminalDetailsService;


@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="SpringDispatcherTest-servlet.xml")
public class SherlockTest {	

	@Autowired
	CitizenService citizen;
	
	@Autowired
	CriminalDetailsService  criminal;
	
	@Autowired
	CreditHistoryService ch;	

	
	@Test
	public void getCitizenDetailsTest(){
		System.out.println(".........................Testing CitizenDetails Module...........................");
		assertEquals("class com.psl.Sherlock.service.CitizenService", citizen.getClass().toString());
	}

	@Test
	public void getCriminalDetailsTest(){
		System.out.println(".........................Testing CriminalDetails Module...........................");
		assertEquals("class com.psl.Sherlock.service.CriminalDetailsService", criminal.getClass().toString());
	}
	
	@Test
	public void getCreditHistoryDetailsTest(){
		System.out.println(".........................Testing CeditHistoryDetails Module...........................");
		assertEquals("class com.psl.Sherlock.service.CreditHistoryService", ch.getClass().toString());
	}	
}
