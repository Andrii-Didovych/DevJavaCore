package less031;

public class Main4 {

	public static void main(String[] args) {
		int array[] = new int[8];
		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * 10 + 1);
			System.out.print(array[i] + " ");
           
		}
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2!=0)
				array[i]=0;
			System.out.print(array[i] + " ");
		}
		
		
	}

}
