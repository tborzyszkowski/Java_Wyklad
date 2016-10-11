package _0B_Applet;

// Szkielet apleta
// Chociaż niczego nie zawiera można go skompilować i uruchomić

import java.awt.*;
import java.applet.*;

public class Szkielet extends Applet {

    //metoda wywo�ana jako pierwsza
    public void init() {
	// inicjalizacja
    }

    // metoda wywo�ywana jako druga, zaraz po init()
    // tak�e przy restarcie apleta
    public void start() {
	// rozpocznij lub wzn�w wykonanie
    }

    // metoda wywo�ywana, gdy aplet jest zatrzymywany
    public void stop() {
	// wstrzymaj wykonanie
    }

    // metoda niszczenia apleta
    public void destroy() {
	// zwalnianie zasob�w, itd.
    }

    // metoda wywo�ywana, gdy trzeba od�wie�y� okno apleta
    public void paint(Graphics g) {
	// od�wie� zawarto�� okna
    	g.drawString("Ala ma kota", 10, 10);
    }
}
