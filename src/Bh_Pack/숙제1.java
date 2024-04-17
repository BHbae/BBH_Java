package Bh_Pack;

public class 숙제1 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {

			for (int a = 0; a < 3; a++) {
				System.out.print(a + "\t");
			} // end of for 1
			System.out.println();
		} // end of for main
		System.out.println("---------------------------------------------------");

		 for (int a = 0; a < 5; a++) {

	         for (int b = 0; b <= a; b++) {

	            if (b == 0 || a != 0) {
	               
	               System.out.print("*");
	            } 
	            else {
	            //   System.out.print("**");
	            }
	         }
	         System.out.println();
	      }
	   }// end of main

} // end of class
