package com.psl.Sherlock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.psl.Sherlock.dao.ICriminalDAO;
import com.psl.Sherlock.entity.Criminal;

@Component(value="criminal_details_service")
public class CriminalDetailsService {
	@Autowired
	ICriminalDAO dao;
	
	public ICriminalDAO getDao() {
		return dao;
	}

	public void setDao(ICriminalDAO dao) {
		this.dao = dao;
	}

	public List<Criminal> getCriminalDetails(String id){
		return dao.getCriminalDetails(id);
	}
}
