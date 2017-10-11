package less17withCaseMenu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddPet implements Case,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8795307267026374810L;

	private final Scanner sc;

	private  Map<Person, List<Pet>> map;

	public AddPet(Scanner sc, Map<Person, List<Pet>> map) {
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
		System.out.println("¬вед≥ть вид тваринки:");
		String kind = sc.next();
		System.out.println("¬вед≥ть ≥м'€ тварини:");
		String namePet = sc.next();
		map.get(person).add(new Pet(kind, namePet));
		return true;
	}

}
