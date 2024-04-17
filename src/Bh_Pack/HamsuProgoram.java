package Bh_Pack;

public class HamsuProgoram {

	public static void main(String[] args) {
		// 인사말 출력
		Hamsu Box1 = new Hamsu();
		Box1.name = "greet";
		System.out.println("안녕하세요," + Box1.name + "님!");

		// 제곱 계산하기
		System.out.println(square(10));

		// 나이 확인
		System.out.println(checkAdult(19));

		// 수호 부호판별
		System.out.println(signOfNumber(12));

		// 최대값 찾기 함수
		int big = findMax(990, 100);
	      System.out.println(big);


	} // end of main

	static int square(int n1) {
		int result = 0;
		result = n1 * n1;
		return result;
	} // end of addNum

	static boolean checkAdult(int n2) {
		// 지역수는 반드시 초기화 되어야 한다.
		boolean flag;
		if (n2 >= 18) {
			flag = true;
		} else {
			flag = false;
		} // end of if
		return flag;
	}// end of checkAdult

	static String signOfNumber(int n3) {

		String age;
		if (n3 > 0) {
			 age = "positive";
		} else if (n3 < 0) {
			age = "negative";
		} else {
			age = "zero";
		} // end of if
		return age;
	} // end of signOfNumber
	
	  static int findMax(int a, int b) {
	      int c = 0;
	      if (a > b) {
	         c = a;
	      } else {
	         c = b;
	      }
	      return c;
	   }
	

} // end of class
