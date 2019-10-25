import java.io.*;


public class Teksty {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("tekst.txt")
				);
		PrintWriter pw = new PrintWriter(
				new FileWriter("zaszyfrowane.txt",false)
				);
		
		String linia;
		String klucz = args[0].toLowerCase();
		while((linia = br.readLine()) != null){
			char[] c = linia.toLowerCase().replaceAll("\\s+","").toCharArray();
				for(int i = 0; i < c.length; i++){
					int w = klucz.charAt(i%klucz.length());


					c[i] = (char)(((c[i]- 97 + w - 97)% 26) + 97);
					pw.print(c[i]);

				}
			pw.println();
		}



		pw.close();
		br.close();
		pw = new PrintWriter(
				new FileWriter("odszyfrowane.txt", false)
		);
		br = new BufferedReader(
				new FileReader("zaszyfrowane.txt")
		);

		while((linia = br.readLine()) != null){
			char[] c = linia.toCharArray();
				for(int i = 0; i < c.length; i++){
					int w = klucz.charAt(i%klucz.length());
					int k;
					k = ((c[i]- 97 - w + 97)%26);
					if (k < 0) k += 97 + 26;
					else k += 97;
					pw.print((char)k);
				}
			pw.println();
		}

		
		pw.close();
		br.close();
	}
}
