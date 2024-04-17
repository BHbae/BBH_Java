package Bh_Pack;

import java.util.Scanner;

public class 삼항연산자 {

	public static void main(String[] args) {
		
		System.out.println("두 수 중에 작은 수를를 출력 하세요");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("X 의 받은 값은 :" + x );
		int y = sc.nextInt();
		System.out.println("y 의 받은 값은 :" + y);
		System.out.println("------------------------");
		int max = x > y ? y : x;
		System.out.println("두 수 중에 작은 수는" + max +"입니다.");
		sc.close();
		

	}

}
