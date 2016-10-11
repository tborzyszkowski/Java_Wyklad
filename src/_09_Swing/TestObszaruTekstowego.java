package _09_Swing;

/**
   @version 1.30 2000-05-12
   @author Cay Horstmann
*/

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 
 public class TestObszaruTekstowego 
 {
    public static void main(String[] args)
    {  
       RamkaObszaruTekstowego ramka = new RamkaObszaruTekstowego();
       ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ramka.setVisible(true);
    }
 }
 
 /**
    Ramka, zawierajaca obszar tekstowy i przyciski, sluzace do edycji tekstu
 */
 class RamkaObszaruTekstowego extends JFrame
 {  
    public RamkaObszaruTekstowego()
    {  
       setTitle("TestObszaruTekstowego");
       setSize(SZEROKOSC, WYSOKOSC);
 
       Container powZawartosci = getContentPane();

       panelPrzyciskow = new JPanel();

       // dodaj przycisk, dolaczajacy do konca tekstu podane zdanie
 
       JButton przyciskWstaw = new JButton("Wstaw");
       panelPrzyciskow.add(przyciskWstaw);
       przyciskWstaw.addActionListener(new
         ActionListener()
         {
             public void actionPerformed(ActionEvent zdarzenie)
             {
                obszarTekstowy.append("Zwinny brazowy lis "
                  + "przeskakuje nad leniwym psem. ");
             }
          });
 
       // dodaj przycisk, wlaczajacy i wylaczajacy zawijanie linii
 
       przyciskZawijaj = new JButton("Zawijaj");
       panelPrzyciskow.add(przyciskZawijaj);
       przyciskZawijaj.addActionListener(new
          ActionListener()
          {
            public void actionPerformed(ActionEvent zd)
            {  
                boolean zawijaj = !obszarTekstowy.getLineWrap();
                obszarTekstowy.setLineWrap(zawijaj);
                powPrzewijania.validate();
                przyciskZawijaj.setText(zawijaj ? "Nie zawijaj" : "Zawijaj");
             }
          });
     
       powZawartosci.add(panelPrzyciskow, BorderLayout.SOUTH);
 
       // dolacz obszar tekstowy z paskami przewijania
       // w Swing obszary tekstowe nie posiadaja paskow przewijania
       // aby uzyskac paski przewijania trzeba umiescic obszar tekstowy 
       // wewnatrz powierzchni przewijania, jak ponizej
       obszarTekstowy = new JTextArea(8, 40);
       powPrzewijania = new JScrollPane(obszarTekstowy);

       powZawartosci.add(powPrzewijania, BorderLayout.CENTER);
    }
 
    public static final int SZEROKOSC = 300;
    public static final int WYSOKOSC = 300;  
 
    private JTextArea obszarTekstowy;
    private JScrollPane powPrzewijania;
    private JPanel panelPrzyciskow;
    private JButton przyciskZawijaj;
 }
