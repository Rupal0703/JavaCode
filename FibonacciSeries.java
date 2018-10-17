package oct11assignment;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		long result;
		System.out.println("Please enter 1st number to create Fibonacci series");
		long a= sc.nextLong();
		System.out.println("Please enter 1st number to create Fibonacci series");
		long b=sc.nextLong();
		System.out.println("Please specify the length for Fibonacci series");
		long length=sc.nextLong();
		sc.close();
		System.out.print(a+"  "+b+"  ");
		for(long i=1;i<=(length-2);i++) {
			result = a+b;
			System.out.print(result+"  ");
			a=b;
			b=result;
		}

	}

}
