package zestaw6;

public abstract class Owoc extends ProduktSpozywczy {

    public Owoc(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    public abstract String smak();
    public abstract void umyj();
    public abstract void zjedz();
}
