package lab.pliki;

/**
   @version 1.10 17 Aug 1998
   @author Cay Horstmann
*/


 import java.io.*;
 import java.util.*;
 
 class TestRefObiektow
 {  
    public static void main(String[] args)
    {  
       Pracownik3 henryk = new Pracownik3("Henryk Haker", 50000,
          1989, 10, 1);
       Menadzer3 szef = new Menadzer3("Karol Kraker", 80000,
          1987, 12, 15);
       szef.zmienAsystenta(henryk);
 
       Pracownik3[] obsluga = new Pracownik3[3];
 
       obsluga[0] = szef;
       obsluga[1] = henryk;
       obsluga[2] = new Pracownik3("Tomasz Tester", 40000,
          1990, 3, 15);
       
       try
       {  
         // zapisz wszystkie dane pracownik�w do pliku pracownik.dat
          ObjectOutputStream wy = new ObjectOutputStream(new 
             FileOutputStream("pracownik.dat"));
          wy.writeObject(obsluga);
          wy.close();
 
          // wczytaj wszystkie dane do nowej tablicy
          ObjectInputStream we =  new ObjectInputStream(new 
             FileInputStream("pracownik.dat"));
          Pracownik3[] nowaObsluga = (Pracownik3[])we.readObject();
          we.close();
 
          // podnie� pensj� asystenta
          nowaObsluga[1].podniesPensje(10); 
 
          // wy�wietl wczytane z pliku dane pracownik�w
          for (int i = 0; i < nowaObsluga.length; i++)
             System.out.println(nowaObsluga[i]);
       }
       catch (Exception w)
       {  
          w.printStackTrace(); 
       }
    }
 }
 
 class Pracownik3 implements Serializable
 {
    public Pracownik3() {}
 
    public Pracownik3(String n, double p, 
       int rok, int miesiac, int dzien)
    {  
       nazwisko = n;
       pensja = p;
       GregorianCalendar kalendarz
          = new GregorianCalendar(rok, miesiac - 1, dzien);
          // GregorianCalendar zaczyna liczenie miesi�cy od 0
       dzienZatrudnienia = kalendarz.getTime();
    }
 
    public String pobierzNazw()
    {  
       return nazwisko;
    }
 
    public double pobierzPensje()
    {  
       return pensja;
    }
 
    public Date pobierzDzienZatrudnienia()
    {  
       return dzienZatrudnienia;
    }
 
    public void podniesPensje(double oProcent)
    {  
       double podwyzka = pensja * oProcent / 100;
       pensja += podwyzka;
    }
 
    public String toString()
    {  
      return getClass().getName()
          + "[nazwisko=" + nazwisko
          + ",pensja=" + pensja
          + ",dzienZatrudnienia=" + dzienZatrudnienia
          + "]";
    }
 
    private String nazwisko;
    private double pensja;
    private Date dzienZatrudnienia;
 }
 
 class Menadzer3 extends Pracownik3
 {  
    /**
       Tworzy menad�era, nie posiadaj�cego asystenta
       @param n nazwisko pracownika
       @param p pensja
       @param rok rok zatrudnienia
       @param miesiac miesi�c zatrudnienia
       @param dzien dzie� zatrudnienia
    */
    public Menadzer3(String n, double p,
       int rok, int miesiac, int dzien)
    {  
       super(n, p, rok, miesiac, dzien);
       asystent = null;
    }
 
    /**
       Okre�la asystenta danego menad�era
       @param p asystent
    */
    public void zmienAsystenta(Pracownik3 a)
    {  
      asystent = a;
    }
 
    public String toString()
    {
       return super.toString()
         + "[asystent=" + asystent
         + "]";
    }
 
    private Pracownik3 asystent;
 }
