package less031;

public class Main5 {

	public static void main(String[] args) {
		int array[] = new int[5];
		double a1 = 0, a2 = 0;
		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * 6);
			a1 = (a1 + array[i]);
			System.out.print(array[i] + " ");
		}
		a1 /= array.length;
		System.out.println("");
		System.out.println("Середнє - " + a1);

		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * 6);
			a2 = (a2 + array[i]);
			System.out.print(array[i] + " ");
		}
		a2 /= array.length;
		System.out.println("");
		System.out.println("Середнє - " + a2);

		if (a1 == a2) {
			System.out.println("Значення рівні");
		} else if (a1 > a2) {
			System.out.println("Значення першого більше");
		} else {
			System.out.println("Значення другого більше");
		}
	}

}
