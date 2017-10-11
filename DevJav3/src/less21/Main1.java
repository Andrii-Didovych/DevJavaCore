package less21;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main1 {

	public static void main(String[] args) throws ReflectiveOperationException {

		Class<?> petClass = Class.forName("less21.Pet");
		Field[] fields = petClass.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName()+" " + field.getType());
		}
		Pet pet = new Pet("Barsik", "Dog");
		
		Field nameField = petClass.getDeclaredField("name");
		nameField.setAccessible(true);
		Object name = nameField.get(pet);
		
		Field kindField = petClass.getDeclaredField("kind");
		kindField.setAccessible(true);
		Object kind = kindField.get(pet);
		System.out.println(name+" "+kind);
		
		Object pet1 = petClass.newInstance();
		
		nameField.set(pet1, name);
		kindField.set(pet1, kind);
		System.out.println(pet1);
		
		Method getName = petClass.getDeclaredMethod("getName");
		Method getKind = petClass.getDeclaredMethod("getKind");
		
		Object name1 = getName.invoke(pet);
		Object kind1 = getKind.invoke(pet);
		System.out.println(name1+" "+kind1);
		
		Method setName = petClass.getDeclaredMethod("setName",String.class);
		Method setKind = petClass.getDeclaredMethod("setKind",String.class);
		
		Object pet2 = petClass.newInstance();
		
		setName.invoke(pet2, name1);
		setKind.invoke(pet2, kind1);
		System.out.println(pet2);
		
		
	}

}
