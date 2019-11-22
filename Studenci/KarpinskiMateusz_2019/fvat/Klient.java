package fvat;

public  class Klient {
    private String nazwa;
    private String adres;
    private String nip;

    public Klient(String nazwa, String adres, String nip){
        this.nazwa = nazwa;
        this.adres = adres;
        this.nip = nip;
    }

    public String getNazwa() { return nazwa; }

    public String getAdres() { return adres; }

    public String nip() { return nip; }

    @Override
    public String toString(){
        return "Nazwa: " + nazwa + '\n' + "Adres: " + adres + '\n' + "NIP: " + nip + '\n';
    }
}

