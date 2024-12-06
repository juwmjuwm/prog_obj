package zestaw6;

public interface IZamowienie {

    IKoszykZakupowy getKoszyk();

    OrderStatus getStatus();

    Platnosc getPlatnosc();

    void ustawStatusZamowienia(OrderStatus status);

    boolean finalizujZamowienie();

    boolean zwrocProdukt(Produkt produkt, int count);

    default boolean containsProduct(Produkt product) {
        return getKoszyk().getProducts().containsKey(product);
    }
}
