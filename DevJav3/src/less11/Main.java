package less11;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("Ivan ", 12, Gender.MALE);
		System.out.println(person);
		String input = "female";
		Gender gender = Gender.valueOf(input.toUpperCase());
		System.out.println("Стать - " + gender);
		Gender[] genders = Gender.values();
		System.out.println(genders[1]);
		System.out.println(gender.name());
		System.out.println(gender.ordinal());

	}

}
