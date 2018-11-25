public class testSzkoła
{
    public static void main(String[] args)
    {
        Student Student1 = new Student("Piotr", "Ropel", 1989, "Mężczyzna", 256187);
        Stypendysta Stypendysta1 = new Stypendysta("Karol", "Bąk", 1994, "Mężczyzna", 268943, 1250);
        Wykładowca Wykładowca1 = new Wykładowca("Wacław", "Kras", 1965, "Mężczyzna", "Profesor");
        System.out.println(Student1.toString());
        System.out.println(Wykładowca1.toString());
        System.out.println(Stypendysta1.toString());
    }

}
