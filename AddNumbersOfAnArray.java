package oct4;

public class AddNumbersOfAnArray {

	int[] arr = {10,20,30,40};
	int sum=0;
	public void additionOfNumbersInArray() {
		for(int i=0;i<4;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		AddNumbersOfAnArray obj1 = new AddNumbersOfAnArray();		
		obj1.additionOfNumbersInArray();

	}

}
