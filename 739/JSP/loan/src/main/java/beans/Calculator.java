package beans;

public class Calculator {
	private double amount;
	private double interest;
	private double period;
	
	
	
	public Calculator() {
		super();
	}
	public Calculator(double amount, double interest, double period) {
		super();
		this.amount = amount;
		this.interest = interest;
		this.period = period;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public double getPeriod() {
		return period;
	}
	public void setPeriod(double period) {
		this.period = period;
	}
	
	
}
