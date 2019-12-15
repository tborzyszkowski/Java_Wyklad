public class KoszykProduktow {
    public static void main(String[] args) throws Exception {
        InvoiceSystem system = new InvoiceSystem();
        system.addFaktura(new FakturaVAT("2019-12-01", "2019-11-29", "2019-11-06")
                .addProdukt(new Produkt("Apple", 10, 2.59, 0.08))
                .addProdukt(new Produkt("Cheery", 100, 4.59, 0.08))
                .addProdukt(new Produkt("Coffeemaker", 3, 329.99, 0.23))
                .removeProdukt(new Produkt("Coffeemaker", 3, 329.99, 0.23))
                .addFirma(new Firma("NexSoftware",  "583-315-69-91", "PL82 1020 1253 0000 0000 5810 0112")
                        .addAdres(new Adres("Szuberta 1A", "Wrzeszcz", "Gdansk", "80890", "Polska"))))

                .addFaktura(new FakturaVAT("2019-12-01", "2019-11-29", "2019-11-06")
                        .addProdukct(new Produkt("Apple", 1000, 2.39, 0.08))
                        .addProdukt(new Product("Orange", 900, 3.59, 0.08))
                        .addProdukt(new Produkt("Pineapple", 850, 4.11, 0.08))
                        .addProdukt(new Produkt("Juice", 550, 6.99, 0.08))
                        .addProdukt(new Produkt("Crate", 1800, 2.19, 0.34))
                        .addProdukt(new Produkt("Box", 2000, 0.69, 0.23))
                        .addProdukt(new Produkt("Plastic cup", 1050, 0.10, 0.23))
                        .addProdukt(new Produkt("Plastic cutlery's", 2500, 0.15, 0.23))
                        .addFirma(new Firma("NexBud",  "896-456-21-30", "PL53 5823 1000 0000 2539 1254 7853")
                                .addAdres(new Adres("Kwiatowa", "Oliwa", "Gdansk", "88-250", "Polska"))));

        System.out.println(system);
    }
}
