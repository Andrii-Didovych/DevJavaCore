package less22;

import java.util.function.IntPredicate;

import less18.Person;

public class Main {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		print(array, e->true);
		System.out.println();
		print(array,e->e%2==0);
		System.out.println();
		print(array,e->e%3==0);
		new Person.Builder()
				.age(18)
				.name("Ivan")
				.pet("Barsic")
				.pet("Tuzic")
				.pet("Barbos")
				.build();

	}

	static void print(int[] array, IntPredicate filter) {
		
		for (int i = 0; i < array.length; i++) {
			if(filter.test(array[i]))
			System.out.println(array[i]);
		}
	}
	
	

	

}
