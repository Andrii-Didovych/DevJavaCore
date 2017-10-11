package less15HomeWork;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Map<Person, List<Pet>> map = new HashMap<>();
		Club club = new Club(map);
		boolean isRun = true;
		System.out.println("������ 1 ��� ������ �������� ����� ");
		System.out.println("������ 2 ��� ������ �������� �� �������� �����");
		System.out.println("������ 3, ��� �������� �������� � �������� �����");
		System.out.println("������ 4, ��� �������� �������� �����");
		System.out.println("������ 5, ��� �������� ��������� �������� � ��� �������� ");
		System.out.println("������ 6, ��� ������� �� ����� �������  ");
		System.out.println("������ ����� ������, ��� ����� � ��������  ");
		while (isRun) {
			switch (sc.next()) {
			case "1": {
				club.enterPerson();
				break;
			}
			case "2": {
				club.enterPet();
				break;
			}
			case "3": {
				club.deletePet(); 
				
				break;
			}
			case "4": {
				club.deletePerson();
				break;
			}
			case "5": {
				club.deletePetWithAllPerson();         
				break;
			}
			case "6": {
				club.showClub();
				break;
			}
			default:
				System.out.println("�� ���������� ���� �������");
				isRun = false;
			}
		}
		
	}

}
