package _0A_Zdarzenia;

/**
   @version 1.30 2000-06-03
   @author Cay Horstmann

   zastosowanie anonimowej klasy wewnetrznej
*/

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 
 public class TestPrzyciskow2
 {  
    public static void main(String[] args)
    {  
       RamkaPrzyciskow2 ramka = new RamkaPrzyciskow2();
       ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ramka.setVisible(true);
    }
 }
 
 /**
    Ramka, zawierajaca panel przycisk�w
 */
 class RamkaPrzyciskow2 extends JFrame
 {
    public RamkaPrzyciskow2()
    {
       setTitle("TestPrzyciskow");
       setSize(SZEROKOSC, WYSOKOSC);
 
       // dolacz panel do ramki
 
       PanelPrzyciskow2 panel = new PanelPrzyciskow2();
       Container powZawartosci = getContentPane();
       powZawartosci.add(panel);
    }
    public static final int SZEROKOSC = 300;
    public static final int WYSOKOSC = 200;  
 }
 
 /**
    Panel, zawierajacy trzy przyciski
 */
 class PanelPrzyciskow2 extends JPanel
 {  
    public PanelPrzyciskow2()
    {  
       // skonstruuj przyciski
 
       zbudujPrzycisk("Zolty",     Color.yellow);
       zbudujPrzycisk("Niebieski", Color.blue);
       zbudujPrzycisk("Czerwony",  Color.red);
    }
    void zbudujPrzycisk(String nazwa, final Color kolorTla)
    {
       JButton przycisk = new JButton(nazwa);
       add(przycisk);
       // Sluchacz, zmieniajacy kolor tla panelu
       // anonimowa klasa wewnetrzna implementujaca ActionListener
       przycisk.addActionListener(new
         ActionListener()
	 {
	   public void actionPerformed(ActionEvent zdarzenie)
	   {
	     setBackground(kolorTla);
	     repaint();
	   }
	 });
    }
 }
