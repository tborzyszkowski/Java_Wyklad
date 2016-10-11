package _0A_Zdarzenia;

/**
   @version 1.30 2000-05-07
   @author Cay Horstmann
*/

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 
 public class TestWygladu
 {  
    public static void main(String[] args)
    {  
       RamkaWygladu ramka = new RamkaWygladu();
       ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ramka.setVisible(true);
    }
 }
 
 /**
    Ramka, zawierajaca panel przyciskow, zmieniajacych wyglad programu
 */
 class RamkaWygladu extends JFrame
 {
    public RamkaWygladu()
    {
       setTitle("TestWygladu");
       setSize(SZEROKOSC, WYSOKOSC);
 
       // dołącz panel do ramki
 
       PanelWygladu panel = new PanelWygladu();
       Container powZawartosci = getContentPane();
       powZawartosci.add(panel);
    }

    public static final int SZEROKOSC = 300;
    public static final int WYSOKOSC = 200;  
 }
 
 /**
    Panel, zawierajacy przyciski, zmieniajace wyglad programu
 */
 class PanelWygladu extends JPanel
 {  
    public PanelWygladu()
    {  
       zbudujPrzycisk("Metal", 
          "javax.swing.plaf.metal.MetalLookAndFeel");
       zbudujPrzycisk("Motif",
          "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
	// !!! ten wyglad dziala tylko pod Windows !!!
       zbudujPrzycisk("Windows", 
          "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    }
 
    /**
       Tworzy przycisk, zmieniajacy wyglad programu
       @param nazwa nazwa przycisku
       @param nazwaWygladu nazwa klasy wygladu 
     */
    void zbudujPrzycisk(String nazwa, final String nazwaWygladu)
    {  
       // dolacz przycisk do panelu
 
       JButton przycisk = new JButton(nazwa);
       add(przycisk);
       
       // wykonaj odpowiednie dzialanie
 
       przycisk.addActionListener(new 
          ActionListener()
          {
            public void actionPerformed(ActionEvent zdarzenie)
             {  
                // dzialanie przycisku: zmienia wyglad programu na nowy
                try
                {  
                   UIManager.setLookAndFeel(nazwaWygladu);
		   // UWAGA: Ciekawe miejsce: 
		   //   dlaczego podano PanelWygladu.this a nie this ?
                   SwingUtilities.updateComponentTreeUI(PanelWygladu.this);
                }
                catch(Exception w) { w.printStackTrace(); }
             }
          });
    }
 }
