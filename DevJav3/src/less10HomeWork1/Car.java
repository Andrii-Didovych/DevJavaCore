package less10HomeWork1;

public class Car {

	private Helm helm;

	private Wheel wheel;

	private Body body;

	private Brand brand;

	public Car(Helm helm, Wheel wheel, Body body, Brand brand) {
		this.helm = helm;
		this.wheel = wheel;
		this.body = body;
		this.brand = brand;

	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public void printWheel() {
		if (wheel != null)
			wheel.printWheel();
	}

	public void printHelm() {
		if (helm != null)
			helm.printHelm();
	}

	public void printBody() {
		if (body != null)
			body.printBody();
	}

	public void printCar() {
		System.out.println("Особливості автомобіля - " + brand);
		System.out.println();
		printBody();
		printWheel();
		printHelm();
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((helm == null) ? 0 : helm.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
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
		Car other = (Car) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (brand != other.brand)
			return false;
		if (helm == null) {
			if (other.helm != null)
				return false;
		} else if (!helm.equals(other.helm))
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [helm=" + helm + ", wheel=" + wheel + ", body=" + body + ", brand=" + brand + "]" + "\n";
	}

}
