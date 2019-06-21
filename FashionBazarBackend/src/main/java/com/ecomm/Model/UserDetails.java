package com.ecomm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserDetails {
	
	@Id
	
	String userName;
	String password;
	String emailId;
	String customerName;
	String address;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	@Column(nullable = false, columnDefinition = "TINYINT", length = 1)
	boolean enabled;
	String role;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserDetails [userName=" + userName + ", password=" + password + ", emailId=" + emailId
				+ ", customerName=" + customerName + ", address=" + address + ", enabled=" + enabled + ", role=" + role
				+ "]";
	}
	
	
}
	
	