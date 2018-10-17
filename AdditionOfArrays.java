package oct8Test;
//import java.util.Scanner;

public class AdditionOfArrays {

	int a = 4;
	int[] arr1 = new int[a];
	int[]arr2 = new int[a];
	int[] sum = new int[a];
	
	public void calculateadditionOfArray() {
		for(int i=0; i<a;i++) {
			sum[i]=arr1[i]+arr2[i];
		}
	}
	
	
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of array");
		int length= sc.nextInt();*/
		
		AdditionOfArrays obj1 = new AdditionOfArrays();
		//obj1.a=length;
		
		obj1.arr1[0]=1;
		obj1.arr1[1]=2;
		obj1.arr1[2]=1;
		obj1.arr1[3]=1;
		
		obj1.arr2[0]=10;
		obj1.arr2[1]=20;
		obj1.arr2[2]=30;
		obj1.arr2[3]=40;
		
		obj1.calculateadditionOfArray();
		
		System.out.println(obj1.sum[0]+" "+obj1.sum[1]+" "+obj1.sum[2]+" "+obj1.sum[3]);
		
	}

}
