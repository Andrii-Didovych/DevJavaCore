package less081HomeWork;

public interface Salary {

	double salary();

	public default void print() {
		System.out.println("�������� ���������: " + this.salary()+" ���.");

	}

}
