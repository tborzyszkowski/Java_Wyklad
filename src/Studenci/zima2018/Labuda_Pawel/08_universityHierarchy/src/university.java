public class university {
    public static void main(String[] args) {
        Student student = new Student("Berget", "Phillip", 1995, "male", 101);
        Lecturer lecturer = new Lecturer("Murry", "Maestas", 1980, "male", "Senior Scientist I");
        Scholarshiper scholarshiper = new Scholarshiper("Nicola", "O'kane", 1996, "female", 1000.50);

        System.out.println(student);
        System.out.println(lecturer);
        System.out.println(scholarshiper);
    }
}
