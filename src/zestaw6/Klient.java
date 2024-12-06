package zestaw6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Klient extends Osoba implements IKlient {

    private Adres adres;
    private List<Zamowienie> listaZamowien;
    private KoszykZakupowy koszyk;

    public Klient(String imie, String nazwisko) {
        super(imie, nazwisko);
        listaZamowien = new ArrayList<>();
        koszyk = new KoszykZakupowy();
        adres = null;
    }

    public Klient(String imie, String nazwisko, Adres adres) {
        this(imie, nazwisko);
        this.adres = adres;
    }

    public KoszykZakupowy getKoszyk() {
        return koszyk;
    }

    public Optional<Adres> getAdres() {
        return Optional.ofNullable(adres);
    }

    public List<Zamowienie> getListaZamowien() {
        return listaZamowien;
    }

    public void setAdres(Adres adres) {
        if (adres == null) {
            throw new IllegalArgumentException();
        }
        this.adres = adres;
    }

    public void setListaZamowien(List<Zamowienie> listaZamowien) {
        if (listaZamowien == null || listaZamowien.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.listaZamowien = listaZamowien;
    }

    public void setKoszyk(KoszykZakupowy koszyk) {
        if (koszyk == null) {
            throw new IllegalArgumentException();
        }
        this.koszyk = koszyk;
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
        return Objects.equals(getImie(), klient.getImie()) &&
                Objects.equals(getNazwisko(), klient.getNazwisko()) &&
                Objects.equals(adres, klient.adres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getImie(), getNazwisko(), adres);
    }
}
