package entiteis;

public final class SavingsAccount extends Account{
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestrate) {
		super(number, holder, balance);
		this.interestRate = interestrate;
	}

	public Double getInterestrate() {
		return interestRate;
	}

	public void setInterestrate(Double interestrate) {
		this.interestRate = interestrate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	

}
