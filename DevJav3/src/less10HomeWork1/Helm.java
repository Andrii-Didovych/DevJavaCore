package less10HomeWork1;

public class Helm {

	private int run;

	private Color color;

	private Button button;

	public Helm(int run, Color color, Button button) {
		super();
		this.run = run;
		this.color = color;
		this.button = button;
	}

	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void printHelm() {
		System.out.println(" Опис керма автомобіля: ");
		if (run > 0) {
			System.out.println("  Кермо повернуто " + "вправо на " + run + " градусів.");
		} else if (run == 0) {
			System.out.println("  Кермо не повернутий.");
		} else {
			System.out.println("  Кермо повернуто вліво" + " на " + run * -1 + " градусів.");
		}
		System.out.println("  Наявність кнопок на кермі: " + button + ".");
		System.out.println("  Колір керма - " + color + ".");
		System.out.println("\n***************************************\n");

	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((button == null) ? 0 : button.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + run;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Helm other = (Helm) obj;
		if (button != other.button)
			return false;
		if (color != other.color)
			return false;
		if (run != other.run)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Helm [run=" + run + ", color=" + color + ", button=" + button + "]";
	}

}
