package oct2;

public class SwapTwoNumbers {

	int a;
	int b;
	
	/*public int[] swap() {
		int[] arr = new int[2];
		a = arr[0];
		b = arr[1];
		a= a+b;
		b=a-b;
		a=a-b;

		return arr;
	
	}*/

	
	public static void main(String[] args) {
		
		SwapTwoNumbers result = new SwapTwoNumbers();
		result.a = 10;
		result.b = 20;
		result.a= result.a+result.b;
		result.b=result.a-result.b;
		result.a=result.a-result.b;

		System.out.println(result.a + " and " + result.b);
		
	}

}
