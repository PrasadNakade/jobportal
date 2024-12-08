package com.example.jobportal.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String email;
	long mobile;
	String password;
	 double per10;
	 double per12;
	 double perGrad;
	 int year10;
	 int year12;
	 int yearGrad;
	 Date birthDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getPer10() {
		return per10;
	}
	public void setPer10(double per10) {
		this.per10 = per10;
	}
	public double getPer12() {
		return per12;
	}
	public void setPer12(double per12) {
		this.per12 = per12;
	}
	public double getPerGrad() {
		return perGrad;
	}
	public void setPerGrad(double perGrad) {
		this.perGrad = perGrad;
	}
	public int getYear10() {
		return year10;
	}
	public void setYear10(int year10) {
		this.year10 = year10;
	}
	public int getYear12() {
		return year12;
	}
	public void setYear12(int year12) {
		this.year12 = year12;
	}
	public int getYearGrad() {
		return yearGrad;
	}
	public void setYearGrad(int yearGrad) {
		this.yearGrad = yearGrad;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", per10=" + per10 + ", per12=" + per12 + ", perGrad=" + perGrad + ", year10=" + year10
				+ ", year12=" + year12 + ", yearGrad=" + yearGrad + ", birthDate=" + birthDate + "]";
	}
	public User(int id, String name, String email, long mobile, String password, double per10, double per12,
			double perGrad, int year10, int year12, int yearGrad, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.per10 = per10;
		this.per12 = per12;
		this.perGrad = perGrad;
		this.year10 = year10;
		this.year12 = year12;
		this.yearGrad = yearGrad;
		this.birthDate = birthDate;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	 
	 
	 
}