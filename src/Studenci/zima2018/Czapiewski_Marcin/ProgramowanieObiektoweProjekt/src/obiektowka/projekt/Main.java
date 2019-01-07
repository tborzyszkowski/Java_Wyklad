package obiektowka.projekt;

import obiektowka.projekt.organisms.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var javaWorld = new World(8, 8);

        var grass = new Grass(new Position(4, 0), javaWorld);
        javaWorld.addOrganism(grass);

        var sheep = new Sheep(new Position(0, 0), javaWorld);
        javaWorld.addOrganism(sheep);

        var dandelion = new Dandelion(new Position(0, 4), javaWorld);
        javaWorld.addOrganism(dandelion);

        var wolf = new Wolf(new Position(7, 7), javaWorld);
        javaWorld.addOrganism(wolf);

        var toadstool = new Toadstool(new Position(4, 4), javaWorld);
        javaWorld.addOrganism(toadstool);

        System.out.println(javaWorld.toString());

        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 100; i++) {
            scan.nextLine();

            javaWorld.makeTurn();
            System.out.println(javaWorld);
        }
    }
}
