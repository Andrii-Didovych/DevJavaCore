package less17;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import less15HomeWork.Club;
import less15HomeWork.Person;
import less15HomeWork.Pet;

public class MainHomeWork {

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
			case "7": {
				club.oos();
				break;
			}
			case "8": {
				club.ois();
				break;
			}
			case "9": {
			club.writeInBloknot();
				break;
			}
			case "10": {
				club.readWithBloknot();
				break;
			}
			case "11": {
				club.reWriteInBloknot();
				break;
			}
			default:
				System.out.println("�� ���������� ���� �������");
				isRun = false;
			}
		}
	}

}
