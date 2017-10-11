package less14;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import less11.Gender;
import less11.Person;

public class Main {

	public static void main(String[] args) {

		Set<Person> persons = new LinkedHashSet<>();
		persons.add(new Person( "Ivan", 18, Gender.FEMALE));
		persons.add(new Person("Ivan", 18, Gender.FEMALE));
		System.out.println(persons);
		System.out.println("AaAaAaAa".hashCode());
		System.out.println("AaAaAaBB".hashCode());

		List<Person> personsList = new ArrayList<>();
		System.out.println(personsList.add(new Person("Inan", 12, Gender.MALE)));
		System.out.println(personsList.add(new Person("Petro", 14, Gender.MALE)));
		System.out.println(personsList.add(new Person("Mycola", 13, Gender.MALE)));

		
		
		personsList.sort(null);
		System.out.println();
		for (Person person : personsList) {
			System.out.println(person);
		}
		
		personsList.sort(new PersonComparatorByNameDesc());
		System.out.println();
		for (Person person : personsList) {
			System.out.println(person);
		}
		
		personsList.sort((o1,o2)->Integer.compare( o2.getAge(),o1.getAge()));
		System.out.println();
		for (Person person : personsList) {
			System.out.println(person);
		}

	}

}
