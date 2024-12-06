package zestaw6;

import java.util.HashMap;
import java.util.Map;

public class KoszykZakupowy implements IKoszykZakupowy {

    private Map<Produkt, Integer> products;

    public KoszykZakupowy() {
        products = new HashMap<>();
    }

    public KoszykZakupowy(Map<Produkt, Integer> products) {
        this.products = products;
    }

    public Map<Produkt, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Produkt, Integer> products) {
        if (products == null || products.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.products = products;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zawartość koszyka:\n");
        for (Map.Entry<Produkt, Integer> e : products.entrySet()) {
            sb.append(String.format("Nazwa produktu: %s | Ilość: %d%n", e.getKey().getNazwa(), e.getValue()));
        }
        return sb.toString();
    }

    public double obliczCalkowitaWartosc() {
        double total = 0;
        for (var entry : products.entrySet()) {
            total += entry.getValue() * entry.getKey().getCena();
        }
        return total;
    }
}
