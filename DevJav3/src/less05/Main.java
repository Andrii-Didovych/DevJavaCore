package less05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть першу стрічку: ");
		String s1 = sc.next();
		System.out.print("Введіть другу стрічку: ");
		String s2 = sc.next();
		System.out.println("Стандартний метод 'compareTo': " + s1.compareTo(s2));
		System.out.print("Розроблений метод 'compateTo': ");
		int a =compateTo(s1, s2);
		System.out.println(a);

	}

	static int compateTo(String str1, String str2) {
		int res = 0;
		if (str1.length() <= str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				if (str1.codePointAt(i) != str2.codePointAt(i)) {
					
					return  (str1.codePointAt(i) - str2.codePointAt(i));
				}
			}
			System.out.println(res);
		} else {
			for (int i = 0; i < str2.length(); i++) {
				if (str1.codePointAt(i) != str2.codePointAt(i)) {
					
					return str1.codePointAt(i) - str2.codePointAt(i);
				}
			}
			System.out.println(res);
		}
		return res;
	}
}
