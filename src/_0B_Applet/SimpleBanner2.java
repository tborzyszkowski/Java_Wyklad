package _0B_Applet;

// Przykład bannera z parametrem  

import java.awt.*;
import java.applet.*;

public class SimpleBanner2 extends Applet implements Runnable {
	String msg;
	Thread t = null;
	int state;
	boolean stopFlag;
	String fontName;
	int fontSize;

	// ustaw kolory
	public void init() {
		setBackground(Color.cyan);
		setForeground(Color.red);
		state = 0;
	}

	public void start() {
		// parametry fontu
		fontName = getParameter("fontName");
		if (fontName == null)
			fontName = "Arial";
		msg = getParameter("fontSize");
		try {
			if (msg != null)
				fontSize = Integer.parseInt(msg);
			else
				fontSize = 18;
		} catch (NumberFormatException e) {
			fontSize = 14;
		}
		// tekst bannera
		msg = getParameter("message");
		if (msg == null)
			msg = "Brak parametru";
		msg = " " + msg;
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}

	// cialo watku
	public void run() {
		char ch;

		// wy�wietl banner
		for (;;) {
			try {
				repaint();
				state += 1;
				Thread.sleep(250);
				ch = msg.charAt(0);
				msg = msg.substring(1, msg.length());
				msg += ch;
				if (stopFlag)
					break;
			} catch (InterruptedException e) {
			}
		}
	}

	// zatrzymaj aplet, baner te�
	public void stop() {
		stopFlag = true;
		t = null;
	}

	// wyswietl banner
	public void paint(Graphics g) {
		setFont(new Font(fontName, Font.BOLD, fontSize));
		g.drawString(msg, 50, 30);
		showStatus("Banner po raz: " + state);
	}
}
