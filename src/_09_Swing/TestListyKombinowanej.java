package _09_Swing;

/**
   @version 1.30 2000-06-03
   @author Cay Horstmann
*/

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 
 public class TestListyKombinowanej
 {
    public static void main(String[] args)
    {  
       RamkaListyKombinowanej ramka = new RamkaListyKombinowanej();
       ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ramka.setVisible(true);
    }
 }
 
 /**
    Ramka, zawierajaca etykiete z przykladowym tekstem i liste kombinowana,
    umozliwiajaca wybor czcionki
 */
 class RamkaListyKombinowanej extends JFrame 
 {  
    public RamkaListyKombinowanej()
    {  
       setTitle("TestListyKombinowanej");
       setSize(SZEROKOSC, WYSOKOSC);
 
       Container powZawartosci = getContentPane();
 
       // dolacz etykiete z przykladowym tekstem
 
       etykieta = new JLabel(
          "Zwinny brazowy lis przeskakuje nad leniwym psem.");
       etykieta.setFont(new Font("Serif", Font.PLAIN, 
          ROZMIAR_DOMYSLNY));
       powZawartosci.add(etykieta, BorderLayout.CENTER);
 
       // utworz liste kombinowana i dodaj nazwy czcionek
 
       listaCzcionek = new JComboBox();
       listaCzcionek.setEditable(true);
       listaCzcionek.addItem("Serif");
       listaCzcionek.addItem("SansSerif");
       listaCzcionek.addItem("Monospaced");
       listaCzcionek.addItem("Dialog");
       listaCzcionek.addItem("DialogInput");
 
       // sluchacz listy kombinowanej zmienia czcionke etykiety zgodnie z wyborem
       // uzytkownika
 
       listaCzcionek.addActionListener(new
          ActionListener()
          {
             public void actionPerformed(ActionEvent zdarzenie)
             {
                etykieta.setFont(new Font(
                   (String)listaCzcionek.getSelectedItem(), 
                   Font.PLAIN, 
                   ROZMIAR_DOMYSLNY));         
             }
          });
 
       // dolacz liste kombinowana do panelu w poludniowym obszarze ramki
 
       JPanel panelListy = new JPanel();
       panelListy.add(listaCzcionek);
       powZawartosci.add(panelListy, BorderLayout.SOUTH);
    }
 
    public static final int SZEROKOSC = 300;
    public static final int WYSOKOSC = 200;  
    
    private JComboBox listaCzcionek;
    private JLabel etykieta;
    private static final int ROZMIAR_DOMYSLNY = 12;
 }
