package less05;

public class Main1 {

	public static void main(String[] args) {
		Pair[] questions = new Pair[5];
		questions[0] = new Pair("������� �������� '���� �����'", "��������");
		questions[1] = new Pair("�� ������� 1908 �. ����� ����������� ������������ �������� � ������� ������� ����� � ������� ��... ", "������");
		questions[2] = new Pair("���������� ������������� ������� ����������������� ���.", "ĳ����");
		questions[3] = new Pair("�������� ����� � ������� ����� ���.", "�����");
		questions[4] = new Pair("���������� ��� ���� ������� � ���.", "�������");
		questions[random(0, 4)].startGame();
	}
	
	static int random(int min, int max){
		return (int) Math.round(Math.random()*(max-min)+min);
	}
	
}