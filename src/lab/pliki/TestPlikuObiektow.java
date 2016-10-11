package lab.pliki;

/**
   @version 1.10 17 Aug 1998
   @author Cay Horstmann
*/


 import java.io.*;
 import java.util.*;
 
 class TestPlikuObiektow
 {  
    public static void main(String[] args)
    {  
       Menadzer szef = new Menadzer("Karol Kraker", 80000,
          1987, 12, 15);
       szef.zmienBonus(5000);
 
       PracownikA[] obsluga = new PracownikA[3];
 
       obsluga[0] = szef;
       obsluga[1] = new PracownikA("Henryk Haker", 50000,
          1989, 10, 1);
       obsluga[2] = new PracownikA("Tomasz Tester", 40000,
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
          PracownikA[] nowaObsluga = (PracownikA[])we.readObject();
          we.close();

          // wy�wietl wczytane z pliku dane pracownik�w
          for (int i = 0; i < nowaObsluga.length; i++)
            System.out.println(nowaObsluga[i]);
          System.out.println(nowaObsluga[0].getClass());
       }
       catch (Exception w)
       {  
          w.printStackTrace(); 
       }
    }
 }
 
 class PracownikA implements Serializable
 {
    public PracownikA() {}
 
    public PracownikA(String n, double p, 
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
 
 class Menadzer extends PracownikA
 {  
    /**
       @param n nazwisko pracownika
       @param p pensja
       @param rok rok zatrudnienia
       @param miesiac miesi�c zatrudnienia
       @param dzien dzie� zatrudnienia
    */
    public Menadzer(String n, double p,
       int rok, int miesiac, int dzien)
    {  
       super(n, p, rok, miesiac, dzien);
       bonus = 0;
    }
 
    public double pobierzPensje()
    { 
      double pensjaPodst = super.pobierzPensje();
      return pensjaPodst + bonus;
    }
 
    public void zmienBonus(double b)
    {  
       bonus = b;
    }
 
    public String toString()
    {
       return super.toString()
         + "[bonus=" + bonus
         + "]";
    }
 
    private double bonus;
 }
