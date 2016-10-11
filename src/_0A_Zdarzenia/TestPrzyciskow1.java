package _0A_Zdarzenia;

/**
   @version 1.30 2000-06-03
   @author Cay Horstmann
*/

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 
 public class TestPrzyciskow1
 {  
    public static void main(String[] args)
    {  
       RamkaPrzyciskow ramka = new RamkaPrzyciskow();
       ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ramka.setVisible(true);
    }
 }
 
 /**
    Ramka, zawierajaca panel przyciskow
 */
 class RamkaPrzyciskow extends JFrame
 {
    public RamkaPrzyciskow()
    {
       setTitle("TestPrzyciskow");
       setSize(SZEROKOSC, WYSOKOSC);
 
       // dolacz panel do ramki
 
       PanelPrzyciskow panel = new PanelPrzyciskow();
       Container powZawartosci = getContentPane();
       powZawartosci.add(panel);
    }
    public static final int SZEROKOSC = 300;
    public static final int WYSOKOSC = 200;  
 }
 
 /**
    Panel, zawierajacy trzy przyciski
 */
 class PanelPrzyciskow extends JPanel
 {  
    public PanelPrzyciskow()
    {  
       // skonstruuj przyciski
 
       JButton przyciskZolty = new JButton("Zolty");
       JButton przyciskNiebieski = new JButton("Niebieski");
       JButton przyciskCzerwony = new JButton("Czerwony");
 
       // dolacz przyciski do panelu
 
       add(przyciskZolty);
       add(przyciskNiebieski);
       add(przyciskCzerwony);
 
       // skonstruuj dzialania przyciskow
 
       DzialanieKoloru dzialanieZoltego = new DzialanieKoloru(Color.yellow);
       DzialanieKoloru dzialanieNiebieskiego = new DzialanieKoloru(Color.blue);
       DzialanieKoloru dzialanieCzerwonego = new DzialanieKoloru(Color.red);
 
       // przyporzadkuj dzialania do przyciskow
 
       przyciskZolty.addActionListener(dzialanieZoltego);
       przyciskNiebieski.addActionListener(dzialanieNiebieskiego);
       przyciskCzerwony.addActionListener(dzialanieCzerwonego);
    }
 
    /**
       Sluchacz, zmieniajacy kolor tla panelu
       !!! Jest to klasa wewnetrzna klasy PanelPrzyciskow !!!
    */
    private class DzialanieKoloru implements ActionListener
    {  
       public DzialanieKoloru(Color k)
       {  
          kolorTla = k;
       }
 
       public void actionPerformed(ActionEvent zdarzenie)
       {  
          setBackground(kolorTla);
          repaint();
       }
 
       private Color kolorTla;
    }
 }

 /* Interfejs ActionListener sluzy do obslugi:
    - klikniec na przyciski
    - wybrania podwojnym kliknieciem
    - nacisniecie ENTER w polu tekstowym
    - dla komponentu typu Timer uplynie okreslony przedzial czasu
 */
    
 
 
 