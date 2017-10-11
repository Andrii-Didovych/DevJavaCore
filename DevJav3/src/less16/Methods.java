package less16;

public class Methods {

	static int add(int a, int b) throws IllegalAccessException {

		if (a < 0 && b < 0) {
			throw new IllegalArgumentException("���� �� ������������ ����� �����!");
		}
		if (a == 0 && b != 0) {
			throw new ArithmeticException("���� �� ������������ �����  ����e!");
		}
		if (a != 0 && b == 0) {
			throw new ArithmeticException("���� �� ������������ ����� �����!");
		}
		if (a == 0 && b == 0) {
			throw new IllegalAccessException("�������� ����� �� ����������!");
		}

		return a + b;

	}

	static int sub(int a, int b) throws IllegalAccessException, MyException {

		if (a < 0 && b < 0) {
			throw new IllegalArgumentException("���� �� ������������ ����� �����!");
		}
		if (a == 0 && b != 0) {
			throw new ArithmeticException("���� �� ������������ �����  �����!");
		}
		if (a != 0 && b == 0) {
			throw new ArithmeticException("���� �� ������������  ����� �����!");
		}
		if (a == 0 && b == 0) {

			throw new IllegalAccessException("�������� ����� �� ����������!");

		}
		if (a > 0 && b > 0) {

			throw new MyException("���� �����");

		}
		

		return a - b;

	}

	public static int mult(int a, int b) throws IllegalAccessException {

		if (a < 0 && b < 0) {
			throw new IllegalArgumentException("���� �� ������������ ����� �����!");
		}
		if (a == 0 && b != 0 ) {
			throw new ArithmeticException("���� �� ������������ ����� �����!");
		}
		if (a != 0 && b == 0) {
			throw new ArithmeticException("���� �� ������������ ����� �����!");
		}
		if (a == 0 && b == 0) {
			throw new IllegalAccessException("�������� ����� �� ����������!");
		}

		return a * b;

	}

	static int div(int a, int b) throws IllegalAccessException {
//
//		if (a < 0 && b < 0) {
//			throw new IllegalArgumentException("���� �� ������������ ����� �����!");
//		}
//		if (a == 0 && b != 0 ) {
//			throw new ArithmeticException("���� �� ������������ �����  �����!");
//		}
//		if (a != 0 && b == 0) {
//			throw new ArithmeticException("���� �� ������������  ����� �����!");
//		}
//		if (a == 0 && b == 0) {
//			throw new IllegalAccessException("�������� ����� �� ����������!");
//		}
		compare(a, b);

		return a / b;

	}
	
	private static void compare(int a, int b) throws IllegalAccessException{
		if (a < 0 && b < 0) {
			throw new IllegalArgumentException("���� �� ������������ ����� �����!");
		}
		if (a == 0 && b != 0 ) {
			throw new ArithmeticException("���� �� ������������ �����  �����!");
		}
		if (a != 0 && b == 0) {
			throw new ArithmeticException("���� �� ������������  ����� �����!");
		}
		if (a == 0 && b == 0) {
			throw new IllegalAccessException("�������� ����� �� ����������!");
		}
	}
}
