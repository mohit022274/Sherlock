package com.psl.Sherlock.entity;

import java.math.BigDecimal;

public class CreditHistory {
	private String creditHistoryID;
	private String bankName;
	private String branch;
	private double loanAmount;
	private BigDecimal guaranteerID;
	private String credibility;
	private BigDecimal customerID;	
		
	public CreditHistory() {
		//super();
	}

	public CreditHistory(String creditHistoryID, String bankName,
			String branch, double loanAmount, BigDecimal guaranteerID,
			String credibility, BigDecimal customerID) {
		super();
		this.creditHistoryID = creditHistoryID;
		this.bankName = bankName;
		this.branch = branch;
		this.loanAmount = loanAmount;
		this.guaranteerID = guaranteerID;
		this.credibility = credibility;
		this.customerID = customerID;
	}

	public String getCreditHistoryID() {
		return creditHistoryID;
	}

	public void setCreditHistoryID(String creditHistoryID) {
		this.creditHistoryID = creditHistoryID;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public BigDecimal getGuaranteerID() {
		return guaranteerID;
	}

	public void setGuaranteerID(BigDecimal guaranteerID) {
		this.guaranteerID = guaranteerID;
	}

	public String getCredibility() {
		return credibility;
	}

	public void setCredibility(String credibility) {
		this.credibility = credibility;
	}

	public BigDecimal getCustomerID() {
		return customerID;
	}

	public void setCustomerID(BigDecimal customerID) {
		this.customerID = customerID;
	}
}