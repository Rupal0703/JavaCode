package oct7;

public class TwoDimensionalArray {

	/*int[][] arr = new int[3][4];
	arr[0][0] = 100;*/
	
	
	
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		arr[0][0] = 100;
		arr[0][1] = 101;
		arr[0][2] = 102;
		arr[0][3] = 103;
		
		arr[1][0] = 200;
		arr[1][1] = 201;
		arr[1][2] = 202;
		arr[1][3] = 203;
		
		arr[2][0] = 300;
		arr[2][1] = 301;
		arr[2][2] = 302;
		arr[2][3] = 303;
	
	for (int i=0;i<=2;i++) {
		for(int j=0;j<=3;j++) {
			System.out.print(arr[i][j]+ "  ");
		}
		System.out.println();
	}
	
	}
	
	
}
