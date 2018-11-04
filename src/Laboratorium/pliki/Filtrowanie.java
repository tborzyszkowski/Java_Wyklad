package lab.pliki;

import java.io.*;
import java.util.zip.*;


public class Filtrowanie {

	public static void main(String[] args) throws IOException {
		ZipOutputStream zout = new ZipOutputStream(
				new FileOutputStream("dane.zip")
				);
		DataOutputStream dout = new DataOutputStream(zout);
		
		ZipEntry ze = new ZipEntry("dane.dat");
		zout.putNextEntry(ze);
		
		// zapis do pliku binarnego
		
		dout.writeByte(16);
		dout.writeDouble(3.14);
		dout.writeInt(123456);
		
		zout.closeEntry(); // zamknij zipowany plik
		dout.close();      // zamknij zipa
		
		// treaz czytamy
		ZipInputStream zin = new ZipInputStream(
				new FileInputStream("dane.zip")
				);
		DataInputStream din = new DataInputStream(zin);

		ze = zin.getNextEntry();
		
		byte b = din.readByte();
		double d = din.readDouble();
		int i = din.readInt();
		System.out.println("b = " + b + "d = " + d + "i = " + i);
	}

}
