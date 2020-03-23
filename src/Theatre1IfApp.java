import java.util.*;
public class Theatre1IfApp {

	public static void main(String[] args) {
		// declare a variable to store the day entered by the user
		String day;
        // declare a variable named t and create an object of type Theatre1If
		Theatre1If t = new Theatre1If();
        
		// create an object of type Scanner to allow input from the keyboard
		Scanner sc = new Scanner(System.in);
        
		// input
        // prompt the user to input a day
		System.out.println("Please enter the day: ");
        
		// reads a single word from the keyboard
		day = sc.next();
        
		// use (i.e. by calling/invoking) the setter method setDay()
        // to store in the instance variable named day of the object t the day provided by the user
        t.setDay(day);
		
		// processing: calculate the price of a ticket in the given day
        t.showThePrice();
		
		// output
        // invoke/call the getter method getPrice() to retrieve the cost of the ticket
        int tPrice1 = t.getPrice1();
    	int tPrice2 = t.getPrice2();
        
		// it is not mandatory, but we can display a user friendly message in case that the day is not valid,
        // and therefore there is a negative value in the p variable
        // (recall that the calculatePrice() method of the Theatre1If class assigns/stores in the price instance variable if the day is invalid)
    }

}
