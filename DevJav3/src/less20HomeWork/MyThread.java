package less20HomeWork;

import java.util.Scanner;

public class MyThread extends Thread {

	public MyThread() {
		start();
	}
	@Override
	public void run() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть кількість чисел Фібоначчі: ");
		int array[] = new int[sc.nextInt()];
		System.out.print("MyThread: ");
		array[0] = 1;
		array[1] = 1;
		try {
			for (int i = 0; i < 2; i++) {
				System.out.print(array[i] + " ");
				Thread.sleep(1000);
			}
			for (int i = 2; i < array.length; i++) {
				array[i] = array[i - 2] + array[i - 1];
				System.out.print(array[i] + " ");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();

	}

}
