package less12;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<>();

		strings.add(0, "Petro");
		strings.add(1, "Ivan");
		strings.set(1, "Artem");
		strings.add("Mukola");
		System.out.println(strings);
		System.out.println(strings.size());
		System.out.println(strings.get(1));
		System.out.println(strings.remove(1));
		System.out.println(strings);
		System.out.println(strings.isEmpty());
		// strings.clear();
		// System.out.println(strings);

		List<String> strings1 = new ArrayList<>();
		strings.add(0, "Petro");
		strings.add(1, "Ivan");
		strings.set(1, "Artem");
		strings.add("Mukola");
		System.out.println("sdf " + strings.equals(strings1));
		System.out.println(strings.containsAll(strings1));
		System.out.println(strings.subList(0, 1));

	}
	

}
