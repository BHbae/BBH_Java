package Bh_Pack;

public class BankTest {

	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.name = "최와와";
		int get = b1.withdraw(10000);
		System.out.println("금액 : " + get);
		

}
