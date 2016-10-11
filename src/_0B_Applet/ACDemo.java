package _0B_Applet;

// Wy�wietla w przeglądarce stronę Duke.html

import java.awt.*;
import java.applet.*;
import java.net.*;

public class ACDemo extends Applet {
	public void start() {
		AppletContext ac = getAppletContext();
		URL url = getCodeBase();

		try {
			ac.showDocument(new URL(url + "Duke.html"));
			showStatus("Strona zaladowana");
		} catch (MalformedURLException e) {
			showStatus("strona nieodnaleziona");
		}
	}
}
