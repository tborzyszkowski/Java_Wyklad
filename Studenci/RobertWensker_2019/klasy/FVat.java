import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FVat {
    public static void main(String[] args) {
    Produkt[] itemArray = {new Produkt("Koszula",2,12.98),new Produkt("Spodnie",1,123.99),new Produkt("Czapka",4,10.8)};
    ClientSeller Seller = new ClientSeller("MyShop.com","My Adress 89-213","1234567890");
    ClientSeller Buyer = new ClientSeller("Wojtek Kowalski","Aleja Rodla 45b, Malbork 82-400","987654321","123 123 123 123 123");
    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
    String[] info = {"2019-11-20", "2019-11-20"};
    var total = 0.0;
    Date currentDate = new Date();
   /* System.out.println(Seller.getName());
    System.out.println(Seller.getAdress());
    System.out.println(Seller.getNIP());*/
   /* for (int i = 0; i < itemArray.length; i++){
        var name = itemArray[i].name;
        var quantity = itemArray[i].quantity;
        var nPrice = itemArray[i].nPrice;
        var nSum =  quantity * nPrice ;
        double vat = (double) ( (int) (nSum * 1.23 * 100))/100 ;
        total+=vat;
       // System.out.println(name + " " + quantity + " "  + nPrice + " " + nSum + " " + vat);
    }
        total = (double) ( (int) (total * 100))/100;*/
       /* System.out.println("Total: " + total);
        System.out.println(Buyer.getName());
        System.out.println(Buyer.getAdress());
        System.out.println(Buyer.getNIP());
        System.out.println(Buyer.getBankAccount());
        System.out.println();
        Date currentDate = new Date();
        System.out.println(ft.format(currentDate));
        System.out.println(info[0]);
        System.out.println(info[1]);
        System.out.println(info[2]);*/
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Faktura.txt"));
            File fNumber = new File("Numer faktury.txt");
            BufferedReader br = new BufferedReader(new FileReader(fNumber));
                String fnumber = br.readLine();
                br.close();
            var k = Integer.parseInt(fnumber);
            k++;
            fnumber = Integer.toString(k);
            BufferedWriter bw = new BufferedWriter(new FileWriter(fNumber));
                bw.write(fnumber);
                bw.close();
            writer.write("Numer Faktury: " + fnumber + "\n");
            writer.write("Dane Kupujacego:" + "\n");
            writer.write("Imie i Nazwisko: " + Buyer.getName() + "\n");
            writer.write("Adres: " + Buyer.getAdress() + "\n");
            writer.write("Numer NIP: " + Buyer.getNIP() + "\n");
            writer.write("Numer konta: " + Buyer.getBankAccount() + "\n");
            //var total = 0.0;
            for (int i = 0; i < itemArray.length; i++) {
                var name = itemArray[i].getName();
                var quantity = itemArray[i].getQuantity();
                var nPrice = itemArray[i].getnPrice();
                var nSum = quantity * nPrice;
                double vat = (double) ((int) (nSum * 1.23 * 100)) / 100;
                total += vat;
                writer.write("Produkt: " +name + "\n" + "Ilosc: " + quantity + "\n" + "Cena netto: " + nSum + "\n" + "Podatek VAT: 23%" + "\n" + "Wyliczona cena brutto: " + vat + "\n");
            }
            writer.write("Suma: " + total + "\n");
            writer.write("Dane Sprzedajacego:\n");
            writer.write("Nazwa: " + Seller.getName() + '\n');
            writer.write("Adres: " + Seller.getAdress() + '\n');
            writer.write("Numer NIP: " + Seller.getNIP() + '\n');
            writer.write("Data wydania faktury: " + ft.format(currentDate) + '\n');
            writer.write("Data sprzedazy: " + info[0] + "\n");
            writer.write("Data zaplaty: " + info[1] + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    }

