package crudcollectionswithuserdefinedobjectsarraylist;

public class Customer {
	private String customerId;
	private String customerName;
	private String customerEmail;
	private int customerPhone;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerId, String customerName,String customerEmail, int customerPhone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
	}

	

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public int getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(int customerPhone) {
		this.customerPhone = customerPhone;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPhone=" + customerPhone + "]";
	}
	

}
