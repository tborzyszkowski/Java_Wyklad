package _09_Swing;

/**
   @version 1.30 1999-12-21
   @author Cay Horstmann
*/

 import javax.swing.*;
 
 public class TestProstejRamki
 {  
    public static void main(String[] args)
    {  
       ProstaRamka ramka = new ProstaRamka();
       ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ramka.setVisible(true);
       //ramka.show();  
    }
 }
 
 class ProstaRamka extends JFrame
 {
    public ProstaRamka()
    {
       setSize(SZEROKOSC, WYSOKOSC);
    }
 
    public static final int SZEROKOSC = 300;
    public static final int WYSOKOSC = 200;
 }
