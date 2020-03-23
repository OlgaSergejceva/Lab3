import java.util.Scanner;
public class Theatre1SwitchApp {

	public static void main(String[] args) {
		// declare a variable to store the day entered by the user
		String day;
		
		Theatre1Switch t = new Theatre1Switch();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the day: ");
		day = sc.next();
		
		t.setDay(day);
		t.showThePrice(day);
		
		int tPrice1 = t.getPrice1();
    	int tPrice2 = t.getPrice2();
		
	}

}
