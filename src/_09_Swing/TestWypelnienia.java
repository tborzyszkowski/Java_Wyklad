package _09_Swing;

/**
   @version 1.30 2000-05-04
   @author Cay Horstmann
*/

 import java.awt.*;
 import java.awt.geom.*;
 import javax.swing.*;
 
 public class TestWypelnienia
 {  
    public static void main(String[] args)
    {  
       FillFrame ramka = new FillFrame();
       ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ramka.setVisible(true);
       //ramka.show();
    }
 }
 
 /**
    Ramka, zawierajaca panel i rysunek
 */
 class FillFrame extends JFrame
 {
    public FillFrame()
    {
       setTitle("TestWypelnienia");
       setSize(SZEROKOSC, WYSOKOSC);
 
       // dolacz panel do ramki
 
       PanelWypelnienia panel = new PanelWypelnienia();
       Container powZawartosci = getContentPane();
       powZawartosci.add(panel);
    }
 
    public static final int SZEROKOSC = 400;
    public static final int WYSOKOSC = 400;  
 }
 
 /**
    Panel, wyswietlajacy wypelniony prostokat i elipse
 */
 class PanelWypelnienia extends JPanel
 {  
    public void paintComponent(Graphics g)
    {  
       super.paintComponent(g);
       Graphics2D g2 = (Graphics2D)g;
 
       // tlo jak okno
       //this.setBackground(SystemColor.window);
       // tlo jak tekst w oknie
       this.setBackground(SystemColor.windowText);
       
       // narysuj prostok�t
 
       double lewyX = 100;
       double gornyY = 100;
       double szerokosc = 200;
       double wysokosc = 150;
 
       Rectangle2D pros = new Rectangle2D.Double(lewyX, gornyY,
          szerokosc, wysokosc);
       g2.setPaint(Color.red);
       g2.fill(pros);
 
       // narysuj zamknieta w nim elipse
 
       Ellipse2D elipsa = new Ellipse2D.Double();
       elipsa.setFrame(pros);
       g2.setPaint(new Color(0,  128, 128)); // matowy, niebiesko-zielony kolor
       g2.fill(elipsa);
    }
 }
