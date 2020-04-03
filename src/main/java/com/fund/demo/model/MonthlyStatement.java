package com.fund.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="montstate")
public class MonthlyStatement {
	
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	
	private int mid;
	private int uid;
	private Long accountnumber;
	private Date date;
	private int debitamount;
	private int creditamount;
	//@ManyToOne(cascade=CascadeType.ALL)  
	//private UserRegistration  userregistration;
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public Long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(Long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getDebitamount() {
		return debitamount;
	}
	public void setDebitamount(int debitamount) {
		this.debitamount = debitamount;
	}
	public int getCreditamount() {
		return creditamount;
	}
	public void setCreditamount(int creditamount) {
		this.creditamount = creditamount;
	}
//	public UserRegistration getUserregistration() {
//		return userregistration;
//	}
//	public void setUserregistration(UserRegistration userregistration) {
//		this.userregistration = userregistration;
//	}
//	@Override
//	public String toString() {
//		return "MonthlyStatement [mid=" + mid + ", uid=" + uid + ", accountnumber=" + accountnumber + ", date=" + date
//				+ ", debitamount=" + debitamount + ", creditamount=" + creditamount + ", userregistration="
//				+ userregistration + "]";
//	}

}
