package less06HomeWork;

public class Rectangle {

	double width;
	double height;

	Rectangle() {
	}

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	void area() {
		System.out.println("����� ������������ = " + width * height);
	}

	void perimetr() {
		System.out.println("�������� ������������ = " + (width + height) * 2);

	}

}
