package com.psl.Sherlock.dao;

import java.io.File;
//<<<<<<< HEAD
import java.io.FileOutputStream;
import java.io.IOException;
//=======
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//>>>>>>> 64eb55b7a976df214aabd42746c11928713e9dfc
import java.io.InputStream;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.psl.Sherlock.entity.Citizen;

@Component(value="citizenDAO")
public class CitizenDAOImpl implements ICitizenDAO {

	@Autowired
	private JdbcTemplate template;	
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public Citizen getCitizenDetails(String id) {
		// TODO Auto-generated method stub
		Citizen citizen=(Citizen)template.queryForObject("select * from person where UIN="+id, new RowMapper<Citizen>(){

			@Override
			public Citizen mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Citizen citizen=new Citizen();
				citizen.setUIN(rs.getBigDecimal("UIN"));
				citizen.setF_name(rs.getString("f_name"));
				citizen.setL_name(rs.getString("l_name"));
				citizen.setCountry(rs.getString("country"));
				citizen.setDob(rs.getDate("dob"));
				citizen.setHeight(rs.getInt("height"));
				citizen.setWeight(rs.getInt("weight"));
				citizen.setSkin_color(rs.getString("skin_color"));
				citizen.setEmail(rs.getString("email"));
				citizen.setFingerPrint(rs.getBlob("fingerprint"));
				
				return citizen;
			}});
		
		return citizen;
		
	}
	

}
