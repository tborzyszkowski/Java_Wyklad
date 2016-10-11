package _09_Swing;

/**
   @version 1.30 2000-05-12
   @author Cay Horstmann
*/

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
  
 public class TestPrzelacznikow
 {
    public static void main(String[] args)
    {  
       RamkaPrzelacznikow ramka = new RamkaPrzelacznikow();
       ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ramka.setVisible(true);
    }
 }
 
 /**
    Ramka, zawierajaca etykiete z przykladowym tekstem i przelaczniki, pozwalajace
    wybrac rozmiar czcionki.
 */
 class RamkaPrzelacznikow extends JFrame 
 {  
    public RamkaPrzelacznikow()
    {  
       setTitle("TestPrzelacznikow");
       setSize(SZEROKOSC, WYSOKOSC);
 
       Container powZawartosci = getContentPane();
 
       // dolacz etykiete z przykladowym tekstem
 
       etykieta = new JLabel(
          "Zwinny brazowy lis przeskakuje nad leniwym psem.");
       etykieta.setFont(new Font("Serif", Font.PLAIN, 
          ROZMIAR_DOMYSLNY));
       powZawartosci.add(etykieta, BorderLayout.CENTER);
 
       // dodaj przelaczniki
 
       panelPrzyciskow = new JPanel();
       grupa = new ButtonGroup();
 
       dodajPrzelacznik("Mala", 8);
       dodajPrzelacznik("Srednia", 12);
       dodajPrzelacznik("Duza", 18);
       dodajPrzelacznik("Bardzo duza", 36);
 
       powZawartosci.add(panelPrzyciskow, BorderLayout.SOUTH);
    }
 
    /**
       Tworzy przelacznik, ktory zmienia rozmiar czcionki
       Przykladowego tekstu
       @param nazwa lancuch, wyswietlony na przycisku
       @param rozmiar rozmiar czcionki, do ktorego przyporzadkowany jest dany przycisk
    */
    public void dodajPrzelacznik(String nazwa, final int rozmiar)
    {
       boolean zaznaczony = rozmiar == ROZMIAR_DOMYSLNY;
       JRadioButton przycisk = new JRadioButton(nazwa, zaznaczony);
       grupa.add(przycisk);
       panelPrzyciskow.add(przycisk);
 
       // obiekt sluchacza zmienia rozmiar czcionki etykiety
 
       ActionListener sluchacz = new 
          ActionListener()
          {
             public void actionPerformed(ActionEvent zd)
             {
                // rozmiar odnosi sie do parametru finalnego
                // metody dodajPrzelacznik 
                etykieta.setFont(new Font("Serif", Font.PLAIN, 
                   rozmiar));
             }
          }; 
 
       przycisk.addActionListener(sluchacz);
    }
  
    public static final int SZEROKOSC = 400;
    public static final int WYSOKOSC = 200;  
 
    private JPanel panelPrzyciskow;
    private ButtonGroup grupa;
    private JLabel etykieta;
 
    private static final int ROZMIAR_DOMYSLNY = 12;
 }
