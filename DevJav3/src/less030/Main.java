package less030;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello Yana!!!");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		System.out.println("Suma = "+ (a+b+9));
		
		
		
	}
}