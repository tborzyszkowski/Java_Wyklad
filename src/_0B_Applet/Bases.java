package _0B_Applet;

// Wyświetla położenie kodu i dokumentu
import java.awt.*;
import java.applet.*;
import java.net.*;

public class Bases extends Applet {

	public void paint(Graphics g) {
		String msg;

		URL url = getCodeBase();
		msg = "Kod apleta : " + url.toString();
		g.drawString(msg, 10, 20);

		url = getDocumentBase();
		msg = "Dokument apleta : " + url.toString();
		g.drawString(msg, 10, 40);
	}
}
