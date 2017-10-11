package less17withCaseMenu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddPerson implements Case, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2044309491263953968L;

	private final Scanner sc;

	private  Map<Person, List<Pet>> map;

	public AddPerson(Scanner sc, Map<Person, List<Pet>> map) {
		super();
		this.sc = sc;
		this.map = map;
	}

	@Override
	public boolean functionClub() {
		System.out.println("¬вед≥ть ≥м'€ учасника клубу:");
		String name = sc.next();
		Person person = new Person(name);
		if (!map.containsKey(person)) {
			map.put(person, new ArrayList<>());
		}
		return true;
	}
}
