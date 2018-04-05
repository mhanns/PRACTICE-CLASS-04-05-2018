//Maurice Hanns CSC 242 04/05/2018

import java.util.Scanner;

public class calcAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] values = new int[5];
		double sum = values[0];

		Scanner input = new Scanner(System.in);
		
		System.out.println(sum);
		
		for (int i = 0; i < values.length; i++){
			
			System.out.println("Please enter value number <" + (i+1) + ">." );
			values[i] = input.nextInt();
			
			sum = sum + values[i];
					
		
		}//for loop
		
		sum = sum / values.length;
		System.out.println(sum);
			

	}//main

}//class
