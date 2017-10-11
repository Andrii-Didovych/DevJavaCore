package less17withCaseMenu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Person, List<Pet>> map = new HashMap<>();
		Map<String, Case> menu = new HashMap<>();
		menu.put("1", new AddPerson(sc, map));
		menu.put("2", new AddPet(sc, map));
		menu.put("3", new DeletePetWithPerson(sc, map));
		menu.put("4", new DeletePerson(sc, map));
		menu.put("5", new DeletePetWithKind(sc, map));
		menu.put("6", new ShowClub(map));
		menu.put("7", new SeriazaibleMap(map));
		menu.put("8", new DeseriazaibleMap(map));
        printListFunction();
		do {
			System.out.println("\n������ ����� �������:");
		} while (menu.getOrDefault(sc.next(), () -> false).functionClub());
	}

	static void printListFunction() {
		System.out.println("������ 1 ��� ��������� �������� �����;");
		System.out.println("������ 2 ��� ��������� �������� �� �������� �����;");
		System.out.println("������ 3 ��� ��������� �������� � �������� �����;");
		System.out.println("������ 4 ��� ��������� �������� �����;");
		System.out.println("������ 5 ��� ��������� ��������� �������� � ��� ��������;");
		System.out.println("������ 6 ��� ��������� �� ����� ��������;");
		System.out.println("������ ����� ������ ��� ������ � ��������.");
	}
}
