package oct7;

import java.util.Scanner;

public class PrimeNumber {

	int numberEntered;
	boolean bool=true;
	
	public void calculatePrimeNumber() {
			for(int i=2;i<numberEntered;i++) {
			if(numberEntered%i==0) {
				bool = false;
				break;
			}
			}
	}
	
	public void printingResult() {
		if(!bool) {
			System.out.println(numberEntered+" is a Composite Number");
		}
		else {
			System.out.println(numberEntered+" is a Prime Number");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number here.");
		int a = sc.nextInt();
		sc.close();
		
		PrimeNumber obj1 = new PrimeNumber();
		obj1.numberEntered = a;
		obj1.calculatePrimeNumber();
		obj1.printingResult();
		/*if(!obj1.bool) {
			System.out.println(a+" is a Composite Number");
		}
		else {
			System.out.println(a+" is a Prime Number");
		}*/
		
	}

}
