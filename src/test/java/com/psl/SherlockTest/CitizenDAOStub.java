package com.psl.SherlockTest;

import java.math.BigDecimal;
import java.sql.Date;

import com.psl.Sherlock.dao.ICitizenDAO;
import com.psl.Sherlock.entity.Citizen;

public class CitizenDAOStub implements ICitizenDAO {

	@Override
	public Citizen getCitizenDetails(String id) {
		// TODO Auto-generated method stub
		System.out.println("In citizen DAO stub");
		Citizen citizen=new Citizen();
		citizen.setUIN(new BigDecimal(1234567890));
		citizen.setF_name("ABD");
		citizen.setL_name("XYZ");
		citizen.setCountry("INDIA");
		citizen.setDob(new Date(10000));
		citizen.setHeight(165);
		citizen.setWeight(72);
		citizen.setSkin_color("fair");
		citizen.setEmail("abc@xyz.com");
		return citizen;
	}
}
