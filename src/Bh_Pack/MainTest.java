package Bh_Pack;

import java.util.Scanner;

public class MainTest {
	// 코드의 시작점 --> 실행에 흐름을 만들수있다.
	public static void main(String[] args) {

		Warrior w1 = new Warrior("병호", 20);
		Wizard wz1 = new Wizard("성후", 10);
		Wizard wz2 = new Wizard("도빠", 10);
		Wizard wz3 = new Wizard("진혁", 10);
		System.out.println("병호가 성후를 몇번 때리겠습니까.");
		Scanner sc = new Scanner(System.in);
		int inputData = sc.nextInt();
		
		for(int i = 0; i < inputData; i++) {
			w1.attackWizard(wz2);
		}
		System.out.println("성후의 남은 체력 : " + wz2.hp);
		
		
	} //  end of main

} // end of class
