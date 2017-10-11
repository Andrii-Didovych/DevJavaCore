package less17withCaseMenu;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ShowClub implements Case, Serializable {

	private static final long serialVersionUID = -4569675624200052556L;
	private  Map<Person, List<Pet>> map;

	public ShowClub(Map<Person, List<Pet>> map) {
		super();
		this.map = map;
	}

	@Override
	public boolean functionClub() {
		Set<Entry<Person, List<Pet>>> set = map.entrySet();
		for (Entry<Person, List<Pet>> entry : set) {
			for (Pet pet : entry.getValue()) {
				System.out.println(entry.getKey() + " " + pet);
			}
			if (entry.getValue().isEmpty())
				System.out.println(entry.getKey());
		}
		return true;
	}

}
