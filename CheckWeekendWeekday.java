package oct4;

public class CheckWeekendWeekday {

	int i;
	public void checkDay() {
		if ((i==1) || (i==2) || (i==3) || (i==4) || (i==5)) {
			System.out.println("It's a Weekday :(");
		}
		else if ((i==6) || (i==7)) {
			System.out.println("It's a Weekend :)");
		}
		else {
			System.out.println("Invalid number entered. Try again :D");
		}
	}
	
	
	public static void main(String[] args) {
		CheckWeekendWeekday object1 = new CheckWeekendWeekday();
		object1.i = 90;
		object1.checkDay();
		

	}

}
