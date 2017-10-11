package less031;

public class Main8 {

	public static void main(String[] args) {
		int array[] = new int[12];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 30 - 15 + 1);
			System.out.print(array[i] + " ");
		}
		int max = array[0];
		int pos = 0;
		for (int i = 1; i < array.length; i++) {

			if (max <= array[i]) {
				max = array[i];
				pos = i + 1;
			}
		}
		System.out.println();
		System.out.println("Максимальне число:  " + max);
		System.out.println("Позиція " + pos);
	}
}
