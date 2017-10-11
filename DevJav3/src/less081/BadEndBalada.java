package less081;

public class BadEndBalada implements Balada {
	
	private final Balada balada;

	public BadEndBalada(Balada balada) {
		this.balada = balada;
	}

	@Override
	public void song() {
		balada.song();
		System.out.println("People:  Boo-boo-boo");
		
	}
	
	
	
	

}
