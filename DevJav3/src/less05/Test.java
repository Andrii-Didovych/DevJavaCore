package less05;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		String[] chars = { "a", "n", "d", "r", "i", "y" };
		String[] chars1 = { "*", "*", "*", "*", "*", "*" };
		System.out.println("Домашній улюбленець: ");
		for (int i = 0; i < chars1.length; i++) {

			System.out.print(chars1[i]);
		}
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc1 = new Scanner(System.in);
		int a = 0;
		while (a < chars.length) {

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("");
			System.out.println("Введіть букву: ");
			String s1 = sc.next();

			for (int i = 0; i < chars.length; i++) {
				if (chars[i].equals(s1)) {
					chars1[i] = s1;
				}
				System.out.print(chars1[i]);
			}
			a++;
		}
	}
	static void test(String  st1[], String st2  ){
		
	}
}
