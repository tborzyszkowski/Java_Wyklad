package _09_Swing;

/**
   @version 1.30 2000-05-04
   @author Cay Horstmann
*/

 import java.awt.*;
 import java.awt.geom.*;
 import javax.swing.*;
 
 public class TestRysunku
 {  
    public static void main(String[] args)
    {  
       RamkaRysunku ramka = new RamkaRysunku();
       ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ramka.setVisible(true);
       //ramka.show();
    }
 }

 /**
    Ramka, zawierajaca panel z rysunkiem
 */
 class RamkaRysunku extends JFrame
 {
    public RamkaRysunku()
    {
       setTitle("TestRysunku");
       setSize(SZEROKOSC, WYSOKOSC);
 
       // dolacz panel do ramki
 
       PanelRysunku panel = new PanelRysunku();
       Container powZawartosci = getContentPane();
       powZawartosci.add(panel);
    }
 
    public static final int SZEROKOSC = 400;
    public static final int WYSOKOSC = 400;  
 }
 
 /**
    Panel, wyswietlajacy prostokaty i elipsy.
 */
 class PanelRysunku extends JPanel
 {  
    public void paintComponent(Graphics g)
    {  
       super.paintComponent(g);
       Graphics2D g2 = (Graphics2D)g;
       
       // ustaw grubosc lini o 2mm wieksza niz domyslna
       g2.setStroke(new BasicStroke((new BasicStroke()).getLineWidth()+2));
       // rysuj prostokat
 
       double lewyX = 100;
       double gornyY = 100;
       double szerokosc = 200;
       double wysokosc = 150;
 
       Rectangle2D pros = new Rectangle2D.Double(lewyX, gornyY, szerokosc, wysokosc);
       g2.draw(pros);
 
       // rysuj zamknieta w nim elips�
 
       Ellipse2D elipsa = new Ellipse2D.Double();
       elipsa.setFrame(pros);
       g2.draw(elipsa);
 
       // rysuj przekatna
 
       g2.draw(new Line2D.Double(lewyX, gornyY, 
          lewyX + szerokosc, gornyY + wysokosc));
 
       // rysuj okrag o srodku w tym samym punkcie
 
       double srodekX = pros.getCenterX();
       double srodekY = pros.getCenterY();
       double promien = 150;
 
       Ellipse2D okrag = new Ellipse2D.Double();
       okrag.setFrameFromCenter(srodekX, srodekY,
          srodekX + promien, srodekY + promien);
       g2.draw(okrag);
    }
 }
