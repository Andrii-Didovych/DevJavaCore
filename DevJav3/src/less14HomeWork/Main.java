package less14HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		List<Commodity> items = new ArrayList<>();
		Commodity commodity0 = new Commodity("phone", 800, 12);
		Commodity commodity1 = new Commodity("laptop", 500, 8);
		Commodity commodity2 = new Commodity("cover", 100, 15);
		Commodity commodity3 = new Commodity("mac", 1000, 4);
		Commodity commodity4 = new Commodity("iphone", 700, 11);
		items.add(commodity0);
		items.add(commodity1);
		items.add(commodity2);
		items.add(commodity3);
		items.add(commodity4);
		
		Features1 features = new Features1();
		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			System.out.println("Веддіть 1 щоб створити новий товар");
			System.out.println("Веддіть 2 щоб вивести товари на екран");
			System.out.println("Веддіть 3, щоб вибрати який товар видалити");
			System.out.println("Введіть 4, щоб поміняти товар");
			System.out.println("Введіть 5, щоб вибрати спосіб сортування");

			switch (sc.next()) {
			case "1": {
				features.createList(items);
				break;
			}

			case "2": {
				features.showList(items);
				break;
			}
			case "3": {
				features.deleteItems(items);
				break;
			}
			case "4": {
				features.exchengeItems(items);
				break;
			}
			case "5": {
				features.sortItems(items);
				break;
			}
			default:
				System.out.println("Роботу програми завершено!");
				isRun = false;
			}
		}
	}

}
