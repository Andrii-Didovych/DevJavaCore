package less15HomeWork;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Map<Person, List<Pet>> map = new HashMap<>();
		Club club = new Club(map);
		boolean isRun = true;
		System.out.println("Веддіть 1 щоб Додати учасника клубу ");
		System.out.println("Веддіть 2 щоб Додати тваринку до учасника клубу");
		System.out.println("Веддіть 3, щоб видалити тваринку з учасника клубу");
		System.out.println("Веддіть 4, щоб видалити учасника клубу");
		System.out.println("Веддіть 5, щоб видалити конкретну тваринку зі всіх власників ");
		System.out.println("Веддіть 6, щоб вивести на екран зооклуб  ");
		System.out.println("Веддіть інший символ, щоб вийти з програми  ");
		while (isRun) {
			switch (sc.next()) {
			case "1": {
				club.enterPerson();
				break;
			}
			case "2": {
				club.enterPet();
				break;
			}
			case "3": {
				club.deletePet(); 
				
				break;
			}
			case "4": {
				club.deletePerson();
				break;
			}
			case "5": {
				club.deletePetWithAllPerson();         
				break;
			}
			case "6": {
				club.showClub();
				break;
			}
			default:
				System.out.println("Не правильний вибір команди");
				isRun = false;
			}
		}
		
	}

}
