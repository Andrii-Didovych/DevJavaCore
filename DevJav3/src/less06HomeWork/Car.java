package less06HomeWork;

public class Car {

	String color;
	String brand;
	double consumption;
	double volume;
	double run;
	double volume1;
	double km1;

	Car(String color, String brand, double consumption, double volume, double run) {
		this.color = color;
		this.brand = brand;
		this.consumption = consumption;
		this.volume = volume;
		this.run = run;
	}

	void drive(int km) {
		volume1 = (consumption * km) / 100;
		if (volume1 <= volume) {
			km1 = km;
			System.out.println("Машина проїхала " + km + "km, загальний пробіг становить: " + (km + run));
			System.out.println("Витрачено пального: " + volume1 + " літрів.");
		} else if (volume == 0) {
			System.out.println("Бак пустий, запрвте машину");
		} else {
			km1 = (volume * 100) / consumption;
			System.out.println(
					"Машина змогла проїхати: " + km1 + "km, загальний пробіг становить: " + (km1 + run) + "km.");
		}
	}

	void reFuel(int fuelVolume) {
		if (volume1 <= fuelVolume) {
			System.out.println("Залишилось " + (fuelVolume - volume1) + " літрів палива");
		} else {
			System.out.println("Бак пустий!");
		}

	}

	void distance() {
		if (volume1 <= volume) {
			System.out.println("Колір: " + color + "; Марка: " + brand + "; Розхід: " + consumption
					+ "; Об'єм пального: " + (volume - volume1) + "; Пробіг: " + (km1 + run) + "km.");
		} else
			System.out.println("Колір: " + color + "; Марка: " + brand + "; Розхід: " + consumption
					+ "; Об'єм пального: Бак пустий; Пробіг: " + (km1 + run) + "km.");
	}

}
