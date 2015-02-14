package form;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import model.Person;
import model.Unit;
import model.Vat;

public class Invoice {

	private String numer;
	private Date dataWystawienia;
	private Person sprzedawca,nabywca;
	private String nazwaTowarUsluga;
	private Unit jednostka;
	private Double ilosc, cenaJednostki;
	private Vat stawkaVat;
	
	
	public List<Unit> getUnits()
	{
		return Arrays.asList(Unit.class.getEnumConstants());
		
	}
	
	public List<Vat> getVATRates()
	{
		return Arrays.asList(Vat.class.getEnumConstants());
		
	}
}
