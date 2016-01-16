package com.mps.bean;

import java.util.Date;

public class Transaction {
	
	private int transactionId;
	private int customerId;
	private Date transactionDate;
	private float transactionAmount;
	private float netBalance;
	public Transaction() {
		super();
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public float getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public float getNetBalance() {
		return netBalance;
	}
	public void setNetBalance(float netBalance) {
		this.netBalance = netBalance;
	}
	
	

}
