package less10HomeWork1;

public class Body {

	private int mass;

	private Color color;

	private BodyType bodyType;

	public Body(int mass, Color color, BodyType bodyType) {
		super();
		this.mass = mass;
		this.color = color;
		this.bodyType = bodyType;
	}

	public BodyType getBodyType() {
		return bodyType;
	}

	public void setBodyType(BodyType bodyType) {
		this.bodyType = bodyType;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void printBody() {
		System.out.println(" Характеристики кузова:");
		System.out.println("  Тип кузова - " + bodyType+".");
		System.out.println("  Маса кузова становить - " + mass + " кг.");
		System.out.println("  Колір кузова - " + color + ".");
		System.out.println();
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bodyType == null) ? 0 : bodyType.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + mass;
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
		Body other = (Body) obj;
		if (bodyType != other.bodyType)
			return false;
		if (color != other.color)
			return false;
		if (mass != other.mass)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Body [mass=" + mass + ", color=" + color + ", bodyType=" + bodyType + "]";
	}

	

}
