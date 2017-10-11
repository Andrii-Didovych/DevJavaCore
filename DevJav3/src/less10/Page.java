package less10;

public class Page  {
	
	private final Header header;
	
	private final Body body;
	 
	private final Footer footer;

	public Page(Header header, Body body, Footer footer) {
		this.header = header;
		this.body = body;
		this.footer = footer;
	}

	public void printHeder() { 
		if(header!=null)
		header.printHeder();
	}

	public void printBody() {
		if(body!=null)
		body.printBody();
	}

	public void printFooter() {
		if(footer!=null)
		footer.printFooter();
	}
	
	public void printPage(){
		printHeder();
		printBody();
		printFooter();
	}
	
	

}
