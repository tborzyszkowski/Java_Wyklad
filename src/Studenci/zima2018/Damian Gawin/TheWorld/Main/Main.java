package Main;

import Screens.MainScreen;
import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.input.Input;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main
{
    public static void main(String[] args) {
        Game.init();
        Game.screens().add(new MainScreen());
        Game.screens().display("MAIN");
        Game.world().camera().setFocus(new Point(250, 250));
        Game.start();
        Input.keyboard().onKeyPressed(KeyEvent.VK_ESCAPE, e -> System.exit(0));
    }
}
