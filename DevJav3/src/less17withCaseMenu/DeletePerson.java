package less17withCaseMenu;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DeletePerson implements Case,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6407157496408746528L;

	private final Scanner sc;

	private Map<Person, List<Pet>> map;

	public DeletePerson(Scanner sc, Map<Person, List<Pet>> map) {
		super();
		this.sc = sc;
		this.map = map;
	}

	@Override
	public boolean functionClub() {
		System.out.println("Введіть ім'я учасника клубу:");
		String name = sc.next();
		Person person = new Person(name);
		if (map.containsKey(person)) {
			map.remove(person);
		} else {
			System.out.println("Такого учасника немає!");
		}
		return true;
	}

}
