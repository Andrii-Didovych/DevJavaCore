package less10HomeWork1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashSetCars {

	public void findCarsWithColorEndSize(Set<Car> cars) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\n������ �������� ���� ������: ");
		String colorBody = sc.next();
		Color color = Color.valueOf(colorBody.toUpperCase());
		System.out.print("������ �������� ����� �����: ");
		int sizeWheel = sc.nextInt();
		System.out.print("������ ����: ");
		String tire = sc.next();
		Tire tire2 = Tire.valueOf(tire.toUpperCase());
		System.out.println("   ������ � �������� ������ '" + colorBody + "' �� ������� �����: '" + sizeWheel + "':");

		Iterator<Car> iter = cars.iterator();
		while (iter.hasNext()) {
			Car tmp = iter.next();
			if (tmp.getBody().getColor().equals(color) && tmp.getWheel().getSize() == sizeWheel) {
				System.out.print("   ����� ������ - " + tmp.getBrand() + "; ������ ��� ��� - "
						+ tmp.getWheel().getTire() + "; ");
				tmp.getWheel().setTire(tire2);
				System.out.println("���� ������ �� " + tmp.getWheel().getTire() + ".");
			}

		}
		System.out.println();
	}

	public void deleteCarsWithSizeOfWheel(Set<Car> cars) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("\n������ ������� ������ ����:");
		System.out.print("  ������ ��������� �����: ");
		int min = sc.nextInt();
		System.out.print("  ������ ������������ �����: ");
		int max = sc.nextInt();
		System.out.print("   �������� ������� ������: ");

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
		System.out.print("\n������ ��� ���: ");
		String tireOfWheel = sc.next();
		Tire tire = Tire.valueOf(tireOfWheel.toUpperCase());
		System.out.println("������ ������� ������ ����:");
		System.out.print("  ������ ��������� �����: ");
		int min = sc.nextInt();
		System.out.print("  ������ ������������ �����: ");
		int max = sc.nextInt();
		System.out.print("    ������ � ��������� �����������: ");

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
