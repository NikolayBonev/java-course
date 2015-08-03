package Account;

public class Account {
	protected double balance;

	public Account() throws NegativeMoneyException{
		setBalance(0.0);
	}
	
	public Account(double balance) throws NegativeMoneyException{
		setBalance(balance);
	}
	
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) throws NegativeMoneyException{
		if(balance<0){
			throw new NegativeMoneyException("Can't have negative balance!");
		}
		this.balance = balance;
	}
	
}
