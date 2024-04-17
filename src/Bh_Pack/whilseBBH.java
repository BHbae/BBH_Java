package Bh_Pack;

public class whilseBBH {

	// 코드의 시작점(메인함수)
		public static void main(String[] args) {

			// 1부터 5까지 덧셈 연산을 하라
			// 1 + 2 + 3 + 4 + 5
			int start = 1;
			int sum = 0;
			
			while(start <= 10) {
				sum = sum + start;
				System.out.println("sum("+start+"):" + sum);
				start++;
				
			} // end of while
			
		} // end of main

	} // end of class

