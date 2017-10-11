package less17withCaseMenu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class SeriazaibleMap implements Case,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6326427276575540054L;
	private final Map<Person, List<Pet>> map;

	public SeriazaibleMap(Map<Person, List<Pet>> map) {
		super();
		this.map = map;
	}

	@Override
	public boolean functionClub() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("less17withCase.save")))) {
			oos.writeObject(map);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

}
