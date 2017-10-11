package less081HomeWork;

public class Main {

	public static void main(String[] args) {

		Salary sal = new EmployeeHour(50, 200);
		Salary sal2 = new EmployeeMonth(2, 10000);
		sal.print();
		sal2.print();

	}

}
