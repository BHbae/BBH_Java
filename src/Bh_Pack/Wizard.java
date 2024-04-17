package Bh_Pack;

public class Wizard {
	
	
	String name; 
	int power; 
	int hp; 
	
	public Wizard(String myName, int myPower) {
		this.name = myName;
		this.power = myPower;
		hp = 50;
	}
	
	// 전사를 공격하다 
	public void attackWarrior(Warrior warrior) {
		warrior.beAttacked(this.power);
		
	}
	
	// 내가 공격을 받다. 
	public void beAttacked(int power) {
		// 방어적 코드
		hp = hp - power;
		System.out.println(" 현재 >> hp : " + this.hp);
		if(hp <= 0) {
			System.out.println("싸늘한 시체입니다.");
			return; // 실행에 흐름을 반환 
		}
		
	}
}
