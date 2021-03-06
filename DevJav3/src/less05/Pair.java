package less05;

import java.util.Scanner;

public class Pair {

	public final String question;

	public final String answer;

	private int correct = 0;

	private final String[] correctAnswers;

	public Pair(String question, String answer) {
		this.question = question;
		this.answer = answer;
		correctAnswers = new String[answer.length()];
	}

	void startGame() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		String stars = "";
		for (int i = 0; i < answer.length(); i++) {
			stars += "*";
		}
		System.out.println("³������: " + stars + " " + stars.length());
		int count = 5;
		System.out.println("���������� ����� " + count);
		boolean isRun = true;
		while (isRun) {
			System.out.println("������ �����");
			String letter = sc.next();
			if (!containsLetter(letter)) {
				System.out.println("�� ����");
				count--;
				System.out.println("���������� ����� " + count);
			} else {
				stars = currentStars(letter);
				System.out.println("³������: " + stars + " " + stars.length());
			}
			isRun = correct != answer.length() && count != 0;
		}
	}

	boolean containsLetter(String letter) {
		return answer.toUpperCase().contains(letter.toUpperCase());
	}

	String currentStars(String letter) {
		String stars = "";
		for (int i = 0; i < answer.toUpperCase().length(); i++) {
			if (answer.toUpperCase().charAt(i) == letter.toUpperCase().charAt(0)) {
				correct++;
				stars += letter;
				correctAnswers[i] = letter;
			} else if (correctAnswers[i] != null) {
				stars += correctAnswers[i];
			} else {
				stars += "*";
			}
		}
		return stars;
	}
}
