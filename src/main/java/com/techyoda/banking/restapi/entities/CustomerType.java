package com.techyoda.banking.restapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_type")
public class CustomerType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_type_code")
	private String customerTypeCode;
	private String customerTypeDescription;

	public String getCustomerTypeCode() {
		return customerTypeCode;
	}

	public void setCustomerTypeCode(String customerTypeCode) {
		this.customerTypeCode = customerTypeCode;
	}

	public String getCustomerTypeDescription() {
		return customerTypeDescription;
	}

	public void setCustomerTypeDescription(String customerTypeDescription) {
		this.customerTypeDescription = customerTypeDescription;
	}

	@Override
	public String toString() {
		return "CustomerType [customerTypeCode=" + customerTypeCode + ", customerTypeDescription="
				+ customerTypeDescription + "]";
	}

}
