package less10HomeWork1;

import java.util.List;
import java.util.Scanner;

public class SearchCars {

	public void searchSizeWheel(List<Car> cars) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\nВведіть потрібний розмір дисків: ");
		int size = sc.nextInt();
		System.out.println("  Автомобілі з розміром дисків - " + size + " дюймів:");
		int j = 0;
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i).getWheel().getSize() == size) {
				System.out.print("  " + cars.get(i).getBrand() + " ");
				j++;
			}
		}
		if (j == 0)
			System.out.print("  Не має у списку.");

		System.out.println("\n");
	}

	public void searchSizeAndColor(List<Car> cars) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\nВведіть потрібний розмір дисків: ");
		int size = sc.nextInt();
		System.out.print("Введіть потрібний колір кузова: ");
		String color = sc.next();
		System.out.println("  Автомобілі з розміром дисків - " + size + " дюймів та кольором дисків - " + color + ":");
		Color colors = Color.valueOf(color.toUpperCase());
		int j = 0;
		for (int i = 0; i < cars.size(); i++)
			if (cars.get(i).getBody().getColor().equals(colors) && cars.get(i).getWheel().getSize() == size) {
				System.out.print("  " + cars.get(i).getBrand() + " ");
				j++;
			}
		if (j == 0)
			System.out.print("  Не має у списку.");
		System.out.println("\n");

	}

	public void chengHelm(List<Car> cars) {
		String color = "red";
		String buttons = "yes";
		Color colors = Color.valueOf(color.toUpperCase());
		Button button = Button.valueOf(buttons.toUpperCase());
		System.out.println("\nМашини з червоним кольором: ");
		for (int i = 0; i < cars.size(); i++)
			if (cars.get(i).getBody().getColor().equals(colors)) {
				System.out.println(" " + cars.get(i).getBrand() + " ");

				if (cars.get(i).getHelm().getButton().equals(button)) {
					System.out.println("  Кермо з кнопками замінено на кермо без кнопок.");
					cars.get(i).getHelm().setButton(Button.NO);
					cars.set(i, cars.get(i));
				} else {
					cars.get(i).getHelm().setButton(Button.YES);
					cars.set(i, cars.get(i));
					System.out.println("  Кермо без кнопок замінено на кермо з кнопками.");
				}
				System.out.println("  Кнопки - " + cars.get(i).getHelm().getButton() + "\n");

			}
	}

	public void ifButtonYes(List<Car> cars) {
		String buttons = "yes";
		Button button = Button.valueOf(buttons.toUpperCase());
		for (int i = 0; i < cars.size(); i++)
			if (cars.get(i).getHelm().getButton().equals(button)) {
				System.out.println("\nМашини, які мають кермо з кнопками: ");
				System.out.print("  " + cars.get(i).getBrand() + " \n");
				int size = cars.get(i).getWheel().getSize();
				System.out.println("  Діаметр коліс - " + size);
				cars.get(i).getWheel().setSize(size * 2);
				cars.set(i, cars.get(i));
				System.out.println("  Діаметр коліс збільшено у двічі - " + cars.get(i).getWheel().getSize() + "\n");

			}
	}

	public void chengCar(List<Car> cars) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\nВведіть розмір дисків: ");
		int inputSize = sc.nextInt();
		for (int i = 0; i < cars.size(); i++) {
			int size = cars.get(i).getWheel().getSize();
			if (size < inputSize) {
				System.out.println("  " + cars.get(i).getBrand() + "  має менший розмір дисків ніж указано.");
				if (i < cars.size() - 1) {
					cars.set(i, cars.get(i + 1));
				} else {
					cars.set(i, cars.get(0));
				}
				System.out.println("  Її замінено на - " + cars.get(i).getBrand() + "\n");
			}
		}
	}
}
