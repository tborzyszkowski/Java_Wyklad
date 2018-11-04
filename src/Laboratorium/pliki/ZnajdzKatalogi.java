package lab.pliki;

/**
   @version 1.00 05 Sep 1997
   @author Gary Cornell
*/

 import java.io.*;

 public class ZnajdzKatalogi
 {  
    public static void main(String[] args)
    {
       // je�eli nie podano �adnego argumentu, rozpocznij od katalogu bazowego
       if (args.length == 0) args = new String[] { ".." };
 
       try
       {  
          File nazwaSciezki = new File(args[0]);
          String[] nazwyPlikow = nazwaSciezki.list();
 
          // znajd� wszystkie pliki tego katalogu
          for (int i = 0; i < nazwyPlikow.length; i++)
          {  
             File p = new File(nazwaSciezki.getPath(), 
                nazwyPlikow[i]);
 
             // je�eli plik jest katalogiem, wywo�aj 
             // rekursywnie metod� main
             if (p.isDirectory())
             {  
                System.out.println(p.getCanonicalPath());
                main(new String [] { p.getPath() });
             }
          }
       }
       catch(IOException p)
       {  
          p.printStackTrace(); 
       }
    }
 }
