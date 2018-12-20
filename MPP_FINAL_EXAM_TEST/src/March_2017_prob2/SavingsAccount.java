package March_2017_prob2;

public class SavingsAccount extends Account {
	public SavingsAccount(String acctId, double interestRate, double balance) {
		super();
		this.acctId = acctId;
		this.interestRate = interestRate;
		this.balance = balance;
	}

	private double balance;
	private double interestRate;
	private String acctId;
	@Override
	public String getAccountID() {
		// TODO Auto-generated method stub
		return acctId;
	}

	@Override
	public Double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public Double computeUpdateBalance() {
		// TODO Auto-generated method stub
		return balance+balance*interestRate;
	}
	

}
