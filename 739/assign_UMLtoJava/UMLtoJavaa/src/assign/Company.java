package assign;

public class Company extends Customer{
	private String name;
	private String regno;
	public Company(String address, String phone) {
		super(address, phone);
		// TODO Auto-generated constructor stub
	}
	public Company(String address, String phone,String name, String regno) {
		super(address, phone);
		this.name = name;
		this.regno = regno;
		}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
  
	
}
