package model;

public enum Vat {

	ZERO (0d),
	PIEC (5d),
	OSIEM (8d),
	DWADZIESCIA_TRZY(23d);
	
	private final Double stawka;
	
	Vat (Double stawka)
	{
		this.stawka=stawka;
	}
	
	public String toString() {
		return Double.toString(stawka);
	}
	
}
