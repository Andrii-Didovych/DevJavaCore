package less18;

import java.util.Comparator;

import less18.Person.Pet;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("Ivan", 18);
		Pet pet = person.new Pet("Barsic");
//person.getPets().add(pet);
		Person person2 = new Person("Mukola", 25);
		Pet pet2 = person2.new Pet("Barsic");
		System.out.println(pet2.equals(pet));
//		System.out.println(person);
		Person person3 = new Person.Builder()
				.age(19)
				.name("ivan")
				.pet("Barsic")
				.pet("Tuzic")
				.pet("Bim")
				.build();
		System.out.println(person3);
		person3.getPets().sort(getComparator()); 
		System.out.println(person3);
	}
	
	static Comparator<Pet> getComparator(){
		return new Comparator<Pet>() {

			@Override
			public int compare(Pet o1, Pet o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}.reversed();
	}
}
