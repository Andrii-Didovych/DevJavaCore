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
			System.out.println("������ ������� " + km + "km, ��������� ����� ���������: " + (km + run));
			System.out.println("��������� ��������: " + volume1 + " ����.");
		} else if (volume == 0) {
			System.out.println("��� ������, ������� ������");
		} else {
			km1 = (volume * 100) / consumption;
			System.out.println(
					"������ ������ �������: " + km1 + "km, ��������� ����� ���������: " + (km1 + run) + "km.");
		}
	}

	void reFuel(int fuelVolume) {
		if (volume1 <= fuelVolume) {
			System.out.println("���������� " + (fuelVolume - volume1) + " ���� ������");
		} else {
			System.out.println("��� ������!");
		}

	}

	void distance() {
		if (volume1 <= volume) {
			System.out.println("����: " + color + "; �����: " + brand + "; ������: " + consumption
					+ "; ��'�� ��������: " + (volume - volume1) + "; �����: " + (km1 + run) + "km.");
		} else
			System.out.println("����: " + color + "; �����: " + brand + "; ������: " + consumption
					+ "; ��'�� ��������: ��� ������; �����: " + (km1 + run) + "km.");
	}

}
