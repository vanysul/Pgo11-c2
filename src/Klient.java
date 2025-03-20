class Klient {
    private int id;
    private String imie;
    private String nazwisko;
    private String email;
    private boolean czyStaly;

    public Klient(int id, String imie, String nazwisko, String email, boolean czyStaly) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.czyStaly = czyStaly;
    }

    public int getId() {
        return id;
    }

    public boolean isCzyStaly() {
        return czyStaly;
    }

    public void wyswietlInformacje() {
        System.out.println("ID: " + id + ", Imię: " + imie + ", Nazwisko: " + nazwisko +
                ", Email: " + email + ", Stały klient: " + (czyStaly ? "Tak" : "Nie"));
    }
}
