package less21;

public class Pet {

	private String name;
	
	private String kind;

	public Pet(String name, String kind) {
		super();
		this.name = name;
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", kind=" + kind + "]";
	}
	
	
}
