package less030;

import java.util.Random;
import java.util.UUID;

public class Main2 {

	public static void main(String[] args) {
		System.out.println((int) (Math.random() * 10 + 5 + 1));
		System.out.println(Math.round(Math.random() * 10 + 5));
		Random random = new Random();
		System.out.println(random.nextInt(10));
		System.out.println(UUID.randomUUID());
	}

}
