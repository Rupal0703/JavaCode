package oct7;
import java.util.Scanner;
public class NumbersInDifferentOrders {
	
	int a;
	public void printNumbersInIncreasingOrder() {
		int[] arr = new int[a];
		for(int i=1; i<=a;i++) {
			arr[i-1]=i;
			System.out.print(arr[i-1]+" ");
		}
	}
	
	public void printNumbersInDecreasingOrder() {
		int[] arr1 = new int[a];
		for(int i=a; i>=1;i--) {
			arr1[a-i]=i;
			System.out.print(arr1[a-i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number here.");
		int x= sc.nextInt();
		sc.close();
		
		NumbersInDifferentOrders obj1 = new NumbersInDifferentOrders();
		obj1.a=x;
		obj1.printNumbersInIncreasingOrder();
		System.out.print("; ");
		obj1.printNumbersInDecreasingOrder();
	}

}
