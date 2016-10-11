package lab.pliki;

import java.io.*;


public class Teksty {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("tekst.txt")
				);
		PrintWriter pw = new PrintWriter(
				new FileWriter("tekst2.txt",false)
				);
		
		String linia;
		while((linia = br.readLine()) != null)
			pw.println(linia.toUpperCase());
		
		pw.close();
		br.close();
	}
}
