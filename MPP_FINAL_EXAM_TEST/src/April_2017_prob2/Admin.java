package April_2017_prob2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Admin {
	public Admin(Department[] departments) {
		super();
		this.departments = departments;
	}
	private Department[] departments;  
	public String format(String name, String msg) {
		return name+":"+msg;
	}
	public String hourlyCompanyMessage()
	{
		return Stream.of(departments)
				.map(e-> format(e.getName(),e.nextMessage()))
				.collect(Collectors.joining("\r"))+"\r";
	}
}
