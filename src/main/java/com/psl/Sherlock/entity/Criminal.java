package com.psl.Sherlock.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class Criminal {
	private BigDecimal crimeId;
	private Date dateAndTime;
	private String state;
	private String district;
	private String natureOfCrime;
	private String description;
	private BigDecimal witnessId;
	private BigDecimal criminalId;
	
		
	public Criminal() {
		//super();
	}


	public Criminal(BigDecimal crimeId, Date dateAndTime, String state,
			String district, String natureOfCrime, String description,
			BigDecimal witnessId, BigDecimal criminalId) {
		super();
		this.crimeId = crimeId;
		this.dateAndTime = dateAndTime;
		this.state = state;
		this.district = district;
		this.natureOfCrime = natureOfCrime;
		this.description = description;
		this.witnessId = witnessId;
		this.criminalId = criminalId;
	}


	public BigDecimal getCrimeId() {
		return crimeId;
	}


	public void setCrimeId(BigDecimal crimeId) {
		this.crimeId = crimeId;
	}


	public Date getDateAndTime() {
		return dateAndTime;
	}


	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getNatureOfCrime() {
		return natureOfCrime;
	}


	public void setNatureOfCrime(String natureOfCrime) {
		this.natureOfCrime = natureOfCrime;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public BigDecimal getWitnessId() {
		return witnessId;
	}


	public void setWitnessId(BigDecimal witnessId) {
		this.witnessId = witnessId;
	}


	public BigDecimal getCriminalId() {
		return criminalId;
	}


	public void setCriminalId(BigDecimal criminalId) {
		this.criminalId = criminalId;
	}
	
}