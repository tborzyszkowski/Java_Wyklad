import java.lang.String;
import java.time.Instant;
import java.util.Random;

public class FakturaControl {
    Client client = new Client();
    Position position = new Position();


    void factureGenerate(){
        Random rand = new Random();
        int nrFV = rand.nextInt(1000);
        System.out.println("FAKTURA VAT/2018/"+nrFV);
        System.out.println(" ");
        System.out.println("Data wystawienia dokumentu: "+Instant.now());
        System.out.println(" ");
    }

    void clientGenerate(){
        System.out.println("Dane nabywcy: ");
        Client client = new Client("TecMobile","Gdansk","5854647896","14253647851648161");
        client.printInfo();
        System.out.println(" ");
    }

    void positionGenerate(Position[] positions){
        System.out.println("PRODUKTY: ");
        positions[0]= new Position("Słuchawki", 1, 49.90);
        positions[1]= new Position("Podkładka", 3, 4.99);
        positions[2]= new Position("Klawiatura", 1, 124.90);

        for(int i=0;i<3;i++){
            positions[i].printInfo();
        }
        System.out.println(" ");
    }
    void bruttoGenerate(Position[] positions){
        double sumBrutto=0;
        for(int i=0;i<3;i++){
            sumBrutto=sumBrutto+positions[i].getBruttoPrice();
        }
        System.out.println("Suma brutto: ");
        System.out.format("%.2f%n",sumBrutto);
    }

}
