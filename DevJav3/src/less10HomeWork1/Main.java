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
		System.out.println("Для пошуку по розміру дисків,                           введіть '1';");
		System.out.println("Для пошуку за розміром  дисків і кольором авто          введіть '2';");
		System.out.println("Щоб замінити кермо у машин з червоним кольором,         введіть '3';");
		System.out.println("Збільшити діаметр коліс у двічі, якщо кермо має кнопки, введіть '4';");
		System.out.println("Заміна машини на іншу, якщо розмір дисків замалий,      введіть '5';");
		System.out.println("Знайти машини з вказаним типом кузова,                  введіть '6';");
		System.out.println("Видалити машини з вказаним кольором кузова,             введіть '7';");
		System.out.println("Замінити, шини на зимові, диски яких лежать в діапазоні введіть '8';");
		System.out.println("Видалити машини, які мають тип кузова та діаметр керма  введіть '9';");
		System.out.println("Запам'ятати індекс машин, які мають введений тип кузова введіть '10';");
		System.out.println("Змінити тип шин, якщо колір кузова і розмір дисків введ.введіть '11';");
		System.out.println("Видалити машини з заданим діапазоном дисків             введіть '12';");
		System.out.println("Знайти машини з введеним діапазоном дисків та типом шин введіть '13';");
		System.out.println("Для виходу з програми                                   введіть '0'.");
		while (select != 0) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.print("Введіть цифру: ");
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
