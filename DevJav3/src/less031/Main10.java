package less031;

public class Main10 {

	public static void main(String[] args) {
		int am = 0, a0 = 0, a1 = 0;
		int array[] = new int[11];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 3) - 1;
			System.out.print(array[i] + " ");
			
			if (array[i] < 0)
				am++;
			if (array[i] == 0)
				a0++;
			if (array[i] > 0)
				a1++;
			
			if (i == array.length - 1) {
				System.out.println();
				if (am > a0 & am > a1)
					System.out.println("Найчастіше: -1");
				if (a0 > am & a0 > a1)
					System.out.println("Найчастіше: 0");
				if (a1 > am & a1 > a0)
					System.out.println("Найчастіше: 1");
			}
		}
	}

}
