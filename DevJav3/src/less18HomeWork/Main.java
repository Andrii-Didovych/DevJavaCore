package less18HomeWork;

public class Main {
	public static void main(String[] args) {
		Object[] array = new Object[10];
		Collection collection = new Collection(array);

		Collection.AnonClass anon = collection.new AnonClass();
		anon.initArray(array);
		
		Collection.StaticClass stClass = new Collection.StaticClass();
		stClass.initArray1(array);
		
		
		
		collection.hasNext();
		
		collection.next();
		
	}
}
