package oct12thassignment;
import java.util.Scanner;

public class ReverseDigitsOfNumber {

	int num,lengthOfNumber;
	int rem,reverseNumber;
	
	
	public static void main(String[] args) {
		int num,lengthOfNumber;
		int rem;
		int reverseNumber=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:" );
		num = sc.nextInt();
		sc.close();
		String str= String.valueOf(num);
		lengthOfNumber = str.length();
		
		for(int i=0;i<lengthOfNumber;i++) {
			rem = num%10;
			num = (num-rem)/10;
			reverseNumber =(int) (reverseNumber+ rem*(Math.pow(10, lengthOfNumber-i-1)));			
		}
		
		System.out.println("The reverse of the number entered = "+reverseNumber);
		

	}

}
