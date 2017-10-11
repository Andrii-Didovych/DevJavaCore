package less081;

public class BadStartBalada implements Balada {

	private final Balada balada;

	public BadStartBalada(Balada balada) {
		this.balada = balada;
	}

	@Override
	public void song() {
		System.out.println("People: boo boo boo");
		balada.song();
	}

}
