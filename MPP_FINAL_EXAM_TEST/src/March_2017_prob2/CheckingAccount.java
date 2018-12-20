package March_2017_prob2;

public class CheckingAccount extends Account {
	public CheckingAccount(String acctId, double montlyFee, double balance) {
		super();
		this.acctId = acctId;
		this.montlyFee = montlyFee;
		this.balance = balance;
	}

	private double balance;
	private double montlyFee;
	private String acctId;
	
	@Override
	public String getAccountID() {
		return acctId;
	}
	@Override
	public Double getBalance() {
		return balance;
	}

	@Override
	public Double computeUpdateBalance() {
		return balance-montlyFee;
	}

}
