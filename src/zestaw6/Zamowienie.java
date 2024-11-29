package zestaw6;

public class Zamowienie {

    private KoszykZakupowy koszyk;
    private OrderStatus status;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszyk, OrderStatus status) {
        this.koszyk = koszyk;
        this.status = status;
        this.platnosc = new Platnosc(koszyk.obliczCalkowitaWartosc(), PaymentStatus.UNPAID);
    }

    public KoszykZakupowy getKoszyk() {
        return koszyk;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }

    public void ustawStatusZamowienia(OrderStatus status) {
        this.status = status;
    }

    public boolean finalizujZamowienie() {
        if (platnosc.getStatus() == PaymentStatus.PAID) {
            status = OrderStatus.SHIPPING_READY;
            return true;
        }
        return false;
    }

    public boolean zwrocProdukt(Produkt produkt, int count) {
        if (!koszyk.getProducts().containsKey(produkt)) {
            return false;
        }
        if (count > koszyk.getProducts().get(produkt)) {
            return false;
        }
        koszyk.getProducts().put(produkt, koszyk.getProducts().get(produkt) - count);
        produkt.setIloscNaMagazynie(produkt.getIloscNaMagazynie() + count);
        return true;
    }

    @Override
    public String toString() {
        return "***" + "\n" +
                "ZAMÓWIENIE:" + "\n" +
                "Status: " + status + "\n" +
                koszyk + "\n" +
                "***" + "\n";
    }
}
