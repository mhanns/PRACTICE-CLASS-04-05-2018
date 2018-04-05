//Maurice Hanns CSC 242 04/05/2018

public class evenOddInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] values = {5,7,2,4,9};
		int even = 0;
		int odd = 0;
			
		for (int i = 0; i < values.length; i++){
			if (values [i] % 2 == 0){
				even = even + 1;
			}
			
			if (values [i] % 2 != 0){
				odd = odd + 1;
			}
		}//for loop
		
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
	}
		

}