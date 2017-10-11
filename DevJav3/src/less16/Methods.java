package less16;

public class Methods {

	static int add(int a, int b) throws IllegalAccessException {

		if (a < 0 && b < 0) {
			throw new IllegalArgumentException("«м≥нн≥ не задов≥льн€ють першу умову!");
		}
		if (a == 0 && b != 0) {
			throw new ArithmeticException("«м≥нн≥ не задов≥льн€ють другу  умовe!");
		}
		if (a != 0 && b == 0) {
			throw new ArithmeticException("«м≥нн≥ не задов≥льн€ють третю умови!");
		}
		if (a == 0 && b == 0) {
			throw new IllegalAccessException("„етверта умова не виконуЇтьс€!");
		}

		return a + b;

	}

	static int sub(int a, int b) throws IllegalAccessException, MyException {

		if (a < 0 && b < 0) {
			throw new IllegalArgumentException("«м≥нн≥ не задов≥льн€ють першу умову!");
		}
		if (a == 0 && b != 0) {
			throw new ArithmeticException("«м≥нн≥ не задов≥льн€ють другу  умови!");
		}
		if (a != 0 && b == 0) {
			throw new ArithmeticException("«м≥нн≥ не задов≥льн€ють  третю умови!");
		}
		if (a == 0 && b == 0) {

			throw new IllegalAccessException("„етверта умова не виконуЇтьс€!");

		}
		if (a > 0 && b > 0) {

			throw new MyException("п€та умова");

		}
		

		return a - b;

	}

	public static int mult(int a, int b) throws IllegalAccessException {

		if (a < 0 && b < 0) {
			throw new IllegalArgumentException("«м≥нн≥ не задов≥льн€ють першу умову!");
		}
		if (a == 0 && b != 0 ) {
			throw new ArithmeticException("«м≥нн≥ не задов≥льн€ють другу умови!");
		}
		if (a != 0 && b == 0) {
			throw new ArithmeticException("«м≥нн≥ не задов≥льн€ють третю умови!");
		}
		if (a == 0 && b == 0) {
			throw new IllegalAccessException("„етверта умова не виконуЇтьс€!");
		}

		return a * b;

	}

	static int div(int a, int b) throws IllegalAccessException {
//
//		if (a < 0 && b < 0) {
//			throw new IllegalArgumentException("«м≥нн≥ не задов≥льн€ють першу умову!");
//		}
//		if (a == 0 && b != 0 ) {
//			throw new ArithmeticException("«м≥нн≥ не задов≥льн€ють другу  умови!");
//		}
//		if (a != 0 && b == 0) {
//			throw new ArithmeticException("«м≥нн≥ не задов≥льн€ють  третю умови!");
//		}
//		if (a == 0 && b == 0) {
//			throw new IllegalAccessException("„етверта умова не виконуЇтьс€!");
//		}
		compare(a, b);

		return a / b;

	}
	
	private static void compare(int a, int b) throws IllegalAccessException{
		if (a < 0 && b < 0) {
			throw new IllegalArgumentException("«м≥нн≥ не задов≥льн€ють першу умову!");
		}
		if (a == 0 && b != 0 ) {
			throw new ArithmeticException("«м≥нн≥ не задов≥льн€ють другу  умови!");
		}
		if (a != 0 && b == 0) {
			throw new ArithmeticException("«м≥нн≥ не задов≥льн€ють  третю умови!");
		}
		if (a == 0 && b == 0) {
			throw new IllegalAccessException("„етверта умова не виконуЇтьс€!");
		}
	}
}
