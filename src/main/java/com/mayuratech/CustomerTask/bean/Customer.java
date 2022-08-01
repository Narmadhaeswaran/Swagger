package com.mayuratech.CustomerTask.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customers")
public class Customer {

	
	@Id
	@Column
	private String Customerid;
	
	@Column
	private String Companyname;
	
	@Column
	private String Contactname;
	
	@Column
	private String Contacttitle;
	
	@Column
	private String Address;
	
	@Column
	private String city;
	
	@Column
	private String Region;
	
	@Column
	private String Postalcode;
	
	@Column
	private String Country;
	
	@Column
	private String Phone;
	
	@Column
	private String Fax;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerid, String companyname, String contactname, String contacttitle, String address,
			String city, String region, String postalcode, String country, String phone, String fax) {
		super();
		Customerid = customerid;
		Companyname = companyname;
		Contactname = contactname;
		Contacttitle = contacttitle;
		Address = address;
		this.city = city;
		Region = region;
		Postalcode = postalcode;
		Country = country;
		Phone = phone;
		Fax = fax;
	}

	public String getCustomerid() {
		return Customerid;
	}

	public void setCustomerid(String customerid) {
		Customerid = customerid;
	}

	public String getCompanyname() {
		return Companyname;
	}

	public void setCompanyname(String companyname) {
		Companyname = companyname;
	}

	public String getContactname() {
		return Contactname;
	}

	public void setContactname(String contactname) {
		Contactname = contactname;
	}

	public String getContacttitle() {
		return Contacttitle;
	}

	public void setContacttitle(String contacttitle) {
		Contacttitle = contacttitle;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public String getPostalcode() {
		return Postalcode;
	}

	public void setPostalcode(String postalcode) {
		Postalcode = postalcode;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		Fax = fax;
	}

}
