import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOne {

	public static void findCount(List<String> l) {
		Map<Object, Long>m = new HashMap<>();
		m = l.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
		System.out.println(m);
	}
	public static void main(String[] args) {
		List <String>l = new ArrayList<>();
		l.add("Naveen");
		l.add("Virat");
		l.add("Naveen");
		l.add("Sachin");
		findCount(l);
	}

}
