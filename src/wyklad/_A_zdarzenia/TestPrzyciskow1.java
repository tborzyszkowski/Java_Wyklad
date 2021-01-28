package wyklad._A_zdarzenia; /**
 * @version 1.30 2000-06-03
 * @author Cay Horstmann
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestPrzyciskow1 {
	public static void main(String[] args) {
		RamkaPrzyciskow1 ramka = new RamkaPrzyciskow1();
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.setVisible(true);
	}
}

/**
 Ramka, zawierajaca panel przyciskow
 */
class RamkaPrzyciskow1 extends JFrame {
	public RamkaPrzyciskow1() {
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
class PanelPrzyciskow1 extends JPanel {
	public PanelPrzyciskow1() {
		// skonstruuj przyciski

		JButton przyciskZolty = new JButton("Zolty");
		JButton przyciskNiebieski = new JButton("Niebieski");
		JButton przyciskCzerwony = new JButton("Czerwony");

		// dolacz przyciski do panelu

		add(przyciskZolty);
		add(przyciskNiebieski);
		add(przyciskCzerwony);

		// skonstruuj dzialania przyciskow

		DzialanieKoloru dzialanieZoltego = new DzialanieKoloru(Color.yellow);
		DzialanieKoloru dzialanieNiebieskiego = new DzialanieKoloru(Color.blue);
		DzialanieKoloru dzialanieCzerwonego = new DzialanieKoloru(Color.red);

		// przyporzadkuj dzialania do przyciskow

		przyciskZolty.addActionListener(dzialanieZoltego);
		przyciskNiebieski.addActionListener(dzialanieNiebieskiego);
		przyciskCzerwony.addActionListener(dzialanieCzerwonego);
	}

	/**
	 Sluchacz, zmieniajacy kolor tla panelu
	 !!! Jest to klasa wewnetrzna klasy PanelPrzyciskow !!!
	 */
	private class DzialanieKoloru implements ActionListener {
		public DzialanieKoloru(Color k) {
			kolorTla = k;
		}

		public void actionPerformed(ActionEvent zdarzenie) {
			setBackground(kolorTla);
			repaint();
		}

		private Color kolorTla;
	}
}

 /* Interfejs ActionListener sluzy do obslugi:
    - klikniec na przyciski
    - wybrania podwojnym kliknieciem
    - nacisniecie ENTER w polu tekstowym
    - dla komponentu typu Timer uplynie okreslony przedzial czasu
 */
    
 
 
 