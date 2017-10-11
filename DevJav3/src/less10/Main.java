package less10;

public class Main {

	public static void main(String[] args) {
		Header header = new SimpleHeader();
		Body body = new SimpleBody();
		Footer footer = new SimpleFooter();
		Page page = new Page(header, body, footer);
		page.printPage();
		
		Body leftBody = new LeftBody();
		Page leftPage = new Page(header, leftBody, footer);
		System.out.println();
		leftPage.printPage();
		
		Page leftPageNotFooter = new Page(header, leftBody, null);
		System.out.println();
		leftPageNotFooter.printPage();


	}

}
