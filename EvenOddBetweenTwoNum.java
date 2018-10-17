package oct8Test;

public class EvenOddBetweenTwoNum {

	int a = 50;
	int b = 100;
	
	public void calculateEven() {
		for(int i =50; i<=100;i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	public void calculateOdd() {
		for(int j=50; j<=100;j++) {
			if (j%2==0) {
			}
			else {
				System.out.print(j+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		EvenOddBetweenTwoNum obj1 = new EvenOddBetweenTwoNum();
		System.out.println("These are even numbers between 50 and 100: ");
		obj1.calculateEven();
		System.out.println();
		System.out.println("These are odd numbers between 50 and 100: ");
		obj1.calculateOdd();
	}

}
