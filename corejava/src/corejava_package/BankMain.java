package corejava_package;

public class BankMain {

	public static void main(String[] args) {
		Account Ac1 = new Account(0.0);
		Ac1.DepositMoney(100);
		Ac1.DepositMoney(200);
		Ac1.Withdraw(200);
	}
}
