package JavaWorld;

public class Main {

    public static void main(String[] args) {

        World javaWorld = World.getInstance();

        javaWorld.initialize(10, 10);


        for (int i = 0; i < 5; i++){
            System.out.println(javaWorld);
            javaWorld.makeTurn();
        }



    }
}
