
public class Theatre1Switch {

	// declare a variable to store the day entered by the user
	String day;
	
	// declare instance variable to store the price of a ticket based on the given day
	private int price1 = 20;
	private int price2 = 30;
	
	// Constructor
	public Theatre1Switch() {
	}
	
	// declare a setter method for each of the instance variables that can be set/ assigned a value
    // setter method for the day instance variable
    		public void setDay(String day) {
    		this.day = day;
    		}
			
	// declare a getter method for each of the instance variables
    		public int getPrice1() {
    			return price1;
    		}
    		public int getPrice2() {
    			return price2;
    		}	
    
    // the method which does the actual processing: based on a given day determines the price of the ticket
    		public void showThePrice(String day) {
    		switch (day.toLowerCase()) {  
  		  		case "monday":
  		  		case "tuesday":
  		  		case "wednesday":
  		  		case "thursday":
            System.out.println("The price will be " + price1 + " EUR");
            break;
        
  		  		case "friday":
  		  		case "saturday":
  		  		case "sunday":
        	System.out.println("The price will be " + price2 + " EUR");
            break;
  		  		default:
            System.out.println("Please correct your input!");	
    		}
	
}
}
