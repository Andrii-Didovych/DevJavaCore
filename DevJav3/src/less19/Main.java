package less19;

public class Main {

	public static void main(String[] args) {
		Container<String> container = new Container<String>("hello");
		System.out.println(container.getElement().charAt(1));
	
	}
}
