import java.io.*;
import java.util.Enumeration;
import java.util.zip.*;
import java.sql.Timestamp;


public class Filtrowanie {

	public static void main(String[] args) throws IOException {
		ZipOutputStream zout = new ZipOutputStream(
				new FileOutputStream("dane.zip")
				);
		DataOutputStream dout = new DataOutputStream(zout);
		ZipEntry ze = new ZipEntry("dane.dat");
		ZipEntry ze2 = new ZipEntry("dane2.txt");
		ze.setTime(System.currentTimeMillis());
		ze.setComment("Przykladowy komentarz");
		ze2.setTime(System.currentTimeMillis());
		ze2.setComment("Komentarz2");
		zout.putNextEntry(ze);


		// zapis do pliku binarnego


		dout.writeByte(16);
		dout.writeDouble(3.14);
		dout.writeInt(123456);

		zout.putNextEntry(ze2);

		dout.writeChars("ABCDefjd");

		zout.closeEntry(); // zamknij zipowany plik
		dout.close();      // zamknij zipa
		
		// treaz czytamy
		ZipFile zin = new ZipFile("dane.zip");
		//DataInputStream din = new DataInputStream(zin);

		System.out.println("*** " + zin.getName()+ " ***");
		for(Enumeration<? extends ZipEntry> entries = zin.entries(); entries.hasMoreElements();)
		{
			ZipEntry entry = entries.nextElement();
			System.out.println();
			System.out.println("Nazwa: " + entry.getName());
			if (entry.isDirectory()) System.out.println("Katalog");
			else System.out.println("Plik");
			System.out.println("Data ostatniej modyfikacji: " + new Timestamp(entry.getTime()));
			System.out.println("Komentarz: " + entry.getComment());
			System.out.println("Rozmiar: " + entry.getSize());
			//byte b = din.readByte();
			//double d = din.readDouble();
			//int i = din.readInt();
			//System.out.println("b = " + b + " d = " + d + " i = " + i);
		}
		zin.close();
		}
	}

