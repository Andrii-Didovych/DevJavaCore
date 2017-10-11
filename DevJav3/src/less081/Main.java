package less081;

public class Main {

	public static void main(String[] args) {
		Balada balada = new SimpleBallada();
		Bard bard = new Bard("Lutik",new BadEndBalada(new BadStartBalada(balada)) );
		bard.singing();
		
		bard.setBalada(new HeroBalada());
		bard.singing();
	}

}
