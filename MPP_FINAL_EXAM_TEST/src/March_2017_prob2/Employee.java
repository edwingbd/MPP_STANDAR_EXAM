package March_2017_prob2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> owns; 
	
	public Employee(String name) {
		super();
		this.name = name;
		this.owns = new ArrayList<>();
	}
	
	public String getName()
	{
		return name;
	}
	public void addAccount(Account Acct) {
		owns.add(Acct);
	}
	public double computeUpdatedBalanceSum() {
		//implement
		return owns.stream().map(e->e.computeUpdateBalance())
				.reduce((a,b)->a+b).orElse(0.0)  ;
	}
	
	
}
