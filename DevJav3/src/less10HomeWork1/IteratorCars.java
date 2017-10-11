package less10HomeWork1;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class IteratorCars {

	public void findCars(List<Car> cars) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\n������ �������� ��� ������: ");
		String input = sc.next();
		System.out.println("������ � ����� ������ '" + input + "':");
		Iterator<Car> iter = cars.iterator();
		while (iter.hasNext()) {
			Car tmp = iter.next();
			if (tmp.getBody().getBodyType() == (BodyType.valueOf(input.toUpperCase())))
				System.out.print(" " + tmp.getBrand());

		}
		System.out.println("\n");
	}

	public void deleteCarsWithColorOfBody(List<Car> cars) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\n������ ���� ������, ���� ������� ��������: ");
		String input = sc.next();
		
		Iterator<Car> iter = cars.iterator();
		while (iter.hasNext()) {
			Car tmp = iter.next();
			if (tmp.getBody().getColor() == (Color.valueOf(input.toUpperCase())))

				iter.remove();
		}
		System.out.println("\n");
	}

	public void changeTire(List<Car> cars) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("\n������ ������� ������ ����:");
		System.out.print("  ������ ��������� �����: ");
		int min = sc.nextInt();
		System.out.print("  ������ ������������ �����: ");
		int max = sc.nextInt();
		
		Iterator<Car> iter = cars.iterator();
		while (iter.hasNext()) {
			Car tmp = iter.next();
			if (tmp.getWheel().getSize() <= max && tmp.getWheel().getSize() >= min)

				tmp.getWheel().setTire(Tire.WINTER);

		}
		System.out.println("\n");
	}

	public void deleteCarsWithBodyEndHelm(List<Car> cars) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("\n������ ��� ������ �� ������� �����:");
		System.out.print("  ������ ��� ������: ");
		String kind = sc.next();
		System.out.print("  ������ ������� �����: ");
		int inHelm = sc.nextInt();
		Iterator<Car> iter = cars.iterator();
		while (iter.hasNext()) {
			Car tmp = iter.next();
			if (tmp.getBody().getBodyType() == (BodyType.valueOf(kind.toUpperCase()))
					&& tmp.getHelm().getRun() == inHelm)
				iter.remove();

		}
		System.out.println("\n");
	}
	
	public void sevIndexOfCar(List<Car> cars) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\n������ ��� ������, ��� �������� ������: ");
		String kind = sc.next();
		System.out.println("  ������ � ����� ������ - '"+kind+"' ����� ������� �������:");
		Iterator<Car> iter = cars.iterator();
		int i=0;
		while (iter.hasNext()) {
			
			Car tmp = iter.next();
			if (tmp.getBody().getBodyType() == (BodyType.valueOf(kind.toUpperCase())))
				System.out.print(" "+ i);
			i++;
		}
		System.out.println("\n");
		
		
	}
	
	public void sevIndexOfCar1(List<Car> cars) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\n������ ��� ������, ��� �������� ������: ");
		String kind = sc.next();
		System.out.println("  ������ � ����� ������ - '"+kind+"' ����� ������� �������:");
		
		ListIterator<Car> listIter = cars.listIterator(cars.size());
		while(listIter.hasPrevious()){
			Car tmp = listIter.previous();
			if (tmp.getBody().getBodyType() == (BodyType.valueOf(kind.toUpperCase())))
			System.out.println(tmp.getBrand()+" "+listIter.nextIndex());
		}
		System.out.println();
		
		
		
	}

}
