import java.util.Scanner;

class CaesarCipher
{
    public static StringBuffer encrypt(String text, int shift)
    {
        StringBuffer result = new StringBuffer();

        for (int i=0; i<text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char)(((int)text.charAt(i) + shift - 65) % 26 + 65);
                result.append(ch);
            }
            else {
                char ch = (char)(((int)text.charAt(i) + shift - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wiadomość: ");
        String text = scan.nextLine();
        System.out.println("Podaj przesunięcie: ");
        int s = scan.nextInt();
        System.out.println("Wiadomość    : " + text);
        System.out.println("Przesunięcie : " + s);
        System.out.println("Szyfr        : " + encrypt(text, s));
    }
}