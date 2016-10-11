package lab.pliki;

import java.util.zip.*;
import java.io.*;

public class CzytajZip {

	public static void main(String[] args) throws IOException{
		ZipInputStream zin = new ZipInputStream(
				new FileInputStream("przyklad.zip")
				);
		BufferedReader br = new BufferedReader(
				new InputStreamReader(zin)
				);
		// czytamy tekst
		ZipEntry ze;
		String wiersz;
		while((ze = zin.getNextEntry())!= null){
			System.out.println(ze.getName());
			System.out.println("--------------");
			while((wiersz = br.readLine()) != null){
				System.out.println(wiersz);
			}
			zin.closeEntry();
		}
		zin.close();
		
	}

}
