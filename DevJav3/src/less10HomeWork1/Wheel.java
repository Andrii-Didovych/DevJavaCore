package less10HomeWork1;

public class Wheel {

	private int size;

	private Color color;

	private Tire tire;

	public Wheel(int size, Color color, Tire tire) {
		super();
		this.size = size;
		this.color = color;
		this.tire = tire;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public void printWheel() {
		System.out.println(" Опис дисків:");
		System.out.println("  Розмір дисків - " + size + " дюймів.");
		System.out.println("  Колір дисків - " + color + ".");
		System.out.println("  Тип резини - "  + tire+".");
		System.out.println();
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + size;
		result = prime * result + ((tire == null) ? 0 : tire.hashCode());
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
		Wheel other = (Wheel) obj;
		if (color != other.color)
			return false;
		if (size != other.size)
			return false;
		if (tire != other.tire)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wheel [size=" + size + ", color=" + color + ", tire=" + tire + "]";
	}

}
