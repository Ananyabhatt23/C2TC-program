package corejava_package;

public class Account {
	private double Balance;
	
	public Account(double Balance) {
		 this.Balance = Balance;
	 }
	
	public void DepositMoney(double DepositedMoney) {
		this.Balance+=DepositedMoney;
		System.out.println("Deposit Successful "+this.Balance);
	}
	
	public void Withdraw(double WithdrawMoney) {
		if(this.Balance-WithdrawMoney<0) {
			System.out.println("Withdraw Unsuccessful only "+this.Balance+" is left");
		}
		else {
			this.Balance-=WithdrawMoney;
			System.out.println("Withdraw successful,current balance is: "+this.Balance);
		}
	}
}
	 
	 
