package less10HomeWork1;

import java.util.List;
import java.util.Scanner;

public class SearchCars {

	public void searchSizeWheel(List<Car> cars) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\n������ �������� ����� �����: ");
		int size = sc.nextInt();
		System.out.println("  �������� � ������� ����� - " + size + " �����:");
		int j = 0;
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i).getWheel().getSize() == size) {
				System.out.print("  " + cars.get(i).getBrand() + " ");
				j++;
			}
		}
		if (j == 0)
			System.out.print("  �� �� � ������.");

		System.out.println("\n");
	}

	public void searchSizeAndColor(List<Car> cars) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\n������ �������� ����� �����: ");
		int size = sc.nextInt();
		System.out.print("������ �������� ���� ������: ");
		String color = sc.next();
		System.out.println("  �������� � ������� ����� - " + size + " ����� �� �������� ����� - " + color + ":");
		Color colors = Color.valueOf(color.toUpperCase());
		int j = 0;
		for (int i = 0; i < cars.size(); i++)
			if (cars.get(i).getBody().getColor().equals(colors) && cars.get(i).getWheel().getSize() == size) {
				System.out.print("  " + cars.get(i).getBrand() + " ");
				j++;
			}
		if (j == 0)
			System.out.print("  �� �� � ������.");
		System.out.println("\n");

	}

	public void chengHelm(List<Car> cars) {
		String color = "red";
		String buttons = "yes";
		Color colors = Color.valueOf(color.toUpperCase());
		Button button = Button.valueOf(buttons.toUpperCase());
		System.out.println("\n������ � �������� ��������: ");
		for (int i = 0; i < cars.size(); i++)
			if (cars.get(i).getBody().getColor().equals(colors)) {
				System.out.println(" " + cars.get(i).getBrand() + " ");

				if (cars.get(i).getHelm().getButton().equals(button)) {
					System.out.println("  ����� � �������� ������� �� ����� ��� ������.");
					cars.get(i).getHelm().setButton(Button.NO);
					cars.set(i, cars.get(i));
				} else {
					cars.get(i).getHelm().setButton(Button.YES);
					cars.set(i, cars.get(i));
					System.out.println("  ����� ��� ������ ������� �� ����� � ��������.");
				}
				System.out.println("  ������ - " + cars.get(i).getHelm().getButton() + "\n");

			}
	}

	public void ifButtonYes(List<Car> cars) {
		String buttons = "yes";
		Button button = Button.valueOf(buttons.toUpperCase());
		for (int i = 0; i < cars.size(); i++)
			if (cars.get(i).getHelm().getButton().equals(button)) {
				System.out.println("\n������, �� ����� ����� � ��������: ");
				System.out.print("  " + cars.get(i).getBrand() + " \n");
				int size = cars.get(i).getWheel().getSize();
				System.out.println("  ĳ����� ���� - " + size);
				cars.get(i).getWheel().setSize(size * 2);
				cars.set(i, cars.get(i));
				System.out.println("  ĳ����� ���� �������� � ���� - " + cars.get(i).getWheel().getSize() + "\n");

			}
	}

	public void chengCar(List<Car> cars) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\n������ ����� �����: ");
		int inputSize = sc.nextInt();
		for (int i = 0; i < cars.size(); i++) {
			int size = cars.get(i).getWheel().getSize();
			if (size < inputSize) {
				System.out.println("  " + cars.get(i).getBrand() + "  �� ������ ����� ����� �� �������.");
				if (i < cars.size() - 1) {
					cars.set(i, cars.get(i + 1));
				} else {
					cars.set(i, cars.get(0));
				}
				System.out.println("  �� ������� �� - " + cars.get(i).getBrand() + "\n");
			}
		}
	}
}
