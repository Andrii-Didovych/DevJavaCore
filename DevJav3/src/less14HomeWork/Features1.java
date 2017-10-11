package less14HomeWork;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Features1 {
	Scanner sc = new Scanner(System.in);
	
	public void createList(List<Commodity> items){
		
		System.out.println(" ������ ����� ������: ");
		String name = sc.next();

		System.out.println("³���� ���� ������: ");
		int price = sc.nextInt();

		System.out.println("������ ������� ������: ");
		int number = sc.nextInt();

		Commodity commodity = new Commodity(name, price, number);
		items.add(commodity);
		
	}
	
	public void showList(List<Commodity> items){
		for (Commodity commodity : items) {
			System.out.println(commodity);
		}
	}
	
	public void deleteItems(List<Commodity> items){
		System.out.println("������ ����� �����, ���� ������� ��������: ");
		String input = sc.next();
		Iterator<Commodity> iter = items.iterator();
		while (iter.hasNext()) {
			Commodity tmp = iter.next();
			if (tmp.getName().equals(input))
				iter.remove();
		}

	}
	
	public void exchengeItems(List<Commodity> items){
		
		System.out.println("������ ����� ������, ���� ������� ������: ");
		String name = sc.next();
		Iterator<Commodity> iter = items.iterator();
		while (iter.hasNext()) {
			Commodity tmp = iter.next();
			if (tmp.getName().equals(name)) {
				System.out.println("  ������ ���� �����:");
				String rename = sc.next();
				tmp.setName(rename);
				System.out.println("  ������ ���� ����:");
				int reprice = sc.nextInt();
				tmp.setPrice(reprice);
				System.out.println("  ������ ���� �������:");
				int renumber = sc.nextInt();
				tmp.setNumber(renumber);

			}

		}
		
	}

	public void sortItems(List<Commodity> items){
		System.out.println("��� ���������� �� ����� �� ���������, �������� '1';");
		System.out.println("��� ���������� �� ����� �� ��������, �������� '2';");
		System.out.println("��� ���������� �� ������� �� ���������, �������� '3';");
		System.out.println("��� ���������� �� ������� �� ��������, �������� '4';");
		System.out.println("��� ���������� �� ������ �� ���������, �������� '5';");
		System.out.println("��� ���������� �� ������ �� ��������, �������� '6';");
		System.out.println("��� ������ � ������� ���������� �������� ���� ������.");
		boolean isRun1 = true;
		while (isRun1)
			switch (sc.next()) {
			case "1":
				items.sort((o1, o2) -> Integer.compare(o1.getPrice(), o2.getPrice()));
				System.out.println("��� ������ � ������� ���������� �������� ���� ������.");
				break;
			case "2":
				items.sort((o1, o2) -> Integer.compare(o2.getPrice(), o1.getPrice()));
				System.out.println("��� ������ � ������� ���������� �������� ���� ������.");
				break;
			case "3":
				items.sort((o1, o2) -> Integer.compare(o1.getNumber(), o2.getNumber()));
				System.out.println("��� ������ � ������� ���������� �������� ���� ������.");
				break;
			case "4":
				items.sort((o1, o2) -> Integer.compare(o2.getNumber(), o1.getNumber()));
				System.out.println("��� ������ � ������� ���������� �������� ���� ������.");
				break;
			case "5":
				items.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
				System.out.println("��� ������ � ������� ���������� �������� ���� ������.");
				break;
			case "6":
				items.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
				System.out.println("��� ������ � ������� ���������� �������� ���� ������.");
				break;

			default:
				isRun1 = false;
				break;

			}
	}
}
