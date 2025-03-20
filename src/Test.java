import java.util.List;

public class Test {
        public static void main(String[] args) {
            SklepKomputerowy sklep = new SklepKomputerowy();


            sklep.dodajProdukt(new Produkt(1, "Laptop Dell XPS 13", "Laptop", 4999.99, 10));
            sklep.dodajProdukt(new Produkt(2, "Mysz Logitech MX Master 3", "Mysz", 349.99, 30));
            sklep.dodajProdukt(new Produkt(3, "Monitor Samsung 27\"", "Monitor", 1299.99, 15));


            Klient klient1 = new Klient(1, "Jan", "Kowalski", "jan.kowalski@example.com", true);
            Klient klient2 = new Klient(2, "Anna", "Nowak", "anna.nowak@example.com", false);
            sklep.dodajKlienta(klient1);
            sklep.dodajKlienta(klient2);


            List<Produkt> produktyZamowienia1 = List.of(sklep.getProdukty().get(0), sklep.getProdukty().get(1));
            List<Integer> ilosciZamowienia1 = List.of(1, 1);
            Zamowienie zamowienie1 = sklep.utworzZamowienie(klient1, produktyZamowienia1, ilosciZamowienia1);


            zamowienie1.wyswietlSzczegoly();
            sklep.wyswietlProduktyWKategorii("Laptop");
            sklep.wyswietlZamowieniaKlienta(1);
        }
    }

