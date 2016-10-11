package lab.pliki;

/**
   @version 1.10 2000-06-07
   @author Cay Horstmann
*/

 import java.io.*;
 import java.util.*;
 
 public class TestPlikuDanych
 {
    public static void main(String[] args)
    {
       Pracownik1[] obsluga = new Pracownik1[3];
 
       obsluga[0] = new Pracownik1("Karol Kraker", 75000,
         1987, 12, 15);
       obsluga[1] = new Pracownik1("Henryk Haker", 50000,
          1989, 10, 1);
       obsluga[2] = new Pracownik1("Tomasz Tester", 40000,
          1990, 3, 15);
 
       try
       {
          // zapisz dane wszystkich pracownik�w do pliku pracownik.dat
          PrintWriter wy = new PrintWriter(new
             FileWriter("pracownik.dat"));
          zapiszDane(obsluga, wy);
          wy.close();
 
          // wczytaj zapisane dane do nowej tablicy
          BufferedReader we = new BufferedReader(new
             FileReader("pracownik.dat"));
          Pracownik1[] nowaObsluga = czytajDane(we);
          we.close();
 
          // wy�wietl wczytane z pliku dane pracownik�w 
          for (int i = 0; i < nowaObsluga.length; i++)
             System.out.println(nowaObsluga[i]);
       }
       catch(IOException wyjatek)
       {
          wyjatek.printStackTrace();
       }
    }
 
    /**
       Przesy�a tablic� pracownik�w do obiektu zapisu
       @param p tablica pracownik�w
       @param wy obiekt zapisu
    */
    static void zapiszDane(Pracownik1[] p, PrintWriter wy)
       throws IOException
    {
       // zapisuje liczb� pracownik�w
       wy.println(p.length);
 
       for (int i = 0; i < p.length; i++)
          p[i].zapiszDane(wy);
    }
 
    /**
       Pobiera tablic� pracownik�w z buforowanego obiektu odczytu
       @param we buforowany obiekt odczytu
       @return tablica pracownik�w
    */
    static Pracownik1[] czytajDane(BufferedReader we)
       throws IOException
    {
       // odczytaj rozmiar tablicy
       int n = Integer.parseInt(we.readLine());
 
       Pracownik1[] p = new Pracownik1[n];
       for (int i = 0; i < n; i++)
       {
          p[i] = new Pracownik1();
          p[i].czytajDane(we);
       }
       return p;
    }
 }
 
 class Pracownik1
 {
    public Pracownik1() {}
 
    public Pracownik1(String n, double s,
       int rok, int miesiac, int dzien)
    {
       nazwisko = n;
       pensja = s;
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
 
    /**
       Przesy�a dane pracownika do obiektu zapisu
       @param wy obiekt zapisu
    */
    public void zapiszDane(PrintWriter wy) throws IOException
    {
       GregorianCalendar kalendarz = new GregorianCalendar();
       kalendarz.setTime(dzienZatrudnienia);
       wy.println(nazwisko + "|"
          + pensja + "|"
          + kalendarz.get(Calendar.YEAR) + "|"
          + (kalendarz.get(Calendar.MONTH) + 1) + "|"
          + kalendarz.get(Calendar.DAY_OF_MONTH));
    }
 
    /**
       Pobiera dane pracownika z buforowanego obiektu odczytu
       @param we buforowany obiekt odczytu
    */
    public void czytajDane(BufferedReader we) throws IOException
    {
       String s = we.readLine();
       StringTokenizer t = new StringTokenizer(s, "|");
       nazwisko = t.nextToken();
       pensja = Double.parseDouble(t.nextToken());
       int y = Integer.parseInt(t.nextToken());
       int m = Integer.parseInt(t.nextToken());
       int d = Integer.parseInt(t.nextToken());
       GregorianCalendar kalendarz
          = new GregorianCalendar(y, m - 1, d);
          // GregorianCalendar zaczyna liczenie miesi�cy od 0
       dzienZatrudnienia = kalendarz.getTime();
    }
 
    private String nazwisko;
    private double pensja;
    private Date dzienZatrudnienia;
 }
