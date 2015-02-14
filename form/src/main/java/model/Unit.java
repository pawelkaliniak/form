package model;

public enum Unit {

	SZTUKA("sztuka"), METR_KWADRATOWY("m^2");

	private String name;
	

	Unit(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}
