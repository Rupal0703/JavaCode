package oct12thassignment;

import java.util.Scanner;

public class SumOfDigitsOfANumber {

	int number,lenghtOfNumber;
	int rem,sum=0;
	//int[] arr = new int[lenghtOfNumber-1];
	
	public void calculateSumOfNumber() {
		
		for(int i=0;i<lenghtOfNumber;i++) {
			rem = number%10;
			number = (number-rem)/10;
			sum =sum+rem;
			//arr[lenghtOfNumber-i] = rem;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to calculate sum of its digit:" );
		int num = sc.nextInt();
		sc.close();
		
		SumOfDigitsOfANumber obj1 = new SumOfDigitsOfANumber();
		obj1.number = num;
		String str= String.valueOf(num);
		obj1.lenghtOfNumber = str.length();
		obj1.calculateSumOfNumber();
		/*for (int i=0;i<obj1.lenghtOfNumber;i++) {
			System.out.println("The digits of the number entered are: ");
			System.out.print(obj1.arr[i]+" ");
		}
		*/
		System.out.println("The sum of digits of the number entered = "+obj1.sum);
		
		
		
	

	}

}
