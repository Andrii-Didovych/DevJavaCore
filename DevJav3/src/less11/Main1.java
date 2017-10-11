package less11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			System.out.println("Веддіть 1 щоб створити нового Персона");
			System.out.println("Веддіть 2 щоб вивести список персонів в консоль");
			System.out.println("Веддіть 3, щоб вибрати яку стать видалити");

			switch (sc.next()) {
			case "1": {
				System.out.println("Введіть імя для нового Персона");
				String name = sc.next();

				System.out.println("Введіть вік для нового Персона");
				int age = sc.nextInt();

				System.out.println("Введіть стать(MALE or FEMALE) для нового Персона");
				Gender gender = Gender.valueOf(sc.next().toUpperCase());

				Person person = new Person(name, age, gender);
				persons.add(person);

				break;
			}

			case "2": {
				for (Person person : persons) {
					System.out.println(person);
				}
				break;
			}
			case "3": {
				System.out.println("Введіть стать яку потрібно видалити");
				String input = sc.next();
				Iterator<Person> iter = persons.iterator();
				while (iter.hasNext()) {
					Person tmp = iter.next();
					if (tmp.getGender() == (Gender.valueOf(input.toUpperCase())))
						iter.remove();
				}

				break;
			}
			default:
				System.out.println("Не правильний вибір команди");
				isRun = false;
			}
		}
	}

}
