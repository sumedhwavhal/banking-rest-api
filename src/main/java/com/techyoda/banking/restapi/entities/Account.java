package com.techyoda.banking.restapi.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountId;
	@ManyToOne(targetEntity = AccountType.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "account_type_code")
	private AccountType accountType;
	private int balance;
	private Date dateOpened;
	@ManyToOne(targetEntity = Customer.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private Customer customer;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Date getDateOpened() {
		return dateOpened;
	}

	public void setDateOpened(Date dateOpened) {
		this.dateOpened = dateOpened;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", balance=" + balance
				+ ", dateOpened=" + dateOpened + ", customer=" + customer + "]";
	}

}
