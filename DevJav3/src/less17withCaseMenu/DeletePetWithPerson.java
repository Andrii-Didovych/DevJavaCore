package less17withCaseMenu;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DeletePetWithPerson implements Case,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4992742316482461752L;

	private final Scanner sc;

	private  Map<Person, List<Pet>> map;

	public DeletePetWithPerson(Scanner sc, Map<Person, List<Pet>> map) {
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
			System.out.println("Введіть вид тварини, яку потрібно видалити:");
			String kindOfPet = sc.next();
			Iterator<Pet> iter = map.get(person).iterator();
			while (iter.hasNext()) {
				Pet pet2 = iter.next();
				if (pet2.getKind().equals(kindOfPet)) {
					iter.remove();
				}
			}
		} else
			System.out.println("Такого учасника немає!");
		return true;
	}

}
