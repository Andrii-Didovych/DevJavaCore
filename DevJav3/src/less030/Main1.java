package less030;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть суму, яку можна відкласти за рік ");
		int sum = sc.nextInt();
		System.out.println("Введіть ваш вік:");
		int age = sc.nextInt();
		double percent = 0.2;
		double[] res = new double[65 - age + 1];
		res[0] = sum;
		for (int i = 1; i < res.length; i++) {
			res[i] = sum + (res[i - 1] * (1 + percent));
			// System.out.println("Вік = " + (i + age) + " Cума = " + res[i]);
		}
		// System.out.println("В 65 сума заощаджень " + res[res.length - 1]);
		boolean isRun = true;
		while (isRun) {

			System.out.println("Введіть вік коли ви хочите піти на пенсію ");
			System.out.println("введіть 0 щоб вийти з програми");
			int age1 = sc.nextInt();
			if (age1 == 0) {
				isRun = false;
			} else {
				System.out.println("В " + age1 + " сума заощаджень " + res[age1 - age]);
			}

		}
	}

}
