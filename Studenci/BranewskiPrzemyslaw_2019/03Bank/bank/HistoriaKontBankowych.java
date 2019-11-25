package bank;

import java.util.*;
import java.time.*;

public class HistoriaKontBankowych {

	private ArrayList<KontoBankowe> konta = new ArrayList<>();
	private ArrayList<Wplata> wplaty = new ArrayList<>();
	private ArrayList<Wyplata> wyplaty = new ArrayList<>();
	private ArrayList<Przelew> przelewy = new ArrayList<>();
	
	public void dodajKontoDoBazy(KontoBankowe konto)
	{
		if(!this.konta.contains(konto))
			this.konta.add(konto);
	}
	
	public void dodajWplateDoBazy(Wplata wplata)
	{
		this.wplaty.add(wplata);
	}
	
	public void dodajWyplateDoBazy(Wyplata wyplata)
	{
		if(wyplata.getPowodzenieWyplaty())
			this.wyplaty.add(wyplata);
	}
	
	public void dodajPrzelewDoBazy(Przelew przelew)
	{
		if(przelew.getPowodzenieOperacji())
			this.przelewy.add(przelew);
	}
	
	public String wyswietlHistorieRachunku(KontoBankowe konto, LocalDate dataOd, LocalDate dataDo)
	{
		String historia = "";
		if(konta.contains(konto))
		{
			historia = historia + konto.toString() + "\n\n----------------\n\n";
			while(dataDo.isAfter(dataOd) || dataDo.isEqual(dataOd))
			{
				historia = historia + dataDo.toString() + "\n\n**************\n\n";
				
				historia = historia + "p r z e l e w y:\n\n";
				for(Przelew przelew : przelewy)
				{
					if(przelew.getDataOperacji().equals(dataDo) &&
							(przelew.getNadawca().getNumerKonta().equals(konto.getNumerKonta()) ||
							 przelew.getOdbiorca().getNumerKonta().equals(konto.getNumerKonta())))
							historia = historia + przelew.toString()+ "\n\n";
				}
				
				historia = historia + "w p l a t y:\n\n";
				for(Wplata wplata : wplaty)
				{
					if(wplata.getDataWplaty().equals(dataDo) &&
					   wplata.getKontoWplaty().getNumerKonta().equals(konto.getNumerKonta()))
						historia = historia + wplata.toString() + "\n\n";
				}
				
				historia = historia + "w y p l a t y:\n\n";
				for(Wyplata wyplata : wyplaty)
				{
					if(wyplata.getDataWyplaty().equals(dataDo) &&
					   wyplata.getKontoWyplaty().getNumerKonta().equals(konto.getNumerKonta()))
						historia = historia + wyplata.toString() + "\n\n";
				}
				
				historia = historia + "***************\n\n";
				dataDo = dataDo.minusDays(1);
			}
		}
		else
			return "Nie ma takiego konta.";
		
		return historia;
	}
	
	public static void main(String[] args) 
	{
		KontoBankowe nadawca = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001", "Jan", "Kowalski", "ul. Sikorskiego 73, 61-001 Poznan", "69020639261");
		KontoBankowe odbiorca = new KontoBankowe(100.00, "12 1240 0000 8463 0099 4555 9238", "Krzysztof", "Nowak", "ul. Grójecka 13, 00-000 Warszawa", "57111105095");
		
		HistoriaKontBankowych historia = new HistoriaKontBankowych();
		historia.dodajKontoDoBazy(nadawca);
		historia.dodajKontoDoBazy(odbiorca);
		
		LocalDate dataOd = LocalDate.of(2019, 11, 23);
		LocalDate dataDo = LocalDate.now();
		
		Wplata wplata1 = new Wplata(nadawca, LocalDate.of(2019, 11, 24), 50.00);
		historia.dodajWplateDoBazy(wplata1);
		
		Wyplata wyplata1 = new Wyplata(nadawca, LocalDate.now(), 80.00);
		historia.dodajWyplateDoBazy(wyplata1);
		
		Przelew przelew1 = new Przelew(LocalDate.of(2019, 11, 23), nadawca, odbiorca, 10.00);
		historia.dodajPrzelewDoBazy(przelew1);
		
		System.out.println(historia.wyswietlHistorieRachunku(nadawca, dataOd, dataDo));
	}
}
