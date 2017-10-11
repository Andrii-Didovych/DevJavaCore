package less17withCaseMenu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class DeletePetWithKind implements Case,Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -7478052031626090124L;

	private final Scanner sc;

	private Map<Person, List<Pet>> map;

	public DeletePetWithKind(Scanner sc, Map<Person, List<Pet>> map) {
		super();
		this.sc = sc;
		this.map = map;
	}

	@Override
	public boolean functionClub() {
		List<Pet> pets = new ArrayList<>();
		Set<Entry<Person, List<Pet>>> set = map.entrySet();
		System.out.println("¬вед≥ть вид тварини, €ку потр≥бно видалити:");
		String kindOfPet = sc.next();
		for (Entry<Person, List<Pet>> entry : set) {
			pets = entry.getValue();
			Iterator<Pet> iter = pets.iterator();
			while (iter.hasNext()) {
				Pet pet2 = iter.next();
				if (pet2.getKind().equals(kindOfPet)) {
					System.out.println(pets);
					iter.remove();
				}
			}
		}
		return true;
	}

}
