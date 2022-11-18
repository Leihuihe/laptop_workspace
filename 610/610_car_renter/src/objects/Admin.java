package objects;

public class Admin {

	String admin_id;
	
	Adjuster adjuster;
	User user;
	
	public void set_up_an_account()
	{
		user.contact_details();
	}
	
	public void register_vehicle()
	{
		adjuster.register_user_vehicle();
	}
	
	public void vehicle_availability_dates()
	{
		user.available_for_rent();
	}
}
