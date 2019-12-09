package Laboratorium.dziedziczenie;

import java.util.Random;

public class TestFugura {
	public static void main(String[] args) {
		Random rand = new Random();
		Figura figura;

		if (rand.nextBoolean())
			figura = new Kwadrat();
		else
			figura = new Kolo();

		System.out.println(figura.getClass().getSimpleName() + " " + figura.pole());
		((Kwadrat)figura).metoda();

	}
}
