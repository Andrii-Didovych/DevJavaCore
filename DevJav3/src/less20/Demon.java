package less20;

public class Demon extends Thread {

	public Demon() {
		setDaemon(true);
		start();
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("Loading");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
