package less031;

public class Main2 {

	public static void main(String[] args) {
		int[] array = new int[100];

		for (int i = 1; i < array.length; i++) {

			array[i] = i;
			System.out.print(array[i] + " ");

		}
		System.out.println("");
		for (int i = array.length - 1; i > 0; i--) {

			array[i] = i;
			System.out.print(array[i] + " ");

		}

	}

}
