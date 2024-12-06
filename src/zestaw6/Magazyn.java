package zestaw6;

import java.util.List;

public class Magazyn implements IMagazyn {

    private List<Produkt> produkty;

    public Magazyn(List<Produkt> produkty) {
        this.produkty = produkty;
    }

    public List<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(List<Produkt> produkty) {
        if (produkty == null || produkty.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.produkty = produkty;
    }

    @Override
    public String toString() {
        return "Magazyn{" +
                "produkty=" + produkty +
                '}';
    }
}
