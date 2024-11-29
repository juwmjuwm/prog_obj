package zestaw6;

import java.util.Objects;

public class Produkt {

    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInformacje() {
        String info = String.format("Produkt: nazwa=%s, cena=%.2f, ilosc=%d", nazwa, cena, iloscNaMagazynie);
        System.out.println(info);
    }

    public boolean dodajDoMagazynu(int count) {
        if (count <= 0) {
            return false;
        }
        iloscNaMagazynie += count;
        return true;
    }

    public boolean usunZMagazynu(int count) {
        if (count <= 0 || count > iloscNaMagazynie) {
            return false;
        }
        iloscNaMagazynie -= count;
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Double.compare(cena, produkt.cena) == 0 &&
                Objects.equals(nazwa, produkt.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena);
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", iloscNaMagazynie=" + iloscNaMagazynie +
                '}';
    }
}
