package ch04;

import java.util.Scanner;

public class 연습장 {

	public static void main(String[] args) {
		// 풀이 2
		boolean flag = true;
		int a = 1;
		
		while (flag) {
			if (a % 3 == 0) {
				System.out.println("3의 배수는 : " + a);
			}
			// 특정 조건 멈추기
			if (a == 100) {
				flag = false;
			} // end of while
			a++;
		}

	}// end of main

} // end of class