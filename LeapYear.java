package oct13thassignment;
import java.util.Scanner;

public class LeapYear {

	int year;
	
	public void calculateYear() {
		if(year%4==0) {
			System.out.println(year+" is a leap year.");
		}
		else {
			System.out.println(year+ " is not a leap year.");
		}
		
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a year:");
		int year = sc.nextInt();
		sc.close();
		
		LeapYear lp = new LeapYear();
		lp.year = year;
		lp.calculateYear();

	}

}
