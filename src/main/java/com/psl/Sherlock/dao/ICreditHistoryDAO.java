package com.psl.Sherlock.dao;

import java.util.List;

import com.psl.Sherlock.entity.CreditHistory;

public interface ICreditHistoryDAO {
	public List<CreditHistory> getCreditHistoryDetails(String id);
}
