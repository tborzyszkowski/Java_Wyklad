package _09_Swing;

/**
   @version 1.30 2000-05-03
   @author Cay Horstmann
*/

 import java.awt.*;
 import javax.swing.*;
 
 public class TestRamkiScentrowanej
 {  
    public static void main(String[] args)
    {  
       RamkaScentrowana ramka = new RamkaScentrowana();
       ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ramka.setVisible(true);
       //ramka.show();  
    }
 }
 
 class RamkaScentrowana extends JFrame
 {
    public RamkaScentrowana()
    {
       // pobierz rozdzielczosc ekranu
 
       Toolkit zestaw = Toolkit.getDefaultToolkit();
       Dimension rozmiarEkranu = zestaw.getScreenSize();
       int wysEkranu = rozmiarEkranu.height;
       int szerEkranu = rozmiarEkranu.width;
 
       // umiesc ramke na srodku ekranu
 
       setSize(szerEkranu / 2, wysEkranu / 2);
       setLocation(szerEkranu / 4, wysEkranu / 4);
 
       // okresl ikone i tytul ramki

       Image rys = zestaw.getImage("eeyore2.jpg");
       setIconImage(rys);
       setTitle("RamkaScentrowana");
    }
 }
