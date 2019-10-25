import javax.print.DocFlavor;
import java.io.*;
import java.util.StringTokenizer;

public class CsvTokenizer  {

    private static String INPUT_FILE = "wig_d.csv";

    public static void main(String[] args) throws IOException {
        try{
            FileReader inputfr = new FileReader(INPUT_FILE);
            BufferedReader br = new BufferedReader(inputfr);
            String line;
            int length = 0;
            double sum = 0.0;
            br.readLine();
            double[] dataArray = new double[7000];
            while((line = br.readLine()) != null){
                length++;
                StringTokenizer st = new StringTokenizer(line, ",");
                st.nextToken();
                double openv = Double.parseDouble(st.nextToken());
                st.nextElement();
                st.nextElement();
                double closev = Double.parseDouble(st.nextToken());
                dataArray[length] = (closev-openv)/openv;
                sum += dataArray[length];


            }
            double mean = sum/length;
            double stdDeviation = 0.0;

            for(double data: dataArray){
                stdDeviation += Math.pow(data - mean, 2);
            }
            stdDeviation = Math.sqrt(stdDeviation/length);

            System.out.println("Odchylenie standardowe: " + stdDeviation);
            br.close();
            inputfr.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Nie znaleziono pliku");
            System.exit(0);
        }



    }
}
