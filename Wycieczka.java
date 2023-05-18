class Wycieczka {
    private String start;
    private String koniec;
    private String cel;

    public Wycieczka(String start, String koniec, String cel) {
        this.start = start;
        this.koniec = koniec;
        this.cel = cel;
    }

    public String informacje() {
        return "Wycieczka do " + cel + ", od " + start + " do " + koniec;
    }
}