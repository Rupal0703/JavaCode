package oct11assignment;
import java.util.Scanner;
public class SumOfNNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please the no. of integers to be added");
		int quantity = sc.nextInt();
		int sum= 0;
		int a;
		for(int i=1;i<=quantity;i++) {
			System.out.println("Please enter no."+i);
			a= sc.nextInt();
			sum = sum + a;
		}
		sc.close();
		
		System.out.println("The sum of "+quantity+" numbers entered= "+sum);
		
		
	}

}
