package less081HomeWork;

public class EmployeeMonth implements Salary {

	private final int month;

	private final int cach;

	public EmployeeMonth(int month, int cach) {
		this.month = month;
		this.cach = cach;
	}

	@Override
	public double salary() {
		return month * cach;
	}

}
