package assignment2;

public class twoDimensionalArray {
	
	public static void maxAndPostion(double[][] arr) {
		double max = Double.MIN_VALUE;
		int x, y;
		x = y = 0;
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					x = i;
					y = j; 
				}
			} 
		}
		
		System.out.println("The max value of the 2-D array is " + max +
				" and is located at (" + x + ", " + y + ").");
	}
 
	public static void main(String[] args) {
		double[][] arr1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		maxAndPostion(arr1);
		
		double[][] arr2 = {{-5,20.5,32,-10}, {4,16,89,-40}, {0,12,9,-5}};
		maxAndPostion(arr2);
		

	}

}
