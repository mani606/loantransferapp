package com.fund.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.catalina.User;

@Entity
@Table(name="userreg")
public class UserRegistration {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String firstname;
	 private String lastname;
	 private String email;
	 private Long phonenumber;
	 private Long Pannumber;
	 
	 public UserRegistration() {
		super();
	}
	 
	

	public UserRegistration(Long id, String firstname, String lastname, String email, Long phonenumber,
			Long pannumber) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phonenumber = phonenumber;
		Pannumber = pannumber;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Long getPannumber() {
		return Pannumber;
	}
	public void setPannumber(Long pannumber) {
		Pannumber = pannumber;
	}



	@Override
	public String toString() {
		return "UserRegistration [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", phonenumber=" + phonenumber + ", Pannumber=" + Pannumber + "]";
	}

	
}
