package oct10assignment;
import java.util.Scanner;

public class MaxValue {

	int a;
	int b;
	int c;
	int maxvalue;
	public int findMaximumValue() {
		if(a>b && a>c) {
			maxvalue =a;
		}
		else if (b>a && b>c){
			maxvalue =b;
		}
		else {
			maxvalue =c;
		}
		
		return maxvalue;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		int x = sc.nextInt();
		System.out.println("Please enter 2nd number");
		int y = sc.nextInt();
		System.out.println("Please enter 3rd number");
		int z = sc.nextInt();		
		sc.close();
		
		MaxValue obj1 = new MaxValue();
		obj1.a = x;
		obj1.b = y;
		obj1.c = z;
		
		obj1.findMaximumValue();
		
		System.out.println("The maximum value amongst the number entered= " + obj1.maxvalue);
		
		
				
		
	}

}
