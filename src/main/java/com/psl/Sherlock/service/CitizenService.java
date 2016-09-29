package com.psl.Sherlock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.psl.Sherlock.dao.ICitizenDAO;
import com.psl.Sherlock.entity.Citizen;

@Component(value="citizen_service")
public class CitizenService {
	
	@Autowired
	ICitizenDAO dao;
	
	public ICitizenDAO getDao() {
		return dao;
	}

	public void setDao(ICitizenDAO dao) {
		this.dao = dao;
	}

	public Citizen getCitizenDetails(String country, String id){
		System.out.println(country+" "+id);
		Citizen citizen=dao.getCitizenDetails(country, id);
		return citizen;
	}
}
