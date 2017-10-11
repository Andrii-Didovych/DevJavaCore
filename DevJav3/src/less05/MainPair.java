package less05;

import java.util.Scanner;

public class MainPair {

	public static void main(String[] args) {
		String str = "12345";
		int i=5;
		while(i>0){
		
		String str1 = "abcde";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть букву: ");
		String s1 = sc.next();
			compateTo(s1, str1, str);
			i--;
		}
		
	}

	static void compateTo(String str1, String str2, String str3) {
		int a = 0;
		if (str1.length() <= 1) {
		
			{

				for (int i = 0; i < str2.length(); i++) {
					if (str1.codePointAt(0) == str2.codePointAt(i)) {
						System.out.println(str3.replace(str3.charAt(i), (str2.charAt(i))));
						str3 = (str3.replace(str3.charAt(i), (str2.charAt(i))));						break;
					}
					a++;
				}
				if (a == str2.length()) {
					System.out.println("Такої букви немає! ");
				}

			}
		} else {
			System.out.println("Можна вводити тільки одну букву! ");
		}

	}
}
