package less16;

public class MainHomeWork {
	

	public static void main(String[] args)  {

		try {
			System.out.println("res "+Method1.add(-1, -1));
		} catch (IllegalAccessException|IllegalArgumentException|ArithmeticException|MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			System.out.println(Method1.sub(0, -1));
		} catch (IllegalAccessException|IllegalArgumentException|ArithmeticException|MyException e) {
			e.printStackTrace(System.out);
		}

		try {
			System.out.println(Method1.mult(1, 0));
		} catch (IllegalAccessException|IllegalArgumentException|ArithmeticException|MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			System.out.println(Method1.div(0, 0));
		} catch (IllegalAccessException|IllegalArgumentException|ArithmeticException|MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			System.out.println(Method1.div(1, 1));
		} catch (IllegalAccessException|IllegalArgumentException|ArithmeticException|MyException e) {
			e.printStackTrace(System.out);
		}
	}

	

	
}
