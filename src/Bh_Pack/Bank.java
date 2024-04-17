package Bh_Pack;

public class Bank {
	
	String name;
	int balance;
	
	public void depost(int money) {
		balance = balance  + money;
		showInfo();
	}
	public int withdraw(int money) {
		if (balance < money) {
			System.out.println("잔액이 부족합니다.");
		}
		balance = balance - money;
		showInfo();
		return 0; 
	}
	public void showInfo() {
		System.out.println("현재" + this.name + "의 잔액은");
		System.out.println("현재 잔액은 : " + this.balance);
	}
}
