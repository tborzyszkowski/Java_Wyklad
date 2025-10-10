package Laboratorium.generic;

public class Main {
    public static void main(String[] args) {
        String[] table = {"a", "b", "c", "d", "e", "f", "g", "h"};
        GenericObject<String> go = new GenericObject<>(table);
        System.out.println(go.getT());
    }
}
