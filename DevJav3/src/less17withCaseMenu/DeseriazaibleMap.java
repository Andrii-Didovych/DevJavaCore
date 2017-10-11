package less17withCaseMenu;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class DeseriazaibleMap implements Case,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 862043589244887804L;
	private Map<Person, List<Pet>> map;

	public DeseriazaibleMap(Map<Person, List<Pet>> map) {
		super();
		this.map = map;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean functionClub() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("less17withCase.save")))) {
			map = (Map<Person, List<Pet>>) ois.readObject();
			System.out.println(map);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return true;
	}

}
