package less05;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		int j = 0;
		j=random(0,2);
		if (j == 0) {
			String st0 = "������� �������� '���� �����'.";
			String[] st1 = { "�", "�", "�", "�", "�", "�", "�", "�" };
			String[] st2 = { "*", "*", "*", "*", "*", "*", "*", "*" };
			test(st0, st1, st2); 
		}else if(j==1){
			String st0 = "�������� ����� � ������� ����� ���.";
			String[] st1 = { "�", "�", "�", "�", "�", "�" };
			String[] st2 = { "*", "*", "*", "*", "*", "*" };
			test(st0, st1, st2);

		}else if(j==2){
			String st01 = "���������� ������������� ������� ����������������� ���.";
			String[] st1 = { "�", "�", "�", "�", "�", "�" };
			String[] st2 = { "*", "*", "*", "*", "*", "*" };
			test(st01, st1, st2);
		}
		
	}
	
	static int random(int min, int max){
		return (int) Math.round(Math.random()*(max-min)+min);
	}

	static void test(String st0, String st1[], String st2[]) {
		System.out.println(st0);
		System.out.println("ʳ������ ����: " + st1.length);
		int a = 0;
		while (a < st1.length) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("������ �����: ");
			String s = sc.next();
			for (int i = 0; i < st1.length; i++) {
				if (st1[i].equals(s)) {
					st2[i] = s;
				}
				System.out.print(st2[i]);
			}
			a++;
			System.out.println("");
			System.out.println("���������� " + (st1.length - a) + " �����(�)");
		}
	}
}
