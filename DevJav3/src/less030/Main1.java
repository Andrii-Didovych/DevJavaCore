package less030;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����, ��� ����� �������� �� �� ");
		int sum = sc.nextInt();
		System.out.println("������ ��� ��:");
		int age = sc.nextInt();
		double percent = 0.2;
		double[] res = new double[65 - age + 1];
		res[0] = sum;
		for (int i = 1; i < res.length; i++) {
			res[i] = sum + (res[i - 1] * (1 + percent));
			// System.out.println("³� = " + (i + age) + " C��� = " + res[i]);
		}
		// System.out.println("� 65 ���� ���������� " + res[res.length - 1]);
		boolean isRun = true;
		while (isRun) {

			System.out.println("������ �� ���� �� ������ ��� �� ����� ");
			System.out.println("������ 0 ��� ����� � ��������");
			int age1 = sc.nextInt();
			if (age1 == 0) {
				isRun = false;
			} else {
				System.out.println("� " + age1 + " ���� ���������� " + res[age1 - age]);
			}

		}
	}

}
