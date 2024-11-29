package zestaw6;

import java.util.List;

public class Magazyn {

    private List<Produkt> produkty;

    public Magazyn(List<Produkt> produkty) {
        this.produkty = produkty;
    }

    @Override
    public String toString() {
        return "Magazyn{" +
                "produkty=" + produkty +
                '}';
    }
}
