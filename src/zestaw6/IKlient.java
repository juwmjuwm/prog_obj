package zestaw6;

import java.util.List;
import java.util.Optional;

public interface IKlient {

    KoszykZakupowy getKoszyk();
    Optional<Adres> getAdres();
    String getImie();
    String getNazwisko();
    List<Zamowienie> getListaZamowien();
    void setImie(String imie);
    void setNazwisko(String nazwisko);
    void setAdres(Adres adres);
    void setListaZamowien(List<Zamowienie> listaZamowien);
    void setKoszyk(KoszykZakupowy koszyk);
    void dodajZamowienie(Zamowienie zamowienie);

    default String getFullName() {
        return getImie() + " " + getNazwisko();
    }
}
