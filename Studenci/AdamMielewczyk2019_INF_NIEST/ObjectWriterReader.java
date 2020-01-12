import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectWriterReader {
    static boolean Write(Object object, String name) {
        try {
            FileOutputStream f = new FileOutputStream(new File(name+".txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(object);

            o.close();
            f.close();
            return true;
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
        return false;
    }

    static Object Read(String name) {
        try{
            FileInputStream fi = new FileInputStream(new File(name+".txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            Object obj = oi.readObject();

            oi.close();
            fi.close();

            return obj;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
