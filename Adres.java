class Adres {
    private String ulica;
    private String kodPocztowy;
    private String miasto;

    public Adres(String ulica, String kodPocztowy, String miasto) {
        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    public String informacje() {
        return ulica + ", " + kodPocztowy + " " + miasto;
    }
}



