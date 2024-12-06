package zestaw6;

import java.util.Map;

public interface IKoszykZakupowy {

    double obliczCalkowitaWartosc();

    Map<Produkt, Integer> getProducts();

    void setProducts(Map<Produkt, Integer> products);

    boolean dodajProdukt(Produkt product, int count);

    default boolean exists(Produkt product) {
        return getProducts().containsKey(product);
    }
}
