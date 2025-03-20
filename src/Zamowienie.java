import java.util.List;
 public  class Zamowienie {
    private static int licznik = 1;
    private int id;
    private Klient klient;
    private List<Produkt> produkty;
    private List<Integer> ilosci;
    private String status;

    public Zamowienie(Klient klient, List<Produkt> produkty, List<Integer> ilosci) {
        this.id = licznik++;
        this.klient = klient;
        this.produkty = produkty;
        this.ilosci = ilosci;
        this.status = "Nowe";
    }

    public int getId() { return id; }
    public String getStatus() { return status; }
    public Klient getKlient() { return klient; }
    public List<Produkt> getProdukty() { return produkty; }
    public List<Integer> getIlosci() { return ilosci; }

    public void zmienStatus(String nowyStatus) { this.status = nowyStatus; }

    public double obliczWartoscZamowienia() {
        double suma = 0;
        for (int i = 0; i < produkty.size(); i++) {
            suma += produkty.get(i).getCena() * ilosci.get(i);
        }
        return klient.isCzyStaly() ? suma * 0.9 : suma;
    }

    public void wyswietlSzczegoly() {
        System.out.println("Zamówienie ID: " + id + ", Klient: " + klient.getId() + ", Status: " + status);
        for (int i = 0; i < produkty.size(); i++) {
            System.out.println(produkty.get(i).getNazwa() + " - Ilość: " + ilosci.get(i));
        }
        System.out.println("Łączna wartość: " + obliczWartoscZamowienia() + " PLN\n");
    }
}

