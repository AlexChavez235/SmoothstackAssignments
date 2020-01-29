package assignment2;

import java.util.Scanner;

public class commandLineAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maxNumbers;
		double sum = 0;
		int i = 0;
		
		System.out.println("Please enter how many numbers to be added.");
		
		while (!sc.hasNextInt()) {
	        System.out.println("That's not an integer number!");
	        sc.next();
	    }
		
	    maxNumbers = sc.nextInt();
	    
	    System.out.println("Now enter " + maxNumbers + " numbers.");
	    
	    while (i<maxNumbers) {
	    	while (!sc.hasNextDouble()) {
		        System.out.println("That's not a number!");
		        sc.next();
		    }
			sum += sc.nextDouble();
	    	i++;
	    }
		
		sc.close();
		
		System.out.println("The total sum of the numbers you have entered is: " + sum);
		

	}

}
