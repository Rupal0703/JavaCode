package oct7;

import java.util.Scanner;
public class TableOfANumber {

	int a;
	 public void printTableOfNumber(){
		 int sum;
		 for(int i=1;i<=10;i++) {
			 sum = a*i;
			 System.out.println(a+" X "+i+" = "+sum);
		 }
	 }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number here.");
		int x  = sc.nextInt();
		sc.close();
		
		TableOfANumber obj = new TableOfANumber();
		obj.a = x;
		obj.printTableOfNumber();

	}

}
