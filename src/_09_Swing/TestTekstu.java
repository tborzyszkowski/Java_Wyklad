package _09_Swing;

/**
   @version 1.30 2000-06-03
   @author Cay Horstmann
*/

 import java.awt.*;
 import java.awt.event.*;
 import java.awt.geom.*;
 import javax.swing.*;
 import javax.swing.event.*;
 
 public class TestTekstu 
 {
    public static void main(String[] args)
    {  
       RamkaTekstu ramka = new RamkaTekstu();
       ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ramka.setVisible(true);
    }
 }
 
 /**
    Ramka, zawierajaca dwa pola tekstowe, zmieniajace ustawienie zegara
 */
 class RamkaTekstu extends JFrame
 {  
    public RamkaTekstu()
    {  
       setTitle("TestTekstu");
       setSize(SZEROKOSC, WYSOKOSC);
 
       Container powZawartosci = getContentPane();
 
       DocumentListener sluchacz = new SluchaczPolaZegara();
 
       // dolacz panel i pola tekstowe
 
       JPanel panel = new JPanel();
 
       poleGodziny = new JTextField("12", 3);
       panel.add(poleGodziny);
       poleGodziny.getDocument().addDocumentListener(sluchacz);
       
       poleMinuty = new JTextField("00", 3);
       panel.add(poleMinuty);
       poleMinuty.getDocument().addDocumentListener(sluchacz);
   
       powZawartosci.add(panel, BorderLayout.SOUTH);
 
       // dolacz zegar

       zegar = new PanelZegara();
       powZawartosci.add(zegar, BorderLayout.CENTER);
    }
 
    /**
       Ustaw zegar na godzine i minute, okreslana przez pola tekstowe
    */
    public void zmienZegar()
    {  
       try
       {
          int godzina 
             = Integer.parseInt(poleGodziny.getText().trim());
          int minuta 
             = Integer.parseInt(poleMinuty.getText().trim());
          zegar.zmienCzas(godzina, minuta);
       }
       catch (NumberFormatException w) {}
       // nie aktualizuj zegara, jesli wartosci pol tekstowych nie mozna odczytac
    }
       
    public static final int SZEROKOSC = 300;
    public static final int WYSOKOSC = 300;  
 
    private JTextField poleGodziny;
    private JTextField poleMinuty;
    private PanelZegara zegar;
 
    private class SluchaczPolaZegara implements DocumentListener
    {
       public void insertUpdate(DocumentEvent z) { zmienZegar(); }
       public void removeUpdate(DocumentEvent z) { zmienZegar(); }
       public void changedUpdate(DocumentEvent z) {}
    }
 }
 
 /**
    Panel rysuj�cy zegar
 */
 class PanelZegara extends JPanel
 {
    public void paintComponent(Graphics g)
    {
       // narysuj tarcze zegara
 
       super.paintComponent(g); 
       Graphics2D g2 = (Graphics2D)g;
       Ellipse2D okrag 
          = new Ellipse2D.Double(0, 0, 2 * PROMIEN, 2 * PROMIEN);
       g2.draw(okrag);
       
       // narysuj wskazowke godziny
 
       double katGodziny 
          = Math.toRadians(90 - 360 * minuta / (12 * 60));
       rysujWskazowke(g2, katGodziny, WSKAZOWKA_GODZINY);
 
       // narysuj wskazowke minuty
 
       double katMinuty 
          = Math.toRadians(90 - 360 * minuta / 60);
       rysujWskazowke(g2, katMinuty, WSKAZOWKA_MINUTY);
    }
 
    public void rysujWskazowke(Graphics2D g2, 
       double kat, double dlWskazowki)
    {
       Point2D koniec = new Point2D.Double(
          PROMIEN + dlWskazowki * Math.cos(kat), 
          PROMIEN - dlWskazowki * Math.sin(kat));
       Point2D srodek = new Point2D.Double(PROMIEN, PROMIEN);
       g2.draw(new Line2D.Double(srodek, koniec));
    }
    
    /**
       Zmien czas, jaki ma byc wyswietlany na zegarze
       @param g godzina
       @param m minuta
    */
    public void zmienCzas(int g, int m)
    {  
       minuta = g * 60 + m;
       repaint();
    }
    
    private double minuta = 0;
    private double PROMIEN = 100;
    private double WSKAZOWKA_MINUTY = 0.8 * PROMIEN;
    private double WSKAZOWKA_GODZINY = 0.6 * PROMIEN;
 }
