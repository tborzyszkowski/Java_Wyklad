package _0B_Applet;

// Przyklad odświeżania okna 

import java.awt.*;
import java.applet.*;

public class SimpleBanner extends Applet implements Runnable {
	String msg = " To jest bardzo duzy banner ";
	Thread t = null;
	int state;
	boolean stopFlag;

	// ustaw kolory
	public void init() {
		setBackground(Color.cyan);
		setForeground(Color.red);
		state = 0;
	}

	public void start() {
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}

	// cialo watku
	public void run() {
		char ch;

		// wyswietl banner
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

	// zatrzymaj aplet, baner tez
	public void stop() {
		stopFlag = true;
		t = null;
	}

	// wyswietl banner
	public void paint(Graphics g) {
		g.drawString(msg, 50, 30);
		showStatus("Banner po raz: " + state);
	}
}
