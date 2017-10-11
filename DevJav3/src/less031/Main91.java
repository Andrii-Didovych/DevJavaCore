package less031;

public class Main91 {
	public static void main(String[] args) {
		int array1[] = new int[10];
		int array2[] = new int[10];
		double array3[] = new double[10];
		int a = 0;
		for (int i = 0, d = 1; d < 4; i++) {

			if (d == 1) {
				array1[i] = (int) (Math.random() * 8) + 1;
				if (i == 0)
					System.out.print("");
				System.out.print(array1[i] + " ");
				if (i == array1.length - 1) {
					d++;
					i = 0;
					System.out.println(" ");
				}
			}
			if (d == 2) {
				array2[i] = (int) (Math.random() * 8) + 1;
				if (i == 0)
					System.out.print("");
				System.out.print(array2[i] + " ");
				if (i == array1.length - 1) {
					d++;
					i = 0;
					System.out.println(" ");
				}
			}
			if (d == 3) {
				array3[i] = (double) array1[i] / array2[i];
				if (i == 0)
					System.out.print("");
				System.out.print(array3[i] + "  ");
				if (i == array3.length - 1) {
					d++;
					i = 0;
					System.out.println(" ");

				}

			}
			if (d == 4) {
				if (array3[i] % (int) (array3[i]) == 0) {
					a++;
				}
				break;
			}
		}
		System.out.println(a);
	}
}
