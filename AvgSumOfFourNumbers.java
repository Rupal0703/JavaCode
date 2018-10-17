package oct10assignment;

import java.util.Scanner;

public class AvgSumOfFourNumbers {

	int a,b,c,d;
	int avg,sum;
	
	public int FindSum() {
		sum = a+b+c+d;
		return sum;
	}
	
	public int FindAvg() {
		avg = (a+b+c+d)/4;
		return avg;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		int w = sc.nextInt();
		System.out.println("Please enter 2nd number");
		int x = sc.nextInt();
		System.out.println("Please enter 3rd number");
		int y = sc.nextInt();
		System.out.println("Please enter 4th number");
		int z = sc.nextInt();
		sc.close();
		
		
		AvgSumOfFourNumbers obj1 = new AvgSumOfFourNumbers();
		obj1.a=w;
		obj1.b=x;
		obj1.c=y;
		obj1.d=z;
		
		obj1.FindAvg();
		obj1.FindSum();
		
		System.out.println("Sum of 4 numbers entered = "+obj1.sum);
		System.out.println("Average of 4 numbers entered = "+obj1.avg);


	}

}
