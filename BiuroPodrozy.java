class BiuroPodrozy {
    public static void main(String[] args) {
        //Klient 1
        Adres adres = new Adres("ul. Wesola 13", "00-000", "Sosnowiec");
        Klient klient = new Klient("Jan Nowak");
        klient.pobranieAdresu(adres);
        //Klient 2
        Adres adres2 = new Adres("ul. Spiewna 25", "00-000", "Katowice");
        Klient klient2 = new Klient("Mateusz Kowalski");
        klient2.pobranieAdresu(adres2);
        //Wycieczka
        Wycieczka wycieczka = new Wycieczka("24-07-2022", "31-07-2022", "Paryż");
        klient.przypisanieWycieczki(wycieczka);
        klient2.przypisanieWycieczki(wycieczka);
        //Wyświetl
        System.out.println(klient.przypisaneInformacje() + "\n");
        System.out.println(klient2.przypisaneInformacje() + "\n");
        //Raporty
        System.out.println("Raporty:");
        Raporty raporty = new Raporty(2, 1);
        raporty.dodajKlienta(klient);
        raporty.dodajKlienta(klient2);
        raporty.dodajWycieczke(wycieczka);
        raporty.wypiszRaport();
    }
}