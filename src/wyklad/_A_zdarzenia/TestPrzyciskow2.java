package wyklad._A_zdarzenia; /**
 * @version 1.30 2000-06-03
 * @author Cay Horstmann
 * <p>
 * zastosowanie anonimowej klasy wewnetrznej
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestPrzyciskow2 {
	public static void main(String[] args) {
		RamkaPrzyciskow1 ramka = new RamkaPrzyciskow1();
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.setVisible(true);
	}
}

class RamkaPrzyciskow extends JFrame {
	public RamkaPrzyciskow() {
		setTitle("TestPrzyciskow");
		setSize(SZEROKOSC, WYSOKOSC);

		// dolacz panel do ramki

		PanelPrzyciskow1 panel = new PanelPrzyciskow1();
		Container powZawartosci = getContentPane();
		powZawartosci.add(panel);
	}

	public static final int SZEROKOSC = 800;
	public static final int WYSOKOSC = 600;
}

/**
 Panel, zawierajacy trzy przyciski
 */
class PanelPrzyciskow extends JPanel {
	public PanelPrzyciskow() {
		zbudujPrzycisk("Zolty", Color.yellow);
		zbudujPrzycisk("Niebieski", Color.blue);
		zbudujPrzycisk("Czerwony", Color.red);
	}

	void zbudujPrzycisk(String nazwa, final Color kolorTla) {
		JButton przycisk = new JButton(nazwa);
		add(przycisk);
		// Sluchacz, zmieniajacy kolor tla panelu
		// anonimowa klasa wewnetrzna implementujaca ActionListener
		przycisk.addActionListener(new
				                           ActionListener() {
					                           public void actionPerformed(ActionEvent zdarzenie) {
						                           setBackground(kolorTla);
						                           repaint();
					                           }
				                           });
	}
}
