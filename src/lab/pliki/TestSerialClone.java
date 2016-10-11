package lab.pliki;

/**
   @version 1.20 17 Aug 1998
   @author Cay Horstmann
*/

 import java.io.*;
 import java.util.*;
 
 public class TestSerialClone
 {  
    public static void main(String[] args)
    {  
       Pracownik henryk = new Pracownik("Henryk Haker", 35000,
          1989, 10, 1);
       // klonuj obiekt henryk
       Pracownik henryk2 = (Pracownik)henryk.clone();
 
       // zmie� stan obiektu henryk
       henryk.podniesPensje(10);
 
       // teraz henryk i jego klon r�ni� si� od siebie
       System.out.println(henryk);
       System.out.println(henryk2);
    }
 }
 
 /**
    Klasa, kt�re metoda clone korzysta z serializacji.
 */
 class SerialCloneable implements Cloneable, Serializable
 {  
    public Object clone()
    {  
       try
       {  
          // zapisz obiekt do tablicy bajt�w
          ByteArrayOutputStream bwy = new 
             ByteArrayOutputStream();
          ObjectOutputStream wy 
             = new ObjectOutputStream(bwy);
          wy.writeObject(this);
          wy.close();
 
          // zbuduj klon obiektu na podstawie tablicy bajt�w
          ByteArrayInputStream bwe = new 
             ByteArrayInputStream(bwy.toByteArray());
          ObjectInputStream we = new ObjectInputStream(bwe);
          Object zwr = we.readObject();
          we.close();
 
          return zwr;
       }  
       catch (Exception w)
       {  
          return null;
       }
    }
 }
 
 /**
    Znana ju� klasa Pracownik, przedefiniowana tak, aby rozszerza�a
    klas� SerialCloneable.
 */
 class Pracownik extends SerialCloneable
 {  
    public Pracownik(String n, double p, 
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
