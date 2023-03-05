package Laboratorium.Lab01;

import java.util.Scanner;


public class RectangleFromKeyboard {
	public static void main(String[] args){
		int a, b;

		Scanner console = new Scanner(System.in);
		System.out.print("a = ");
		a = console.nextInt();
		System.out.print("b = ");
		b = console.nextInt();

		int pole = a * b;

		System.out.println("a = " + a + " b = " + b + " pole = " + pole);

	}
}
