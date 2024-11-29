package zestaw6;

import java.util.Optional;

public class Adres {

    private String miasto;
    private String kodPocztowy;
    private String ulica;
    private int numerDomu;
    private Integer numerMieszkania;

    public Adres(String miasto, String kodPocztowy, String ulica, int numerDomu, Integer numerMieszkania) {
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if (miasto == null) {
            throw new IllegalArgumentException();
        }
        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if (kodPocztowy == null) {
            throw new IllegalArgumentException();
        }
        this.kodPocztowy = kodPocztowy;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        if (ulica == null) {
            throw new IllegalArgumentException();
        }
        this.ulica = ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
    }

    public Optional<Integer> getNumerMieszkania() {
        return Optional.ofNullable(numerMieszkania);
    }

    public void setNumerMieszkania(int numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }

    public Adres(String miasto, String kodPocztowy, String ulica, int numerDomu) {
        this(miasto, kodPocztowy, ulica, numerDomu, null);
    }

    @Override
    public String toString() {
        if (numerMieszkania != null) {
            return String.format("%s, %s%n%s %d/%d", kodPocztowy, miasto, ulica, numerDomu, numerMieszkania);
        } else {
            return String.format("%s, %s%n%s %d", kodPocztowy, miasto, ulica, numerDomu);
        }
    }

    public boolean przed(Adres that) {
        return this.kodPocztowy.compareTo(that.kodPocztowy) < 0;
    }
}
