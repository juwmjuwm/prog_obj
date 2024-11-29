package zestaw6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Sklep {

    private List<Produkt> produkty;

    public Sklep() {
        produkty = new ArrayList<>();
    }

    public Sklep(List<Produkt> produkty) {
        this.produkty = produkty;
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public void wyswietlOferty() {
        System.out.println("Oferta sklepu:");
        for (Produkt p : produkty) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Oferta sklepu:\n");
        for (Produkt p : produkty) {
            sb.append(p);
        }
        return sb.toString();
    }

    public Optional<Produkt> wyszukajProdukt(String nazwa) {
        Produkt withName = new Produkt(nazwa, 0, 0);
        if (!produkty.contains(withName)) {
            return Optional.empty();
        }
        Produkt found = produkty.get(produkty.indexOf(withName));
        return Optional.ofNullable(found);
    }

    public boolean zakupy(String nazwa, Klient klient) {
        Optional<Produkt> produktOptional = wyszukajProdukt(nazwa);
        if (produktOptional.isEmpty()) {
            return false;
        }
        Produkt produkt = produktOptional.get();
        if (produkt.getIloscNaMagazynie() == 0) {
            return false;
        }
        klient.getKoszyk().dodajProdukt(produkt, 1);
        return true;
    }
}
