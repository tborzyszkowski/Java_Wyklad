package _09_Swing;

/**
   @version 1.30 2000-06-02
   @author Cay Horstmann
*/

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 
 public class TestObrazu
 {  
    public static void main(String[] args)
    {  
       RamkaObrazu ramka = new RamkaObrazu();
       ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ramka.setVisible(true);
       //ramka.show();
    }
 }
 
 /** 
    Ramka, zawierajaca panel obrazu
 */
 class RamkaObrazu extends JFrame
 {
    public RamkaObrazu()
    {
       setTitle("TestObrazu");
       setSize(SZEROKOSC, WYSOKOSC);
 
       // dodaj panel do ramki
 
       PanelObrazu panel = new PanelObrazu();
       Container powZawartosci = getContentPane();
       powZawartosci.add(panel);
    }
 
    public static final int SZEROKOSC = 300;
    public static final int WYSOKOSC = 200;  
 }
 
 /**
    Panel, wypelniajacy okno kopiami obrazu
 */
 class PanelObrazu extends JPanel
 {  
    public PanelObrazu()
    {  
       // zaladuj obraz
       
       // zaladuj z pliku
       obraz = Toolkit.getDefaultToolkit().getImage("eeyore2.jpg");
       // i z URL
       // URL u = URL("http://www.gdzies.com/obraz.gif");
       // obraz = Toolkit.getDefaultToolkit().getImage(u);
       
       // obiekt sledzacy pobieranie obrazu
       MediaTracker trop = new MediaTracker(this);
       trop.addImage(obraz, 0);
       // bez oczekiwania awt tworzy watek zciagajacy obraz 
       // metoda rysujaca moze sie wowczas zakonczyc 
       // przez zciagnieciem obrazu
       try { trop.waitForID(0); } 
       catch (InterruptedException exception) {}
    }
    
    public void paintComponent(Graphics g)
    {  
       super.paintComponent(g);
    
       int szerObrazu = obraz.getWidth(this);
       int wysObrazu = obraz.getHeight(this);
 
       // narysuj obraz w lewym gornym rogu okna
       
       g.drawImage(obraz, 0, 0, null);
 
       // wypeonij panel kopiami obrazu
 
       for (int i = 0; i * szerObrazu <= getWidth(); i++)
         for (int j = 0; j * wysObrazu <= getHeight(); j++)
             if (i + j > 0) 
                g.copyArea(0, 0, szerObrazu, wysObrazu,
                   i * szerObrazu, j * wysObrazu);
    }
    
    private Image obraz;
 }
