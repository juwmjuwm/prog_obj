package zestaw6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KoszykZakupowy {

    private Map<Produkt, Integer> products;
    private String nazwaSklepu;
    private LocalDate dataPowstania;
    private Magazyn magazyn;

    public KoszykZakupowy() {
        products = new HashMap<>();
        nazwaSklepu = "";
        dataPowstania = LocalDate.now();
        magazyn = new Magazyn(new ArrayList<>());
    }

    public KoszykZakupowy(
            Map<Produkt, Integer> products,
            String nazwaSklepu,
            LocalDate dataPowstania,
            Magazyn magazyn
    ) {
        if (dataPowstania.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException();
        }
        this.products = products;
        this.nazwaSklepu = nazwaSklepu;
        this.dataPowstania = dataPowstania;
        this.magazyn = magazyn;
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
