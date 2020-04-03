package com.fund.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paylist")
public class PayeeList {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private int uid;
	private Date transactiondate;
	private  Long transactionamount;
	private String  transferdeatils;
  //  private UserRegistration userregistration;
	
    
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public Date getTransactiondate() {
		return transactiondate;
	}
	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
	}
	public Long getTransactionamount() {
		return transactionamount;
	}
	public void setTransactionamount(Long transactionamount) {
		this.transactionamount = transactionamount;
	}
	public String getTransferdeatils() {
		return transferdeatils;
	}
	public void setTransferdeatils(String transferdeatils) {
		this.transferdeatils = transferdeatils;
	}
//	public UserRegistration getUserregistration() {
//		return userregistration;
//	}
//	public void setUserregistration(UserRegistration userregistration) {
//		this.userregistration = userregistration;
//	}
//	@Override
//	public String toString() {
//		return "PayeeList [pid=" + pid + ", uid=" + uid + ", transactiondate=" + transactiondate
//				+ ", transactionamount=" + transactionamount + ", transferdeatils=" + transferdeatils
//				+ ", userregistration=" + userregistration + "]";
//	}
   
}
