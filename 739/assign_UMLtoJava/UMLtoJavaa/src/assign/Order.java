package assign;

import java.util.Vector;

public class Order {
	private String date;
	private String status;
//	private Item item1;
//	private Item item2;
	
	private Vector<Item> items = new Vector<Item>();
	
//	public Order(String date, String status) {
//		super();
//		this.date = date;
//		this.status = status;
//		this.item1 = new Item();  //this could be has-a or aggregation
//		this.item2 = new Item();
//	}
	public void Cancel() {
		
	}
	public void Process() {
		this.CreateItem();
		for(Item item: items)
		{
			item.Process();
		}
	}
	public void CreateItem() {
		Item item1 = new Item();
		Item item2 = new Item();
		this.items.add(item1);
		this.items.add(item2);
	}
	public void UpdateItem() {
		
	}
	public void DeleteItem() {
		
	}
	
	
}
