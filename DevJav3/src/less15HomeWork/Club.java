package less15HomeWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import less15HomeWork.Person;
import java.util.Scanner;
import java.util.Set;

public class Club implements Serializable {

	private static final long serialVersionUID = -8813688225454869683L;
	private Map<Person, List<Pet>> map;

	public Club(Map<Person, List<Pet>> map) {
		super();
		this.map = map;
	}

	Scanner sc = new Scanner(System.in);

	public void enterPerson() {
		System.out.println("Введіть ім'я учасника клубу:");
		String name = sc.next();
		Person person = new Person(name);
		if (!map.containsKey(person)) {
			map.put(person, new ArrayList<>());
		}
	}

	public void enterPet() {
		System.out.println("Введіть ім'я учасника клубу:");
		String name = sc.next();
		Person person = new Person(name);
		if (!map.containsKey(person)) {
			map.put(person, new ArrayList<>());
		}
		System.out.println("Введіть вид тваринки:");
		String kind = sc.next();
		System.out.println("Введіть її ім'я");
		String namePet = sc.next();
		map.get(person).add(new Pet(kind, namePet));

	}

	public void showClub() {

		Set<Entry<Person, List<Pet>>> set = map.entrySet();
		for (Entry<Person, List<Pet>> entry : set) {
			for (Pet pet : entry.getValue()) {
				System.out.println(entry.getKey() + " " + pet);
			}
			if (entry.getValue().isEmpty())
				System.out.println(entry.getKey());

		}

	}

	public void deletePerson() {
		System.out.println("Введіть ім'я учасника клубу:");
		String name = sc.next();
		Person person = new Person(name);
		if (map.containsKey(person)) {
			map.remove(person);
		} else {
			System.out.println("Такого учасника немає!");

		}

	}

	public void deletePet() {
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
	}

	public void deletePetWithAllPerson() {

		List<Pet> pets = new ArrayList<>();
		Set<Entry<Person, List<Pet>>> set = map.entrySet();
		System.out.println("Введіть вид тварини, яку потрібно видалити:");
		String kindOfPet = sc.next();
		for (Entry<Person, List<Pet>> entry : set){
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

	}

	public void writeInBloknot() {
		try (FileWriter writer = new FileWriter("sew.txt", true)) {
			writer.append(map.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readWithBloknot() {
		try (Scanner sc = new Scanner(new File("sew.txt"))) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void reWriteInBloknot() {
		try (FileWriter writer = new FileWriter("sew.txt")) {
			writer.append("");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void oos() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("sawe.sawe")))) {
			oos.writeObject(map);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@SuppressWarnings("unchecked")
	public void ois() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("sawe.sawe")))) {
			map = (Map<Person, List<Pet>>) ois.readObject();
			
			System.out.println(map);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Club [map=" + map + "]";
	}

}
