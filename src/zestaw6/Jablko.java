package zestaw6;

public class Jablko extends Owoc {

    public Jablko(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    @Override
    public String smak() {
        return "kwaśny";
    }

    @Override
    public void umyj() { }

    @Override
    public void zjedz() { }
}
