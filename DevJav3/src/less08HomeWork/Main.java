package less08HomeWork;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("����� ����: "+MyMath.area(10));
		System.out.println("������� ����: "+MyMath.length(10));
		System.out.println("���� ������: "+MyMath.gravity(70));
		 
		System.out.println();
		Cow cow = new Cow();
		cow.voice();
		Cat cat = new Cat();
		cat.voice();
		Dog dog = new Dog();
		dog.voice();		

	}

}
