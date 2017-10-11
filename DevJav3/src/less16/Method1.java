package less16;

public class Method1 {

	static int add(int a, int b) throws IllegalAccessException, MyException {
		compare(a, b);
		return a + b;
	}

	static int sub(int a, int b) throws IllegalAccessException, MyException {
		compare(a, b);
		return a - b;
	}

	public static int mult(int a, int b) throws IllegalAccessException, MyException {
		compare(a, b);
		return a * b;
	}

	static int div(int a, int b) throws IllegalAccessException, MyException {
		compare(a, b);
		return a / b;
	}
	
	

	private static void compare(int a, int b) throws IllegalAccessException, MyException {
		if (a < 0 && b < 0) {
			throw new IllegalArgumentException("���� �� ������������ ����� �����!");
		}
		if (a == 0 && b != 0) {
			throw new ArithmeticException("���� �� ������������ �����  �����!");
		}
		if (a != 0 && b == 0) {
			throw new ArithmeticException("���� �� ������������ ����� �����!");
		}
		if (a == 0 && b == 0) {
			throw new IllegalAccessException("���� �� ������������ �������� �����!");
		}
		if (a > 0 && b > 0) {
			throw new MyException("�'��� �����");

		}
	}
}
