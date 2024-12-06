package zestaw6;

import java.util.Optional;

public interface IAdres {

    boolean przed(Adres that);

    String getMiasto();

    void setMiasto(String miasto);

    String getKodPocztowy();

    void setKodPocztowy(String kodPocztowy);

    String getUlica();

    void setUlica(String ulica);

    int getNumerDomu();

    void setNumerDomu(int numerDomu);

    Optional<Integer> getNumerMieszkania();

    void setNumerMieszkania(int numerMieszkania);

    default void formatted() {
        if (getNumerMieszkania().isPresent()) {
            System.out.println("ul. %s %d/%d%n%s,%s".formatted(
                    getUlica(), getNumerDomu(), getNumerMieszkania().get(),
                    getKodPocztowy(), getMiasto()
            ));
        } else {
            System.out.println("ul. %s %d%n%s,%s".formatted(
                    getUlica(), getNumerDomu(),
                    getKodPocztowy(), getMiasto()
            ));

        }
    }
}
