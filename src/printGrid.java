//Maurice Hanns CSC 242 04/05/2018

public class printGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] sum = new String[5][5];

			
		for (int i = 0; i < sum.length; i++) {
			System.out.print("\n");

			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = "-";
				System.out.print(sum[i][j]); 


			}//for loop inner		

		}//for loop outer
		
	}//main

}//class
