package beans;

import java.security.Timestamp;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerNameKana;
	private String postalCode;
	private String address;
	private Timestamp updateDatetime;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCustomerNameKana() {
		return customerNameKana;
	}

	public void setCustomerNameKana(String customerNameKana) {
		this.customerNameKana = customerNameKana;
	}

	public Timestamp getUpdateDatetime() {
		return updateDatetime;
	}

	public void setUpdateDatetime(Timestamp updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


}
