package zestaw6;

public class Kalafior extends Warzywo {

    public Kalafior(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    @Override
    public String smak() {
        return "maślany";
    }

    @Override
    public void umyj() { }

    @Override
    public void zjedz() { }
}
