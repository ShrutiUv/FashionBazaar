package com.ecomm.Model;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Address {
	
	@Id
	@GeneratedValue
	private int addressId;
	
	private String addressName;   
	private String mobileNumber;
	private String address;
	
	private String city;
	private int pincode;
	private String landmark;
	private String state;
	private String country="India";
	
	@OneToOne(cascade=CascadeType.PERSIST)  
    @JoinColumn(name="username")  
   	private UserDetails user;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public UserDetails getUser() {
		return user;
	}

	public void setUser(UserDetails user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressName=" + addressName + ", mobileNumber=" + mobileNumber
				+ ", addressL1=" + address + ", addressL2=" + ", city=" + city + ", pincode=" + pincode
				+ ", landmark=" + landmark + ", state=" + state + ", country=" + country + ", user=" + user + "]";
	}
	

}
