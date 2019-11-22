import java.io.*;
import java.lang.*;


class methods {
    static int countOccurence(String cardType) throws IOException {
        BufferedReader csvRead = new BufferedReader(new FileReader("SalesJan2009.csv"));
        String row;
        int count = 0;
        while((row = csvRead.readLine()) != null) {
            String[] data = row.split(",");
            if(data[3].equals(cardType)) {
                count += 1;
            }
        }
        return count;
    }
}
public class CSVRep {
    public static void main(String[] args) throws IOException {
        BufferedReader csvRead = new BufferedReader(new FileReader("SalesJan2009.csv"));
        methods met = new methods();
        String row;
        while((row = csvRead.readLine()) != null) {
             String[] data = row.split(",");
             System.out.println();
             System.out.print(data[0] + " " + data[1] + " " + data[2] + " " + data[3] + " " + data[4] + " " + data[5] + " " + data[6] + " " + data[7] + " " + data[8] + " " + data[9] + " " + data[10] + " " + data[11]);
        }
        System.out.println();
        System.out.println("MasterCard used "+met.countOccurence("Mastercard")+" times, Visa used "+met.countOccurence("Visa")+" times.");
        double occ = met.countOccurence("Mastercard");
        double percentage = (occ/999.0)*100;
        System.out.println("MasterCard was used in "+ Math.round(percentage)+"% of operations.");
        csvRead.close();
    }
}