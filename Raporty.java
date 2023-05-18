class Raporty {
    private Klient[] klienci;
    private Wycieczka[] wycieczki;
    private int liczbaKlientow;
    private int liczbaWycieczek;

    public Raporty(int maksymalnaLiczbaKlientow, int maksymalnaLiczbaWycieczek) {
        klienci = new Klient[maksymalnaLiczbaKlientow];
        wycieczki = new Wycieczka[maksymalnaLiczbaWycieczek];
        liczbaKlientow = 0;
        liczbaWycieczek = 0;
    }

    public void dodajKlienta(Klient klient) {
        klienci[liczbaKlientow] = klient;
        liczbaKlientow++;
    }

    public void dodajWycieczke(Wycieczka wycieczka) {
        wycieczki[liczbaWycieczek] = wycieczka;
        liczbaWycieczek++;
    }

    public void wypiszRaport() {
        System.out.println("Liczba klientów: " + liczbaKlientow);
        for (int i = 0; i < liczbaKlientow; i++) {
            System.out.println("Klient " + (i + 1) + ":");
            System.out.println("- " + klienci[i].przypisaneInformacje());
        }
        System.out.println("Liczba wycieczek: " + liczbaWycieczek);
        for (int i = 0; i < liczbaWycieczek; i++) {
            System.out.println("Wycieczka " + (i + 1) + ":");
            System.out.println("- " + wycieczki[i].informacje());
        }
    }
}