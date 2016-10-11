package _0A_Zdarzenia;

/**
   @version 1.30 2000-06-03
   @author Cay Horstmann
*/

 import java.awt.*;
 import java.awt.event.*;
 import java.util.*;
 import java.awt.geom.*;
 import javax.swing.*;
 
 public class TestMyszki
 {
    public static void main(String[] args)
    {
       RamkaMyszki ramka = new RamkaMyszki();
       ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ramka.setVisible(true);
    }
 }
 
 /**
    Ramka, zawierajaca panel, testujacy dzialanie myszki
 */
 class RamkaMyszki extends JFrame
 {
    public RamkaMyszki()
    {
       setTitle("TestMyszki");
       setSize(300, 200);
 
       // dolacz panel do ramki
 
       PanelMyszki panel = new PanelMyszki();
       Container powZawartosci = getContentPane();
       powZawartosci.add(panel);
    }
 
    public static final int SZEROKOSC = 300;
    public static final int WYSOKOSC = 200;  
 }
 
 /**
    Panel, do ktorego za pomoca myszki mozna dodawac i usuwac kwadraty
 */
 class PanelMyszki extends JPanel
 {
    public PanelMyszki()
    {
       kwadraty = new ArrayList<Rectangle2D>();
       obecny = null;
 
       addMouseListener(new UchwytMyszki());
       addMouseMotionListener(new UchwytRuchuMyszki());
    }
 
    public void paintComponent(Graphics g)
    {
       super.paintComponent(g);
       Graphics2D g2 = (Graphics2D)g;
 
       // narysuj wszystkie kwadraty
       for (Rectangle2D r : kwadraty)
          g2.draw(r);
    }
 
    /**
       Znajdz pierwszy kwadrat, zawierajacy dany punkt
       @param p punkt
       @return indeks pierwszego kwadratu, zawierajacego p
    */
    public Rectangle2D find(Point2D p)
    {
       for (Rectangle2D r : kwadraty)
          if (r.contains(p)) return r;
 
       return null;
    }
 
    /**
       Dolacza nowy kwadrat do zbioru
       @param p srodek kwadratu
    */
    public void add(Point2D p)
    {
       double x = p.getX();
       double y = p.getY();
 
       obecny = new Rectangle2D.Double(
          x - DLUGOSCBOKU / 2,
          y - DLUGOSCBOKU / 2,
          DLUGOSCBOKU,
          DLUGOSCBOKU);
       kwadraty.add(obecny);
       repaint();
    }

    /**
       Usuwa kwadrat ze zbioru
       @param s kwadrat, ktory ma zostac usuniety
    */
    public void remove(Rectangle2D s)
    {
       if (s == null) return;
       if (s == obecny) obecny = null;
       kwadraty.remove(s);
       repaint();
    }
 
 
    private static final int DLUGOSCBOKU = 10;
    private ArrayList<Rectangle2D> kwadraty;
    private Rectangle2D obecny;
    // kwadrat, w ktorym znajduje sie kursor myszki
 
    private class UchwytMyszki extends MouseAdapter
    {
       public void mousePressed(MouseEvent zdarzenie)
       {
          // jesli kursor nie znajduje sie wewnatrz kwadratu, narysuj nowy kwadrat
          obecny = find(zdarzenie.getPoint());
          if (obecny == null)
             add(zdarzenie.getPoint());
          System.out.print("A");
       }
 
       public void mouseClicked(MouseEvent zdarzenie)
       {
          // jesli nastapilo podwojne klikniecie, usun aktualny kwadrat
          obecny = find(zdarzenie.getPoint());
          if (obecny != null && zdarzenie.getClickCount() >= 2)
             remove(obecny);
          System.out.print("B");
       }
    }
 
    private class UchwytRuchuMyszki
       implements MouseMotionListener
    {
       public void mouseMoved(MouseEvent zdarzenie)
       {
          // jesli kursor myszki znajduje si� wewnatrz kwadratu, 
          // zmien go w krzyzyk
 
          if (find(zdarzenie.getPoint()) == null)
             setCursor(Cursor.getDefaultCursor());
          else
             setCursor(Cursor.getPredefinedCursor
                (Cursor.CROSSHAIR_CURSOR)); 
		// obrazy kursorow mozna znalezc w jre/lib/images/cursors
       }
 
       public void mouseDragged(MouseEvent zdarzenie)
       {
          if (obecny != null)
          {
             int x = zdarzenie.getX();
             int y = zdarzenie.getY();
 
             // przesun obecny kwadrat tak, aby jego srodek znajdowal si� w (x, y)
             obecny.setFrame(
                x - DLUGOSCBOKU / 2,
                y - DLUGOSCBOKU / 2,
                DLUGOSCBOKU,
                DLUGOSCBOKU);
             repaint();
          }
       }
    }
 }
