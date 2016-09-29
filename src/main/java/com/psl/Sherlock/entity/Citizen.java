package com.psl.Sherlock.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Blob;
import java.sql.Date;

public class Citizen {
	private BigDecimal UIN;
	private String f_name;
	private String l_name;
	private String country;
	private Date dob;
	private int height;
	private int weight;
	private String skin_color;
	private String email;
	private Blob fingerPrint;
	private Blob photo;
	private byte[] ph;
	
	public byte[] getPh() {
		return ph;
	}

	public void setPh(byte[] ph) {
		this.ph = ph;
	}

	public Citizen() {
		super();
	}
	
	public Citizen(BigDecimal uIN, String f_name, String l_name,
			String country, Date dob, int height, int weight,
			String skin_color, String email, Blob fingerPrint, Blob photo) {
		super();
		UIN = uIN;
		this.f_name = f_name;
		this.l_name = l_name;
		this.country = country;
		this.dob = dob;
		this.height = height;
		this.weight = weight;
		this.skin_color = skin_color;
		this.email = email;
		this.fingerPrint = fingerPrint;
		this.photo = photo;
	}
	
	public BigDecimal getUIN() {
		return UIN;
	}
	public void setUIN(BigDecimal uIN) {
		UIN = uIN;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getSkin_color() {
		return skin_color;
	}
	public void setSkin_color(String skin_color) {
		this.skin_color = skin_color;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Blob getFingerPrint() {
		return fingerPrint;
	}
	public void setFingerPrint(Blob fingerPrint) {
		this.fingerPrint = fingerPrint;
	}
	public Blob getPhoto() {
		return photo;
	}
	public void setPhoto(Blob photo) {
		this.photo = photo;
	}
}
