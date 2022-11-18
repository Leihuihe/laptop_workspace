package beans;

public class Student {
	private static final long serialVersionUID = 1L;
	private String firstName = null;
	private String lastName = null;
	int age = 0;
			
	public Student() {}
	
			
			
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
