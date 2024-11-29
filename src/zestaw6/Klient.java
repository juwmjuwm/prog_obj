package zestaw6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klient {

    private String imie;
    private String nazwisko;
    private Adres adres;
    private List<Zamowienie> listaZamowien;
    private KoszykZakupowy koszyk;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        listaZamowien = new ArrayList<>();
        koszyk = new KoszykZakupowy();
    }

    public Klient(String imie, String nazwisko, Adres adres) {
        this(imie, nazwisko);
        this.adres = adres;
    }

    public KoszykZakupowy getKoszyk() {
        return koszyk;
    }

    public Adres getAdres() {
        return adres;
    }

    public void dodajZamowienie(Zamowienie zamowienie) {
        listaZamowien.add(zamowienie);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Historia zamówień:\n");
        for (Zamowienie z : listaZamowien) {
            sb.append(z);
        }
        return sb.toString();
    }

    public double obliczLacznyKosztZamowien() {
        double total = 0;
        for (Zamowienie z : listaZamowien) {
            total += z.getKoszyk().obliczCalkowitaWartosc();
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klient klient = (Klient) o;
        return Objects.equals(imie, klient.imie) && Objects.equals(nazwisko, klient.nazwisko) && Objects.equals(adres, klient.adres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, adres);
    }
}
