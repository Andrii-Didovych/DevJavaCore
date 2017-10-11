package less031;



public class Main3 {

	public static void main(String[] args) {
		int array[] = new int[15];
		int a = 0;
		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * 9);
			System.out.print(array[i] + " ");
			if (array[i] % 2 == 0) {
				a++;
			}
		}
		System.out.println("");
		System.out.println(a + " - парних чисел");
	}

}
