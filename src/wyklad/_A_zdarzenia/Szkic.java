package wyklad._A_zdarzenia; /**
 * @version 1.30 2000-06-03
 * @author Cay Horstmann
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Szkic {
	public static void main(String[] args) {
		RamkaSzkicu ramka = new RamkaSzkicu();
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.setVisible(true);
	}
}

/**
 Ramka, zawierajaca panel, na ktorym bedziemy szkicowac
 */
class RamkaSzkicu extends JFrame {
	public RamkaSzkicu() {
		setTitle("Szkic");
		setSize(SZEROKOSC, WYSOKOSC);

		// dolacz panel do ramki

		PanelSzkicu panel = new PanelSzkicu();
		Container powZawartosci = getContentPane();
		powZawartosci.add(panel);
	}

	public static final int SZEROKOSC = 800;
	public static final int WYSOKOSC = 600;
}

/**
 Panel, na ktorym bedziemy szkicowac
 */
class PanelSzkicu extends JPanel {
	public PanelSzkicu() {
		ostatni = new Point2D.Double(100, 100);
		linie = new ArrayList<Line2D>();
		UchwytKlawisza sluchacz = new UchwytKlawisza();
		addKeyListener(sluchacz);
	}

	public boolean isFocusable() {
		return true; // zezwala na aktywacje panelu
	}

	/**
	 Dodaje nowa linie do szkicu
	 @param dx przesuniecie poziome
	 @param dy przesuniecie pionowe
	 */
	public void add(int dx, int dy) {
		// wyznacz nowy punkt koncowy
		Point2D koniec = new Point2D.Double(ostatni.getX() + dx,
				ostatni.getY() + dy);

		// dolacz nowa linie
		Line2D linia = new Line2D.Double(ostatni, koniec);
		linie.add(linia);
		repaint();

		// zapamietaj nowy punkt koncowy
		ostatni = koniec;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		// narysuj wszystkie linie
		for (Line2D l : linie) g2.draw(l);
	}

	private Point2D ostatni;
	private ArrayList<Line2D> linie;

	private static final int PREDKOSC_NORMALNA = 1;
	private static final int PREDKOSC_ZWIEKSZONA = 5;

	private class UchwytKlawisza implements KeyListener {
		public void keyPressed(KeyEvent zdarzenie) {
			int kodKlawisza = zdarzenie.getKeyCode();

			// wyznacz dystans
			int d;
			if (zdarzenie.isShiftDown())
				d = PREDKOSC_ZWIEKSZONA;
			else
				d = PREDKOSC_NORMALNA;

			// dolacz nowa linie
			if (kodKlawisza == KeyEvent.VK_LEFT) add(-d, 0);
			else if (kodKlawisza == KeyEvent.VK_RIGHT) add(d, 0);
			else if (kodKlawisza == KeyEvent.VK_UP) add(0, -d);
			else if (kodKlawisza == KeyEvent.VK_DOWN) add(0, d);
		}

		public void keyReleased(KeyEvent zdarzenie) {
		}

		public void keyTyped(KeyEvent zdarzenie) {
			char znakKlawisza = zdarzenie.getKeyChar();

			// wyznacz dystans
			int d;
			if (Character.isUpperCase(znakKlawisza)) {
				d = PREDKOSC_ZWIEKSZONA;
				znakKlawisza = Character.toLowerCase(znakKlawisza);
			} else
				d = PREDKOSC_NORMALNA;

			// dolacz nowa linie
			if (znakKlawisza == 'h') add(-d, 0);
			else if (znakKlawisza == 'l') add(d, 0);
			else if (znakKlawisza == 'k') add(0, -d);
			else if (znakKlawisza == 'j') add(0, d);
		}
	}
}
