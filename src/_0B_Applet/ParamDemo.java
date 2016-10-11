package _0B_Applet;

// aplet używający parametrów
import java.awt.*;
import java.applet.*;

public class ParamDemo extends Applet {
	String fontName;
	int fontSize;
	float leading;
	boolean active;

	// inicjalizacja napisu do wy�wietlania
	public void start() {
		String param;

		fontName = getParameter("fontName");
		if (fontName == null)
			fontName = "Nieznany";
		param = getParameter("fontSize");
		try {
			if (param != null)
				fontSize = Integer.parseInt(param);
			else
				fontSize = 0;
		} catch (NumberFormatException e) {
			fontSize = -1;
		}
		param = getParameter("leading");
		try {
			if (param != null)
				leading = Float.valueOf(param).floatValue();
			else
				leading = 0;
		} catch (NumberFormatException e) {
			leading = -1;
		}
		param = getParameter("accountEnabled");
		if (param != null)
			active = Boolean.valueOf(param).booleanValue();
	}

	// wy�wietlanie parametr�w
	public void paint(Graphics g) {
		g.drawString("Nazwa     fontu: " + fontName, 0, 10);
		g.drawString("Rozmiar   fontu: " + fontSize, 0, 26);
		g.drawString("Parametr glowny: " + leading, 0, 42);
		g.drawString("Konto   aktywne: " + active, 0, 58);
	}
}
