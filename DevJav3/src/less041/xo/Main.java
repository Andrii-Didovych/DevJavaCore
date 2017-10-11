package less041.xo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] array = new int[3][3];
		print(array);
		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			user(array, sc);
			System.out.println("User move");
			print(array);
			if (isEndOfGame(array))
				break;
			cpu1(array);
			System.out.println("Cpu move");
			print(array);
			boolean isUserWin = whoWine1(array, 1);
			boolean isCpuWin = whoWine1(array, -1);
			if (isUserWin || isCpuWin) {
				isRun = false;
				if (isCpuWin) {
					System.out.println("Cpu winner");
				} else {
					System.out.println("User winner");
				}
			}
		}

	}

	static boolean isEndOfGame(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 0)
					return false;
			}
		}
		return true;
	}

	// static boolean whoWine(int[][]array, int xz){
	// if(array[0][0]+array[0][1]+array[0][2]== xz*3) return true;
	// if(array[1][0]+array[1][1]+array[1][2]== xz*3) return true;
	// if(array[2][0]+array[2][1]+array[2][2]== xz*3) return true;
	// if(array[0][0]+array[1][0]+array[2][0]== xz*3) return true;
	// if(array[0][1]+array[1][1]+array[2][1]== xz*3) return true;
	// if(array[0][2]+array[1][2]+array[2][2]== xz*3) return true;
	// if(array[0][0]+array[1][1]+array[2][2]== xz*3) return true;
	// if(array[0][2]+array[1][1]+array[2][0]== xz*3) return true;
	// return false;
	// }

	static boolean whoWine1(int[][] array, int xz) {
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				sum = sum + array[i][j];
				if (sum == xz * 3)
					return true;
			}
		}

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				sum1 = sum1 + array[i][j];
				if (sum1 == xz * 3)
					return true;
			}
		}

		if (array[0][0] + array[1][1] + array[2][2] == xz * 3)
			return true;
		if (array[0][2] + array[1][1] + array[2][0] == xz * 3)
			return true;
		return false;
	}

	// static void cpu(int[][] array) {
	// int x = random(0, 2);
	// int y = random(0, 2);
	// if (array[x][y] == 0) {
	// array[x][y] = -1;
	// } else {
	// cpu(array);
	// }
	// }
	static void cpu1(int[][] array) {
		int x = random(0, 2);
		int y = random(0, 2);
		while (array[x][y] != 0) {
			x = random(0, 2);
			y = random(0, 2);
		}
		array[x][y] = -1;
	}

	static int random(int min, int max) {
		return (int) Math.round(Math.random() * (max - min) + min);
	}

	static void user(int[][] array, Scanner sc) {
		System.out.println("Enter x:");
		int x = sc.nextInt();
		System.out.println("Enter y:");
		int y = sc.nextInt();
		while (array[x][y] != 0) {
			System.out.println("Це місце вже зайняте, введіть нові координати: ");
			System.out.println("Enter x:");
			x = sc.nextInt();
			System.out.println("Enter y:");
			y = sc.nextInt();
		}
		array[x][y] = 1;

	}

	static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 0)
					System.out.print("  ");
				if (array[i][j] == 1)
					System.out.print("x ");
				if (array[i][j] == -1)
					System.out.print("y ");
			}
			System.out.println();
		}
	}
}
