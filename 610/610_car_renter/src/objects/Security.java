package objects;

public class Security {

	String sid;
	
	User user;
	Adjuster adjuster;
	
	public void inspect_user_vehicle()
	{
		user.show_your_vehicle();
		adjuster.vehicle_inspection_is_completed();
	}
}
