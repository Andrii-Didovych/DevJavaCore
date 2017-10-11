package less18HomeWork;

public class Collection implements Iterator {

	private Object[] arr;

	public Collection(Object[] arr) {
		super();
		this.arr = arr;
	}

	public Collection() {
		super();
	}
	
	

	@SuppressWarnings("unused")
	@Override
	public boolean hasNext() {
	
		
		for (int i = 0; i < arr.length; i++) {
		if(i!=arr.length);
		return true;
		}
		return false;
	}

	@Override
	public void next() {
		initArray(arr);
		System.out.println("вивід в зворотньому порядку через один:");
		for (int i = arr.length - 1; i > 0; i--) {
			if (i % 2 != 0)
				System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	class AnonClass {
		void initArray(Object[] arr) {
			System.out.println("Ініціалізація масиву:");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) Math.round(Math.random() * 9 + 1);
				System.out.print(arr[i] + " ");
			}
			System.out.println("\nвивід в зворотньому порядку через один:");
			for (int i = arr.length - 3; i > 0; i = i - 3) {
				if (i % 2 != 0)
					System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

	}
	
//	class LocalClass{
//		public void initArray2(Object[] arr) {
//			System.out.println("Ініціалізація масиву:");
//			for (int i = 0; i < arr.length; i++) {
//				arr[i] = (int) Math.round(Math.random() * 9 + 1);
//				System.out.print(arr[i] + " ");
//			}
//			System.out.println("\nвивід в зворотньому порядку через один:");
//			for (int i = 1; i<arr.length; i =i+2) {
//				if (i % 2 != 0)
//					arr[i] =(int) arr[i]+1;
//					System.out.print(arr[i] + " ");
//			}
//			System.out.println();
//		}
//	}
 	public static void initArray4(){
		
	}
	public static class StaticClass {
		public void initArray1(Object[] arr) {
			System.out.println("Ініціалізація масиву:");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) Math.round(Math.random() * 9 + 1);
				System.out.print(arr[i] + " ");
			}
			System.out.println("\nвивід в зворотньому порядку через один:");
			for (int i = 1; i<arr.length; i =i+2) {
				if (i % 2 != 0)
					arr[i] =(int) arr[i]+1;
					System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public void initArray(Object[] arr) {
		System.out.println("Ініціалізація масиву:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.round(Math.random() * 9 + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
