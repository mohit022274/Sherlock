package com.psl.Sherlock.dao;

import java.util.List;

import com.psl.Sherlock.entity.Criminal;

public interface ICriminalDAO {
	public List<Criminal> getCriminalDetails(String id);
}
