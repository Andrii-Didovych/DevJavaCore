package less20HomeWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread2 = new MyThread();
		thread2.join();
		Thread thread = new Thread(new RunnableThread());
		thread.start();
		thread.join();
	

		 ExecutorService service = Executors.newFixedThreadPool(2);
	
		 service.shutdown();
		
	}

}
