package less20HomeWork;

import java.util.Scanner;

public class RunnableThread implements Runnable {

    @Override
    public void run() {

    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть кількість чисел Фібоначчі для реверсу: ");
		int array[] = new int[sc.nextInt()];
		System.out.print("RunnableThread: ");
		array[0] = 1;
		array[1] = 1;
		for (int i = 0; i < 2; i++) {
		}
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 2] + array[i - 1];
		}
		try {
			for (int i = array.length-1; i >= 0; i--) {
				System.out.print(array[i] + " ");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
    }
}