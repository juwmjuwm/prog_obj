package zestaw6;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ISklep {

    List<Produkt> getProdukty();

    String getNazwaSklepu();

    LocalDate getDataPowstania();

    Magazyn getMagazyn();

    void setProdukty(List<Produkt> produkty);

    void setNazwaSklepu(String nazwaSklepu);

    void setDataPowstania(LocalDate dataPowstania);

    void setMagazyn(Magazyn magazyn);

    void dodajProdukt(Produkt produkt);

    void wyswietlOferty();

    Optional<Produkt> wyszukajProdukt(String nazwa);

    boolean zakupy(String nazwa, Klient klient);

    default Duration calculateShopAge() {
        return Duration.between(getDataPowstania(), LocalDate.now());
    }
}
