package beans;

import java.security.Timestamp;

public class Inquiry {
	private int inquiryId;
	private int customerId;
	private int itemId;
	private Timestamp inquiryDatetime;
	private String inquiryContents;
	private String replyContents;
	private String statusCode;
	private Timestamp updateDatetime;

	private String itemName;
	private int itemPrice;

	private String statusName;

	private String customerName;


	public int getInquiryId() {
		return inquiryId;
	}

	public void setInquiryId(int inquiryId) {
		this.inquiryId = inquiryId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public Timestamp getInquiryDatetime() {
		return inquiryDatetime;
	}

	public void setInquiryDatetime(Timestamp inquiryDatetime) {
		this.inquiryDatetime = inquiryDatetime;
	}

	public String getInquiryContents() {
		return inquiryContents;
	}

	public void setInquiryContents(String inquiryContents) {
		this.inquiryContents = inquiryContents;
	}

	public String getReplyContents() {
		return replyContents;
	}

	public void setReplyContents(String replyContents) {
		this.replyContents = replyContents;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Timestamp getUpdateDatetime() {
		return updateDatetime;
	}

	public void setUpdateDatetime(Timestamp updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}




}
