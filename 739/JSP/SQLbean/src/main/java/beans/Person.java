package beans;

public class Person {
	public string name;
	public int age = 0;
	public double phoneNumber;
	public string emailAddress;
	private Address address;
	
	public boolean hasParkingPass()
	{
		return false;
	}

	public string getName() {
		return name;
	}

	public void setName(string name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public string getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(string emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
