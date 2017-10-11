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
			System.out.println("\nВведіть номер команди:");
		} while (menu.getOrDefault(sc.next(), () -> false).functionClub());
	}

	static void printListFunction() {
		System.out.println("Веддіть 1 для додавання учасника клубу;");
		System.out.println("Веддіть 2 для додавання тваринки до учасника клубу;");
		System.out.println("Веддіть 3 для видалення тваринки з учасника клубу;");
		System.out.println("Веддіть 4 для видалення учасника клубу;");
		System.out.println("Веддіть 5 для видалення конкретної тваринки зі всіх власників;");
		System.out.println("Веддіть 6 для виведення на екран зооклубу;");
		System.out.println("Веддіть інший символ для виходу з програми.");
	}
}
