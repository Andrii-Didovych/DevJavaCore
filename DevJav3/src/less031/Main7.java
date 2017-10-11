package less031;

public class Main7 {

	public static void main(String[] args) {
		int array[] = new int[20];
		array[0] = 1;
		array[1] = 1;
		System.out.print(array[0] + " " + array[1] + " ");
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 2] + array[i - 1];
			System.out.print(array[i] + " ");
		}
	}

}
