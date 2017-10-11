package less16;

import java.io.IOException;

import org.w3c.dom.ranges.RangeException;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		try{
			System.out.println(2/0);
			System.out.println("after exception");
		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace(System.out);
		} catch (RangeException e) {
			e.printStackTrace(System.out);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}catch (Throwable e) {
			e.printStackTrace(System.out);
		}finally {
			
		}
		wrapper();
		System.out.println("by-by");
//		try {
//			System.out.println(asas());
//		} catch (IOException e) {
//			e.printStackTrace(System.out);
//		}
		
	}
	
	static int asas() throws IOException{
		throw new IOException("becose  i wont");
	}
	
	static int wrapper(){
		try{
			return asas();
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
