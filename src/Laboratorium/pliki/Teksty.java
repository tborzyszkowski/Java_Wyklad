package Laboratorium.pliki;

import java.io.*;


public class Teksty {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("Resources\\tekst.txt")
				);
		PrintWriter pw = new PrintWriter(
				new FileWriter("Resources\\tekst2.txt",false)
				);
		
		String linia;
		while((linia = br.readLine()) != null)
			pw.println(linia.toUpperCase());
		
		pw.close();
		br.close();
	}
}
