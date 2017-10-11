package less08HomeWork;

public class MyMath {
	static final double pi=3.14;
	static final double g=9.8;
	
	
	 static double area(double radius){
		return Math.pow(radius, 2)*pi;
	}
	 
	 static double length(double radius){
		 return 2*pi*radius;
	 }
	 
	 static double gravity(double mass){
		 return mass*g;
	 }
	
	
	

}
