package less031;

public class Main1 {
	public static void main(String[] args) {

		int[] array = new int[10];

		for (int i = 1, j = 0; i <= array.length; i++, j++) {

			array[j] = i * 2;
			System.out.print(array[j] + " ");

		}
		System.out.println("");

		for (int i = 0; i < array.length; i++) {
			array[i] = i * 2 + 2;
			System.out.println(array[i]);
		}
	}
}