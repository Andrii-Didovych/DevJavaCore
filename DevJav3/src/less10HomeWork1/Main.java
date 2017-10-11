package less10HomeWork1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Main {
	public static void main(String[] args) {

		// Helm helm = new Helm(-12, Color.SILVER,Button.NO);
		// Wheel wheel = new Wheel(20, Color.GOLD, Tire.SUMMER);
		// Body body = new Body(12000, Color.BROWN, BodyType.UNIVERSAL);
		// Car car = new Car(helm, wheel, body, Brand.LEXUS);
		// car.printCar();
		// helm.setButton(Button.YES);
		// body.setColor(Color.BLACK);
		// wheel.setSize(15);
		// helm.setColor(Color.BLACK);
		// body.setBodyType(BodyType.SEDAN);
		// Car car1 = new Car(helm, wheel, body, Brand.MERCEDES);
		// car1.printCar();

		Car car1 = new Car(new Helm(18, Color.BLACK, Button.NO), new Wheel(13, Color.BROWN, Tire.SUMMER),
				new Body(1000, Color.GREAN, BodyType.UNIVERSAL), Brand.TOYOTA);
		car1.printCar();
		Car car2 = new Car(new Helm(18, Color.BLACK, Button.YES), new Wheel(17, Color.BROWN, Tire.WINTER),
				new Body(1000, Color.RED, BodyType.LEMUSIN), Brand.AUDY);
		car2.printCar();
		Car car3 = new Car(new Helm(18, Color.BLACK, Button.NO), new Wheel(16, Color.BROWN, Tire.SUMMER),
				new Body(1000, Color.BROWN, BodyType.PICAP), Brand.HONDA);
		car3.printCar();
		Car car4 = new Car(new Helm(18, Color.BLACK, Button.NO), new Wheel(19, Color.BLACK, Tire.SUMMER),
				new Body(1000, Color.RED, BodyType.SEDAN), Brand.MERCEDES);
		car4.printCar();
		Car car5 = new Car(new Helm(18, Color.BLACK, Button.NO), new Wheel(17, Color.BROWN, Tire.SUMMER),
				new Body(1000, Color.BROWN, BodyType.PICAP), Brand.LEXUS);
		car5.printCar();

		List<Car> cars = new ArrayList<>();

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		
		Set<Car> carsLink = new LinkedHashSet<>();
		carsLink.add(car1);
		carsLink.add(car2);
		carsLink.add(car3);
		carsLink.add(car4);
		carsLink.add(car5);
		
		int select = 1;
		System.out.println("��� ������ �� ������ �����,                           ������ '1';");
		System.out.println("��� ������ �� �������  ����� � �������� ����          ������ '2';");
		System.out.println("��� ������� ����� � ����� � �������� ��������,         ������ '3';");
		System.out.println("�������� ������ ���� � ����, ���� ����� �� ������, ������ '4';");
		System.out.println("����� ������ �� ����, ���� ����� ����� �������,      ������ '5';");
		System.out.println("������ ������ � �������� ����� ������,                  ������ '6';");
		System.out.println("�������� ������ � �������� �������� ������,             ������ '7';");
		System.out.println("�������, ���� �� �����, ����� ���� ������ � ������� ������ '8';");
		System.out.println("�������� ������, �� ����� ��� ������ �� ������ �����  ������ '9';");
		System.out.println("�����'����� ������ �����, �� ����� �������� ��� ������ ������ '10';");
		System.out.println("������ ��� ���, ���� ���� ������ � ����� ����� ����.������ '11';");
		System.out.println("�������� ������ � ������� ��������� �����             ������ '12';");
		System.out.println("������ ������ � �������� ��������� ����� �� ����� ��� ������ '13';");
		System.out.println("��� ������ � ��������                                   ������ '0'.");
		while (select != 0) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �����: ");
			select = sc.nextInt();
			
			SearchCars searchCars = new SearchCars();
			IteratorCars iteratorCars = new IteratorCars();
			HashSetCars setCars = new HashSetCars();
			
			switch (select) {
			case 1:
				searchCars.searchSizeWheel(cars);
				break;
			case 2:
				searchCars.searchSizeAndColor(cars);
				break;
			case 3:
				searchCars.chengHelm(cars);
				break;
			case 4:
				searchCars.ifButtonYes(cars);
				break;
			case 5:
				searchCars.chengCar(cars);
				break;
			case 6:
				iteratorCars.findCars(cars);
				break;
			case 7:
				iteratorCars.deleteCarsWithColorOfBody(cars);
				System.out.println(cars);
				break;
			case 8:
				iteratorCars.changeTire(cars);
				System.out.println(cars);
				break;
			case 9:
				iteratorCars.deleteCarsWithBodyEndHelm(cars);
				System.out.println(cars);
				break;
			case 10:
				iteratorCars.sevIndexOfCar1(cars);
				break;
			case 11:
				setCars.findCarsWithColorEndSize(carsLink);
				break;
			case 12:
				setCars.deleteCarsWithSizeOfWheel(carsLink);
				System.out.println(carsLink);
				break;
			case 13:
				setCars.findCarsWithTireEndSizeOfWheel(carsLink);
				break;
			}
			
		
		}
		System.out.println(cars);

		
	}

}
