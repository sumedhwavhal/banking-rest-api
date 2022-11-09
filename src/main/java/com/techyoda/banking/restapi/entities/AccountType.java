package com.techyoda.banking.restapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_type")
public class AccountType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountTypeCode;
	private String accountTypeDescription;

	public int getAccountTypeCode() {
		return accountTypeCode;
	}

	public void setAccountTypeCode(int accountTypeCode) {
		this.accountTypeCode = accountTypeCode;
	}

	public String getAccountTypeDescription() {
		return accountTypeDescription;
	}

	public void setAccountTypeDescription(String accountTypeDescription) {
		this.accountTypeDescription = accountTypeDescription;
	}

	@Override
	public String toString() {
		return "AccountType [accountTypeCode=" + accountTypeCode + ", accountTypeDescription=" + accountTypeDescription
				+ "]";
	}

}
