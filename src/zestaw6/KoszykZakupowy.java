package zestaw6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KoszykZakupowy {

    private Map<Produkt, Integer> products;

    public KoszykZakupowy() {
        products = new HashMap<>();
    }

    public Map<Produkt, Integer> getProducts() {
        return products;
    }

    public boolean dodajProdukt(Produkt product, int count) {
        if (count <= 0 || count > product.getIloscNaMagazynie()) {
            return false;
        }
        if (products.containsKey(product)) {
            int curCount = products.get(product);
            products.put(product, curCount + count);
        } else {
            products.put(product, count);
        }
        product.setIloscNaMagazynie(product.getIloscNaMagazynie() - count);
        return true;
    }

    public void wyswietlZawartoscKoszyka() {
        System.out.println("Zawartość koszyka:");
        for (Map.Entry<Produkt, Integer> e : products.entrySet()) {
            System.out.printf("Nazwa produktu: %s | Ilość: %d%n", e.getKey().getNazwa(), e.getValue());
        }
    }

    public double obliczCalkowitaWartosc() {
        double total = 0;
        for (var entry : products.entrySet()) {
            total += entry.getValue() * entry.getKey().getCena();
        }
        return total;
    }
}
