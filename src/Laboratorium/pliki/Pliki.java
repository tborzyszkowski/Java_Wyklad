package lab.pliki;

import java.io.*;
import java.util.Arrays;


public class Pliki {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("plik.dat");
		FileOutputStream fout = new FileOutputStream(f);
		
		byte b[] = {1,3,5,7,9,2,4,6,8,0};
		
		// zapis do strumienia
		try {
			fout.write(b);
		}
		catch(IOException e){
			System.out.println("Blad zapisu: " + e);
		}
		
		FileInputStream fin = new FileInputStream("plik.dat");
		
		byte d[] = new byte[10];
		
		try{
			fin.read(d);
		}
		catch(IOException e){
			System.out.println("Blad odczytu: " + e);
		}
		System.out.println("d[] = " + Arrays.toString(d));
	}

}
