package oct4;

import java.util.Scanner;
public class CalculateOddOrEven {

	
	int numberentered;
	
	public void calculateEvenOdd() {
		
		if (numberentered%2==0) {
			System.out.println("The number you entered is Even.");
		}
		else {
			System.out.println("The number you entered is Odd.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number here.");
	    int i= sc.nextInt();
		
		sc.close();
		
		CalculateOddOrEven obj1 = new CalculateOddOrEven();
	    obj1.numberentered = i;
	    obj1.calculateEvenOdd();
	}

}
