package less06HomeWork;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.height =5;
		rectangle.width=6;
		rectangle.area();
		rectangle.perimetr();
		
		Rectangle rectangle1 = new Rectangle(6, 7);
		rectangle1.area();
		rectangle1.perimetr();
		
		System.out.println("");
		
		Car car = new Car("Black","Mercedes",12, 30 ,10000);
		car.drive(300);
		car.reFuel(30);
		car.distance();
		
		System.out.println();
		
		Car car2 = new Car("White","BMW",8, 10 ,23000);
		car2.drive(100);
	    car2.reFuel(10);
		car2.distance();
	}
}
