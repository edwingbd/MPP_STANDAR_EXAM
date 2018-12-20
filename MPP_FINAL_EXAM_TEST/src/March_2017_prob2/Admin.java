package March_2017_prob2;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		
		return list.stream().map(e->e.computeUpdatedBalanceSum())
				.reduce((a,b)->a+b).orElse(0.0) ;
	}
}
