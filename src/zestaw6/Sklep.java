package zestaw6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Sklep implements ISklep {

    private List<Produkt> produkty;
    private String nazwaSklepu;
    private LocalDate dataPowstania;
    private Magazyn magazyn;


    public Sklep() {
        produkty = new ArrayList<>();
        nazwaSklepu = "";
        dataPowstania = LocalDate.now();
        magazyn = new Magazyn(new ArrayList<>());
    }

    public Sklep(
            List<Produkt> produkty,
            String nazwaSklepu,
            LocalDate dataPowstania,
            Magazyn magazyn
    ) {
        if (dataPowstania.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException();
        }
        this.produkty = produkty;
        this.nazwaSklepu = nazwaSklepu;
        this.dataPowstania = dataPowstania;
        this.magazyn = magazyn;
    }

    public List<Produkt> getProdukty() {
        return produkty;
    }

    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public LocalDate getDataPowstania() {
        return dataPowstania;
    }

    public Magazyn getMagazyn() {
        return magazyn;
    }

    public void setProdukty(List<Produkt> produkty) {
        if (produkty == null || produkty.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.produkty = produkty;
    }

    public void setNazwaSklepu(String nazwaSklepu) {
        if (nazwaSklepu == null) {
            throw new IllegalArgumentException();
        }
        this.nazwaSklepu = nazwaSklepu;
    }

    public void setDataPowstania(LocalDate dataPowstania) {
        if (dataPowstania.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException();
        }
        this.dataPowstania = dataPowstania;
    }

    public void setMagazyn(Magazyn magazyn) {
        if (magazyn == null) {
            throw new IllegalArgumentException();
        }
        this.magazyn = magazyn;
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
        magazyn.getProdukty().add(produkt);
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
