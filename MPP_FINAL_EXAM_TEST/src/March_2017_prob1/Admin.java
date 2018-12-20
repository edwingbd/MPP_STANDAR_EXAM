package March_2017_prob1;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		
		return list.stream()
				.filter(e->e.getGpa()>3.5)
				.filter(e->e.getMajor().equals(Majors.CS))
				.collect(Collectors.toList());
	}
}
