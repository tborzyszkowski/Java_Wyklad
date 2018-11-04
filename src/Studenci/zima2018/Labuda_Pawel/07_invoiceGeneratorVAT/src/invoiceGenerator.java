public class invoiceGenerator {
    public static void main(String[] args) throws Exception {
        InvoiceSystem system = new InvoiceSystem();
        system.addInvoice(new InvoiceVat("2018-11-03", "2018-10-28", "2018-11-05")
                .addProduct(new Product("Apple", 10, 2.59, 0.08))
                .addProduct(new Product("Cheery", 100, 4.59, 0.08))
                .addProduct(new Product("Coffeemaker", 3, 329.99, 0.23))
                .removeProduct(new Product("Coffeemaker", 3, 329.99, 0.23))
                .addCompany(new Company("Sunrise Titanic",  "856-188-45-49", "PL83 1010 1023 0000 2613 9510 0000")
                        .addAddress(new Address("975 Trails End Road", "Fort Lauderdale", "Florida", "34436", "USA"))))

                .addInvoice(new InvoiceVat("2018-12-12", "2018-12-01", "2018-12-31")
                        .addProduct(new Product("Apple", 1000, 2.39, 0.08))
                        .addProduct(new Product("Orange", 900, 3.59, 0.08))
                        .addProduct(new Product("Pineapple", 850, 4.11, 0.08))
                        .addProduct(new Product("Juice", 550, 6.99, 0.08))
                        .addProduct(new Product("Crate", 1800, 2.19, 0.34))
                        .addProduct(new Product("Box", 2000, 0.69, 0.23))
                        .addProduct(new Product("Plastic cup", 1050, 0.10, 0.23))
                        .addProduct(new Product("Plastic cutlery's", 2500, 0.15, 0.23))
                        .addCompany(new Company("Door Paradise",  "328-787-26-96", "PL41 9093 1033 6190 2896 8949 4979")
                                .addAddress(new Address("Central Campus Ave", "Lecompte", "LA", "L71346", "USA"))));

        System.out.println(system);
    }
}
