package Bh_Pack;

public class Warrior {
	
	String name; 
	int power; 
	int hp; 
	
	// 생성자 
	public Warrior(String myName, int myPower) {
		name = myName;
		power = myPower;
		hp = 100; 
	}
	
	// Warrior 공격을 하다 
	// Wizard 공격을 하다
	public void attackWizard(Wizard wizard) {
		System.out.println(this.name + "(" + this.power + ") 합니다");
		wizard.beAttacked(this.power);
	}
	
	// 내가 공격을 받다. 
	public void beAttacked(int power) {
		// 방어적 코드 
		// 10 <= 0
		hp = hp - power;
		System.out.println(" 현재 >> hp : " + this.hp);
		if(hp <= 0) {
			System.out.println("싸늘한 시체입니다.");
			return; // 실행에 흐름을 반환 
		}
		
	}
}