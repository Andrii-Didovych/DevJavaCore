package less081;

public class Bard {
	
	private String name;
	
	private Balada balada;

	public Bard(String name, Balada balada) {
		this.name = name;
		this.balada = balada;
	}
	
	public void singing(){
		balada.song();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Balada getBalada() {
		return balada;
	}

	public void setBalada(Balada balada) {
		this.balada = balada;
	}


	
	

}
