package less17;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.OutputStream;

//import less11.Gender;
import less11.Person;

public class Main {
	public static void main(String[] args) {
//		Person person = new Person("Ivan", 18, Gender.MALE);
//		OutputStream os = null;
//		ObjectOutputStream oos = null;
//		try{
//			os = new FileOutputStream(new File("sawe.sawe"));
//			oos = new ObjectOutputStream(os);
//			oos.writeObject(person);
//		}catch (IOException e){
//			e.printStackTrace();
//		}finally {
//			if(oos!=null){
//				try {
//					oos.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(os!=null){
//				try {
//					os.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		try(ObjectInputStream ois= 
				new ObjectInputStream(
				new FileInputStream(
				new File("sawe.sawe")))){
			Person person = (Person) ois.readObject();
			System.out.println(person);
			
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
