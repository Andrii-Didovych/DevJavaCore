package less031;

public class Main6 {

	public static void main(String[] args) {
		int array[] = new int[4];
		int a = 0;
		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * 89 + 10);
			System.out.print(array[i] + " ");

		}
		System.out.println("");

		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[i - 1])
				a++;

		}

		if (a == array.length - 1) {
			System.out.println("Масив зростаючої послідовності");
		} else {
			System.out.println("Масив НЕ є зростаючої послідовності");
		}

	}

}
