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
			System.out.println("������ 1 ��� �������� ������ �������");
			System.out.println("������ 2 ��� ������� ������ ������� � �������");
			System.out.println("������ 3, ��� ������� ��� ����� ��������");

			switch (sc.next()) {
			case "1": {
				System.out.println("������ ��� ��� ������ �������");
				String name = sc.next();

				System.out.println("������ �� ��� ������ �������");
				int age = sc.nextInt();

				System.out.println("������ �����(MALE or FEMALE) ��� ������ �������");
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
				System.out.println("������ ����� ��� ������� ��������");
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
				System.out.println("�� ���������� ���� �������");
				isRun = false;
			}
		}
	}

}
