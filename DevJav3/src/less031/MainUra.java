package less031;

public class MainUra {
	public static void main(String[] args) {
		int array[][] = new int[5][5];
		int array2[] = new int[5];
		print(array);
		arrayCols(array, array2);

	}

	static void arrayCols(int[][] array, int[] array1) {
		int min = 0;
		min = array[0][0];
		for (int j = 1 ,b=0; j < array.length;b++, j += 2) {
			for (int i = 0; i < array.length; i++) {
				if (array[i][j] < min) {
					min = array[i][j];
			array1[b]=min;
				}
				
			}
			
			System.out.println("Мінімальне значення " + j + " стовпця: " + min);
			min = array[0][j];
		}

	}

	static void print(int[][] array) {
		System.out.println("Масив має вигляд: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random(1, 9);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int random(int min, int max) {
		return (int) Math.round(Math.random() * (max - min) + min);
	}
}
