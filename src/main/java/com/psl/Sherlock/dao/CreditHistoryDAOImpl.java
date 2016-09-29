package com.psl.Sherlock.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.psl.Sherlock.entity.CreditHistory;

@Component(value="creditHistoryDAO")
public class CreditHistoryDAOImpl implements ICreditHistoryDAO {

	@Autowired
	private JdbcTemplate template;	
	
	public JdbcTemplate getTemplate() {
		return template;
	}



	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	@Override
	public List<CreditHistory> getCreditHistoryDetails(String country, String id) {
		
		// TODO Auto-generated method stub
		
		List<CreditHistory> credithistory=template.query("select * from "+country+"_credit_history where CustomerID="+id, new RowMapper<CreditHistory>(){

				@Override
		public CreditHistory mapRow(ResultSet rs, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			CreditHistory credithistory=new CreditHistory();
			
			credithistory.setCreditHistoryID(rs.getString("CreditHistoryID"));
			credithistory.setBankName(rs.getString("BankName"));
			credithistory.setBranch(rs.getString("Branch"));
			credithistory.setLoanAmount(rs.getDouble("Loan Amount"));
			credithistory.setGuaranteerID(rs.getBigDecimal("GuaranteerID"));
			credithistory.setCredibility(rs.getString("Credibility"));
			credithistory.setCustomerID(rs.getBigDecimal("CustomerID"));
			
			return credithistory;
		
			}
		});
	
		return credithistory;
	}
}
