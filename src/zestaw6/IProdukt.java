package zestaw6;

public interface IProdukt {

    String getNazwa();

    double getCena();

    int getIloscNaMagazynie();

    void setNazwa(String nazwa);

    void setCena(double cena);

    void setIloscNaMagazynie(int iloscNaMagazynie);

    void wyswietlInformacje();

    boolean dodajDoMagazynu(int count);

    boolean usunZMagazynu(int count);

    default void convertCurrency(double exchangeRate) {
        setCena(getCena() * exchangeRate);
    }
}
