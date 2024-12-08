package com.example.jobportal.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Recuiter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String name;
	String email;
	long mobile;
	String password;
	String companyName;
	String address;
	int numberOfEmployees;
	String companyContactDetails;
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public String getCompanyContactDetails() {
		return companyContactDetails;
	}
	public void setCompanyContactDetails(String companyContactDetails) {
		this.companyContactDetails = companyContactDetails;
	}
	@Override
	public String toString() {
		return "Recuiter [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", companyName=" + companyName + ", address=" + address + ", numberOfEmployees="
				+ numberOfEmployees + ", companyContactDetails=" + companyContactDetails + "]";
	}
	public Recuiter(int id, String name, String email, long mobile, String password, String companyName, String address,
			int numberOfEmployees, String companyContactDetails) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.companyName = companyName;
		this.address = address;
		this.numberOfEmployees = numberOfEmployees;
		this.companyContactDetails = companyContactDetails;
	}
	public Recuiter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}