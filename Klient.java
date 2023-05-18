class Klient {
    private String name;
    private Adres adres;
    private Wycieczka wycieczka;

    public Klient(String name) {
        this.name = name;
    }

    public void pobranieAdresu(Adres adres) {
        this.adres = adres;
    }

    public void przypisanieWycieczki(Wycieczka wycieczka) {
        this.wycieczka = wycieczka;
    }

    public String przypisaneInformacje() {
        String info = "Klient " + name + ":\n";
        info += "- Adres: " + adres.informacje() + "\n";
        info += "- Wycieczka: " + wycieczka.informacje();
        return info;
    }
}


