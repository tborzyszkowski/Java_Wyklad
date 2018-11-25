public class hrSystem {
    public static void main(String[] args) {
        Manager manager_01 = new Manager("Saba", "Card", 1986, 8000, 0.05,
                200, "+1-202-555-0155", "202-555-0111", 100, "Production");

        ExecutiveBoardMember executiveBoardMember_01 = new ExecutiveBoardMember("Jade", "Bonni",
                1985, 12500, manager_01, 24);

        ManualWorker manualWorker_01 = new ManualWorker("Roley", "Schrauwen", 1990,
                12.5, 164, 8, manager_01,
                new String[]{"forklift license", "driving license"});

        ManualWorker manualWorker_02 = new ManualWorker("Mitzi", "Hupe", 1980,
                14.5, 120, 24, manager_01,
                new String[]{"forklift license"});

        WhiteCollarWorker whiteCollarWorker_01 = new WhiteCollarWorker("Morrie", "Falter-butera",
                1970, 2500, 0.02, manager_01, "+1-202-555-0186", 101);

        Trainee trainee_01 = new Trainee("Eleni", "Whitehead", 1975,
                whiteCollarWorker_01, false);

        System.out.println(manager_01);
        System.out.println(executiveBoardMember_01);
        System.out.println(manualWorker_01);
        System.out.println(manualWorker_02);
        System.out.println(whiteCollarWorker_01);
        System.out.println(trainee_01);

        System.out.println("\n--- NET PAYMENT ---");
        manager_01.printNetPayment(manager_01.netPayment());
        executiveBoardMember_01.printNetPayment(executiveBoardMember_01.netPayment());
        manualWorker_01.printNetPayment(manualWorker_01.netPayment());
        manualWorker_02.printNetPayment(manualWorker_02.netPayment());
        whiteCollarWorker_01.printNetPayment(whiteCollarWorker_01.netPaymnt());
        trainee_01.printNetPayment(trainee_01.netPayment());
    }
}
