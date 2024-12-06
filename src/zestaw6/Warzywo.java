package zestaw6;

public abstract class Warzywo extends ProduktSpozywczy {

    public Warzywo(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    public abstract String smak();
    public abstract void umyj();
    public abstract void zjedz();
}
