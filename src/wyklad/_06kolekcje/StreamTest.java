package wyklad._06kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Stream;

class User {
	int id;
	String name;
	String lastName;
	int age;

	User(int id, String name, String lastName, int age) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public String toString() {
		return "<User: " + id + " ," + name + " ," + lastName + " ," + age + ">";
	}
}

public class StreamTest {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>(
				Arrays.asList(
						new User(13, "Ktos", "Vai", 18),
						new User(1, "Steve", "Vai", 40),
						new User(4, "Joe", "Smith", 32),
						new User(3, "Steve", "Johnson", 57),
						new User(9, "Mike", "Stevens", 18),
						new User(10, "George", "Armstrong", 24),
						new User(2, "Jim", "Smith", 40),
						new User(8, "Chuck", "Schneider", 34),
						new User(5, "Jorje", "Gonzales", 22),
						new User(6, "Jane", "Michaels", 47),
						new User(6, "Azor", "As", 17),
						new User(7, "Kim", "Berlie", 60)
				)
		);

		Stream<User> stream = users.stream();

		System.out.println("\nu.age > 50");
		Supplier<Stream<User>> supplier =
				() -> stream
				.filter(u -> u.age > 50);
//				.forEach(u -> System.out.println(u));
//		System.out.println("--------");
		supplier.get().forEach(s -> System.out.println(s));

		Stream<User> stream2 = users.stream();
		System.out.println("\nCount: " +
				stream2
						.filter(u -> u.name.startsWith("S"))
						.count()
		);

		System.out.println("\ntoUpperCase:");
		users.stream()
				.filter(u -> u.age > 40)
				.map(u -> u.name.toUpperCase())
				.forEach(u -> System.out.println(u));

		System.out.println("\nmin:");
		User uMin = users.stream()
				.min(Comparator.comparing(u -> u.lastName.length()))
				.get();
		System.out.println(uMin);

		System.out.println("\nreduced:");
		String reduced = users.stream()
				.map(u -> u.name)
				.reduce("", (acc, n) -> acc + " " + n);
		System.out.println(reduced);

		System.out.println("\nreduced:");
		int sumaWieku = users.stream()
				.map(u -> u.age)
				.reduce(0, (acc, n) -> acc + n);
		System.out.println(sumaWieku);

		System.out.println("\naverage age:" +
				users.stream()
						.mapToInt(u -> u.age)
						.average());
	}
}
