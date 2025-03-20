import java.util.ArrayList;
import java.util.List;

// Klasa zarządzająca sklepem
class SklepKomputerowy {
    private List<Produkt> produkty = new ArrayList<>();
    private List<Klient> klienci = new ArrayList<>();
    private List<Zamowienie> zamowienia = new ArrayList<>();

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public List<Produkt> getProdukty() {
        return produkty;
    }

    public Zamowienie utworzZamowienie(Klient klient, List<Produkt> produkty, List<Integer> ilosci) {
        Zamowienie zamowienie = new Zamowienie(klient, produkty, ilosci);
        zamowienia.add(zamowienie);
        aktualizujStanMagazynowy(zamowienie);
        return zamowienie;
    }

    private void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        for (int i = 0; i < zamowienie.getProdukty().size(); i++) {
            Produkt produkt = zamowienie.getProdukty().get(i);
            int nowaIlosc = produkt.getIloscWMagazynie() - zamowienie.getIlosci().get(i);
            produkt.setIloscWMagazynie(nowaIlosc);
        }
    }

    public void wyswietlProduktyWKategorii(String kategoria) {
        System.out.println("Produkty w kategorii: " + kategoria);
        for (Produkt produkt : produkty) {
            if (produkt.getKategoria().equalsIgnoreCase(kategoria)) {
                produkt.wyswietlInformacje();
            }
        }
    }

    public void wyswietlZamowieniaKlienta(int idKlienta) {
        System.out.println("Zamówienia klienta o ID: " + idKlienta);
        for (Zamowienie zamowienie : zamowienia) {
            if (zamowienie.getKlient().getId() == idKlienta) {
                zamowienie.wyswietlSzczegoly();
            }
        }


    }
}
