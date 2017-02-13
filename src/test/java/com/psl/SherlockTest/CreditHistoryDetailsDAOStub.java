package com.psl.SherlockTest;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.psl.Sherlock.dao.ICreditHistoryDAO;
import com.psl.Sherlock.entity.CreditHistory;

public class CreditHistoryDetailsDAOStub implements ICreditHistoryDAO {

	@Override
	public List<CreditHistory> getCreditHistoryDetails(String id) {
		// TODO Auto-generated method stub
		
		System.out.println("In credit history details dao stub");
		CreditHistory creditHistory=new CreditHistory("5678","SBI", "Hinjewadi",(double)200000,new BigDecimal(789), "Good", new BigDecimal(1234));

		List<CreditHistory> list=new ArrayList<CreditHistory>();
		list.add(creditHistory);
		return list;
	}

}
