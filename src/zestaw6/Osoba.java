package zestaw6;

public class Osoba {

    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setImie(String imie) {
        if (imie == null) {
            throw new IllegalArgumentException();
        }
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko == null) {
            throw new IllegalArgumentException();
        }
        this.nazwisko = nazwisko;
    }
}
