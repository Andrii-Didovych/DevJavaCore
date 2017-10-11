package less10HomeWork1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashSetCars {

	public void findCarsWithColorEndSize(Set<Car> cars) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\nВведіть потрібний колір кузова: ");
		String colorBody = sc.next();
		Color color = Color.valueOf(colorBody.toUpperCase());
		System.out.print("Введіть потрібний розмір дисків: ");
		int sizeWheel = sc.nextInt();
		System.out.print("Оберіть шини: ");
		String tire = sc.next();
		Tire tire2 = Tire.valueOf(tire.toUpperCase());
		System.out.println("   Машини з кольором кузова '" + colorBody + "' та розміром дисків: '" + sizeWheel + "':");

		Iterator<Car> iter = cars.iterator();
		while (iter.hasNext()) {
			Car tmp = iter.next();
			if (tmp.getBody().getColor().equals(color) && tmp.getWheel().getSize() == sizeWheel) {
				System.out.print("   Марка машини - " + tmp.getBrand() + "; Старий тип шин - "
						+ tmp.getWheel().getTire() + "; ");
				tmp.getWheel().setTire(tire2);
				System.out.println("Шини змінено на " + tmp.getWheel().getTire() + ".");
			}

		}
		System.out.println();
	}

	public void deleteCarsWithSizeOfWheel(Set<Car> cars) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("\nВведіть діапазон розміру коліс:");
		System.out.print("  Введіть мінімальний розмір: ");
		int min = sc.nextInt();
		System.out.print("  Введіть максимальний розмір: ");
		int max = sc.nextInt();
		System.out.print("   Видалено наступні машини: ");

		Iterator<Car> iter = cars.iterator();
		while (iter.hasNext()) {
			Car tmp = iter.next();
			if (tmp.getWheel().getSize() <= max && tmp.getWheel().getSize() >= min) {
				System.out.print(" " + tmp.getBrand());
				iter.remove();
			}
		}
		System.out.println("\n");
	}

	public void findCarsWithTireEndSizeOfWheel(Set<Car> cars) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\nВведіть тип шин: ");
		String tireOfWheel = sc.next();
		Tire tire = Tire.valueOf(tireOfWheel.toUpperCase());
		System.out.println("Введіть діапазон розміру коліс:");
		System.out.print("  Введіть мінімальний розмір: ");
		int min = sc.nextInt();
		System.out.print("  Введіть максимальний розмір: ");
		int max = sc.nextInt();
		System.out.print("    Машини з вказаними параметрами: ");

		Iterator<Car> iter = cars.iterator();
		while (iter.hasNext()) {
			Car tmp = iter.next();
			if (tmp.getWheel().getSize() <= max && tmp.getWheel().getSize() >= min
					&& tmp.getWheel().getTire().equals(tire)) {
				System.out.print(" " + tmp.getBrand());

			}
		}
		System.out.println("\n");
	}

}
