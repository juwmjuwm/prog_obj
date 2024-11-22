package zestaw6;

import java.util.ArrayList;
import java.util.List;

public class Klient {

    private String imie;
    private String nazwisko;
    private List<Zamowienie> listaZamowien;
    private KoszykZakupowy koszyk;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        listaZamowien = new ArrayList<>();
        koszyk = new KoszykZakupowy();
    }

    public KoszykZakupowy getKoszyk() {
        return koszyk;
    }

    public void dodajZamowienie(Zamowienie zamowienie) {
        listaZamowien.add(zamowienie);
    }

    public void wyswietlHistorieZamowien() {
        System.out.println("Historia zamówień:");
        for (Zamowienie z : listaZamowien) {
            z.wyswietlZamowienie();
        }
    }

    public double obliczLacznyKosztZamowien() {
        double total = 0;
        for (Zamowienie z : listaZamowien) {
            total += z.getKoszyk().obliczCalkowitaWartosc();
        }
        return total;
    }
}
