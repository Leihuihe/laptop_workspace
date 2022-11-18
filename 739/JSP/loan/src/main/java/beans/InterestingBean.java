package beans;

public class InterestingBean {

    double amount; 
    double interest;
    double simpleInterestResult;
    double compoundInterestResult;
    int period;
    
    public double getSimpleInterestResult() {
        simpleInterestResult = calculateSimple();
        return simpleInterestResult;
    }
    
    public double getcompoundInterestResult() {
    	compoundInterestResult = calculateCompound(this.amount,this.interest,this.period);
        return compoundInterestResult;
    }


    public void setSimpleInterestResult(double simpleInterestResult) {
        this.simpleInterestResult = simpleInterestResult;
    }


      public void setCompoundInterestResult(double compoundInterestResult) {
        this.compoundInterestResult = compoundInterestResult;
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


    public int getPeriod() {
        return period;
    }


    public void setPeriod(int period) {
        this.period = period;
    }

 

     public double calculateSimple() {
            if(amount <= 0) {
              throw new IllegalArgumentException("Amount should be greater than 0: " + amount);
            }
            if(interest <= 0) {
              throw new IllegalArgumentException("Interest should be greater than 0: " + interest);
            }
            if(period <= 0) {
              throw new IllegalArgumentException("Period should be greater than 0: " + period);
            }
            return amount*(1 + period*interest/100);
      }
     public double calculateCompound(double amount, double interest, int period)
     {
    	 if(amount <= 0) {
   	      throw new IllegalArgumentException("Amount should be greater than 0: " + amount);
   	    }
   	    if(interest <= 0) {
   	      throw new IllegalArgumentException("Interest should be greater than 0: " + interest);
   	    }
   	    if(period <= 0) {
   	      throw new IllegalArgumentException("Period should be greater than 0: " + period);
   	    }
   	    return amount*Math.pow(1 + interest/100, period);
     }
     
}