package zestaw6;

public class Koszula extends Ubranie {

    public Koszula(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    @Override
    public boolean wypierz() {
        return true;
    }

    @Override
    public boolean zaloz() {
        return true;
    }

    @Override
    public boolean wyprasuj() {
        return true;
    }

    @Override
    public boolean wysusz() {
        return true;
    }

    @Override
    public boolean zniszcz() {
        return true;
    }
}
