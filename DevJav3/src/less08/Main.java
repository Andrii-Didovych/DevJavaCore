package less08;

public class Main {

	public static void main(String[] args) {
		Person.printCount();
		Person person = new Person();
		person.setAge(18);
		person.setName("Ivan");
		System.out.println(person);
		System.out.println(person.getName()+
				" "+person.getAge());
		
		final ValueObject object = new ValueObject(36, "Red");
		System.out.println(object);
		//ValueObject object1 = object.reColor("Black");
//		System.gc();
//		System.gc();
		System.out.println(object);
		//Person person1 = new Person();
		Person.printCount();

	}

}
