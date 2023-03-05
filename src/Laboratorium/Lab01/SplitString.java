package Laboratorium.Lab01;

public class SplitString {
	public static void main(String[] args){
		String tekst = "Ala ma kota";
		String[] slowa = tekst.split(" ");

		for(String s : slowa)
			System.out.println(s);
	}
}
