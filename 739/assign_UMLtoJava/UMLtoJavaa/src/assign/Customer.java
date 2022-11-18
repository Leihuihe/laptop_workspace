package assign;

import java.util.ArrayList;

public abstract class Customer {
	private String address;
	private String phone;
	private ArrayList<Order> orders;
	abstract public void update();
	
	
	public Customer(String address, String phone) {
		this.address=address;
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}
