package less081HomeWork;

public class EmployeeHour implements Salary {

	private final int hour;

	private final int cash;

	public EmployeeHour(int hour, int cash) {
		this.hour = hour;
		this.cash = cash;
	}

	@Override
	public double salary() {
		return hour * cash;
	}

}
