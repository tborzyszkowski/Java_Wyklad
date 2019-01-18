package kadry;
public class kadry {
	static void drukuj(pracownik cl) {
		if(cl.typ == "fizyczny") {
			//System.out.println(cl.getClass() + "fizykol");
			cl.printdanefiz();}
		else if(cl.typ == "umyslowy"){
			//System.out.println("inne");
			cl.printdaneumys();
		}
		else if(cl.typ == "kierownik") {
			cl.printdanekier();
		}
		else if(cl.typ == "cz³onek zarz¹du") {
			cl.printdanecz();
		}
		else if(cl.typ == "praktykant") {
			cl.printdanepra();
		};
			
	}
	public static void main(String[] args) {

fizyczny Jan = new fizyczny();
Jan.imie = "Jan";
Jan.nazwisko = "Kowalski";
Jan.rokurodzenia = 1990;
Jan.stawkagodzinowa = 10.50;
Jan.typ = "fizyczny";
Jan.umiejetnosci = "spawacz";
Jan.lng = 10;
Jan.lpg = 160;
Jan.dzial = "konstrukcje";

//Jan.printdanefiz();
//drukuj(Jan);
//System.out.println(Jan.imie + " " + Jan.stawkagodzinowa);

umyslowy Marek = new umyslowy();
Marek.imie = "Marek";
Marek.nazwisko = "Nowak";
Marek.pensja = 2500.95;
Marek.rokurodzenia = 1410;
Marek.nrpokoju = "666";
Marek.nrtel = "070088088";
Marek.typ = "umyslowy";
Marek.procent = 7;
Marek.dzial = "konstrukcje";
kierownik Andrzej = new kierownik();
Andrzej.imie = "Andrzej";
Andrzej.nazwisko = "Nowak";
Andrzej.dzial = "konstrukcje";
Andrzej.kdk = 500;
Andrzej.nrkom = "brak";
Andrzej.nrpokoju = "666";
Andrzej.nrtel = "15181920";
Andrzej.pensja = 3500;
Andrzej.procent = 5;
Andrzej.rokurodzenia = 1943;
Andrzej.typ = "kierownik";
Andrzej.dzial = "konstrukcje";
//Marek.printdaneumys();
czlonekzarzadu Filemon = new czlonekzarzadu();
Filemon.imie = "Filemon";
Filemon.nazwisko = "Gastronowicz";
Filemon.iloscspotkan = 15;
Filemon.pensja = 15000;
Filemon.rokurodzenia = 1939;
Filemon.typ = "cz³onek zarz¹du";
Filemon.dzial = "konstrukcje";

praktykant Jacek = new praktykant();
Jacek.imie = "Jacek";
Jacek.nazwisko = "Popielaty";
Jacek.rokurodzenia = 2018;
Jacek.stypendium = true;
Jacek.typ = "praktykant";
Jacek.dzial = "konstrukcje";

fizyczny Jan2 = new fizyczny();
Jan2.imie = "Jan";
Jan2.nazwisko = "Kowalski";
Jan2.rokurodzenia = 1990;
Jan2.stawkagodzinowa = 10.50;
Jan2.typ = "fizyczny";
Jan2.umiejetnosci = "spawacz";
Jan2.lng = 10;
Jan2.lpg = 160;
Jan2.dzial ="IT";

//Jan.printdanefiz();
//drukuj(Jan);
//System.out.println(Jan.imie + " " + Jan.stawkagodzinowa);

umyslowy Marian = new umyslowy();
Marian.imie = "Marek";
Marian.nazwisko = "Nowak";
Marian.pensja = 2500.95;
Marian.rokurodzenia = 1410;
Marian.nrpokoju = "666";
Marian.nrtel = "070088088";
Marian.typ = "umyslowy";
Marian.procent = 7;
Marian.dzial = "IT";
kierownik Andrzej1 = new kierownik();
Andrzej1.imie = "Andrzej";
Andrzej1.nazwisko = "Nowak";
Andrzej1.dzial = "konstrukcje";
Andrzej1.kdk = 500;
Andrzej1.nrkom = "brak";
Andrzej1.nrpokoju = "666";
Andrzej1.nrtel = "15181920";
Andrzej1.pensja = 3500;
Andrzej1.procent = 5;
Andrzej1.rokurodzenia = 1943;
Andrzej1.typ = "kierownik";
Andrzej1.dzial = "IT";
//Marek.printdaneumys();
czlonekzarzadu Filemon1 = new czlonekzarzadu();
Filemon1.imie = "Filemon";
Filemon1.nazwisko = "Gastronowicz";
Filemon1.iloscspotkan = 15;
Filemon1.pensja = 15000;
Filemon1.rokurodzenia = 1939;
Filemon1.typ = "cz³onek zarz¹du";
Filemon1.dzial = "IT";

praktykant Jacek1 = new praktykant();
Jacek1.imie = "Jacek";
Jacek1.nazwisko = "Popielaty";
Jacek1.rokurodzenia = 2018;
Jacek1.stypendium = true;
Jacek1.typ = "praktykant";
Jacek1.dzial = "IT";
drukuj(Marek);
drukuj(Jan);
drukuj(Andrzej);
drukuj(Filemon);
drukuj(Jacek);
drukuj(Marian);
drukuj(Andrzej1);
drukuj(Filemon1);
drukuj(Jacek1);


}
}