package oct8Test;
public class AdditionOfNumbersInArray {
	
	int[] arr1 = new int[5];
	int sum = 0;
	public int addNumOfArray() {
		
		for (int i = 0; i<5;i++) {
			sum = sum+arr1[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		AdditionOfNumbersInArray obj1 = new AdditionOfNumbersInArray();
		obj1.arr1[0]=5;
		obj1.arr1[1]=10;
		obj1.arr1[2]=15;
		obj1.arr1[3]=20;
		obj1.arr1[4]=25;
		
		obj1.addNumOfArray();	
		System.out.println("Result : "+obj1.sum);

	}

}
