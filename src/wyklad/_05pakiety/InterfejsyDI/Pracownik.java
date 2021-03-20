package wyklad._05pakiety.InterfejsyDI;

public class Pracownik {
	private String name;
	private Ability canDo;

	public Pracownik(String name, Ability iCan) {
		this.name = name;
		this.canDo = iCan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ability getCanDo() {
		return canDo;
	}

	public void setCanDo(Ability canDo) {
		this.canDo = canDo;
	}
}
