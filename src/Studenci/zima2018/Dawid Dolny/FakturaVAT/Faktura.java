import java.lang.String;

public class Faktura {
    public static void main(String[] args){

        FakturaControl control = new FakturaControl();
        Position[] positions = new Position[10];
        control.factureGenerate();
        control.clientGenerate();
        control.positionGenerate(positions);
        control.bruttoGenerate(positions);

    }
}
