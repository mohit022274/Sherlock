package com.psl.Sherlock.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.psl.Sherlock.entity.Criminal;


@Component(value="criminalDAO")
public class CriminalDAOImpl implements ICriminalDAO {
	
	@Autowired
	private JdbcTemplate template;	
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<Criminal> getCriminalDetails(String id) {
		// TODO Auto-generated method stub
		
		List<Criminal> criminal=template.query("select * from criminal_record where criminalID="+id, new RowMapper<Criminal>(){
			@Override
			public Criminal mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
					Criminal criminal=new Criminal();
					
					criminal.setCrimeId(rs.getBigDecimal("crime_ID"));
					criminal.setDateAndTime(rs.getDate("date&time"));
					criminal.setState(rs.getString("state"));
					criminal.setDistrict(rs.getString("district"));
					criminal.setNatureOfCrime(rs.getString("natureOfCrime"));
					criminal.setDescription(rs.getString("description"));
					criminal.setWitnessId(rs.getBigDecimal("witnessID"));
					criminal.setCriminalId(rs.getBigDecimal("criminalID"));
										
					return criminal;			
				}
			});
		return criminal;
	}
}
