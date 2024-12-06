package zestaw6;

public class Klawiatura extends UrzadzenieElektroniczne {

    public Klawiatura(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    @Override
    public boolean napraw() {
        return true;
    }

    @Override
    public void uzyj() { }

    @Override
    public boolean zepsuj() {
        return true;
    }

    @Override
    public boolean wlacz() {
        return true;
    }

    @Override
    public boolean wylacz() {
        return true;
    }
}
