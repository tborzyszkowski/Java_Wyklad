package lab.pliki;

/**
   @version 1.10 2000-06-07
   @author Cay Horstmann
*/

 import java.io.*;
 import java.util.*;
 
 public class TestSwobodnegoDostepu
 {
    public static void main(String[] args)
    {
       Pracownik2[] obsluga = new Pracownik2[3];
 
       obsluga[0] = new Pracownik2("Karol Kraker", 75000,
          1987, 12, 15);
       obsluga[1] = new Pracownik2("Henryk Haker", 50000,
          1989, 10, 1);
       obsluga[2] = new Pracownik2("Tomasz Tester", 40000,
          1990, 3, 15);
 
       try
       {
          // zapisz dane wszystkich pracownik�w do pliku pracownik.dat
          DataOutputStream wy = new DataOutputStream(new
             FileOutputStream("pracownik.dat"));
          for (int i = 0; i < obsluga.length; i++)
             obsluga[i].zapiszDane(wy);
          wy.close();
 
          // wczytaj zapisane dane do nowej tablicy
          RandomAccessFile we
             = new RandomAccessFile("pracownik.dat", "r");
          // oblicz rozmiar tablicy
          int n = (int)(we.length() / Pracownik2.ROZMIAR_REKORDU);
          Pracownik2[] nowaObsluga = new Pracownik2[n];
 
          // wczytaj pracownik�w w odwr�conym porz�dku
          for (int i = n - 1; i >= 0; i--)
          {
             nowaObsluga[i] = new Pracownik2();
             we.seek(i * Pracownik2.ROZMIAR_REKORDU);
             nowaObsluga[i].czytajDane(we);
          }
          we.close();
 
          // wy�wietl wczytane z pliku dane pracownik�w 
          for (int i = 0; i < nowaObsluga.length; i++)
             System.out.println(nowaObsluga[i]);
       }
       catch(IOException w)
       {
          w.printStackTrace();
       }
 
    }
 }
 
 class Pracownik2
 {
    public Pracownik2() {}
 
    public Pracownik2(String n, double p,
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
 
    /**
       Zapisuje dane pracownika do obiektu DataOutput
       @param wy obiekt DataOutput
    */
    public void zapiszDane(DataOutput wy) throws IOException
    {
       Dane.zapiszStalyLancuch(nazwisko, ROZMIAR_NAZW, wy);
       wy.writeDouble(pensja);
 
       GregorianCalendar kalendarz = new GregorianCalendar();
       kalendarz.setTime(dzienZatrudnienia);
       wy.writeInt(kalendarz.get(Calendar.YEAR));
       wy.writeInt(kalendarz.get(Calendar.MONTH) + 1);
       wy.writeInt(kalendarz.get(Calendar.DAY_OF_MONTH));
    }
 
    /**
       Wczytuje dane pracownika z obiektu DataInput
       @param we obiekt DataInput
    */
    public void czytajDane(DataInput we) throws IOException
    {
       nazwisko = Dane.czytajStalyLancuch(ROZMIAR_NAZW, we);
       pensja = we.readDouble();
       int r = we.readInt();
       int m = we.readInt();
       int d = we.readInt();
       GregorianCalendar kalendarz
          = new GregorianCalendar(r, m - 1, d);
          // GregorianCalendar zaczyna liczenie miesi�cy od 0
       dzienZatrudnienia = kalendarz.getTime();
    }

    public static final int ROZMIAR_NAZW = 40;
    public static final int ROZMIAR_REKORDU
       = 2 * ROZMIAR_NAZW + 8 + 4 + 4 + 4;

    private String nazwisko;
    private double pensja;
    private Date dzienZatrudnienia;
 }
 
 class Dane
 {  public static String czytajStalyLancuch(int rozmiar,
       DataInput we) throws IOException
    {
       StringBuffer b = new StringBuffer(rozmiar);
       int i = 0;
       boolean wiecej = true;
       while (wiecej && i < rozmiar)
       {
          char zn = we.readChar();
          i++;
          if (zn == 0) wiecej = false;
          else b.append(zn);
       }
       we.skipBytes(2 * (rozmiar - i));
       return b.toString();
    }
 
    public static void zapiszStalyLancuch(String p, int rozmiar,
       DataOutput wy) throws IOException
    {
       int i;
       for (i = 0; i < rozmiar; i++)
       {
          char zn = 0;
          if (i < p.length()) zn = p.charAt(i);
          wy.writeChar(zn);
       }
    }
 }
