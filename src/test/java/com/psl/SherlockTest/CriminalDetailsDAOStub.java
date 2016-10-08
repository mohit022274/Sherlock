package com.psl.SherlockTest;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.psl.Sherlock.dao.ICriminalDAO;
import com.psl.Sherlock.entity.Criminal;

public class CriminalDetailsDAOStub implements ICriminalDAO {

	@Override
	public List<Criminal> getCriminalDetails(String id) {
		// TODO Auto-generated method stub
		System.out.println("In criminal details dao stub");
		Criminal criminal=new Criminal(new BigDecimal("1234"), new Date(1000), "Maharashtra", "Pune", "drunk driving", "drive car at full speed",new BigDecimal("5678"), new BigDecimal("1234"));
		List<Criminal> list=new ArrayList<Criminal>();
		list.add(criminal);		
		return list;
	}
}
