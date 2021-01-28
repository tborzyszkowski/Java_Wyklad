package wyklad._06kolekcje;
import java.util.*;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		List<String> li = Arrays.asList(args);
		// posortuj
		Collections.sort(li);
		System.out.println(li);

		// pomieszaj
		Collections.shuffle(li);
		System.out.println(li);
	}
}
