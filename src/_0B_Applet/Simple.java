package _0B_Applet;

// Przykład apleta ustawiającego kolory i wyświetlającego tekst

import java.awt.*;
import java.applet.*;

public class Simple extends Applet {
	String msg;

	// ustaw kolor t�a i pierwszego planu
	public void init() {
		setBackground(Color.cyan);
		setForeground(Color.red);
		msg = "I";
	}

	// tylko powi�kszamy msg
	public void start() {
		msg += "S";
	}

	// wy�wietl msg w oknie
	public void paint(Graphics g) {
		msg += "P";
		g.drawString(msg, 10, 30);
	}
}
