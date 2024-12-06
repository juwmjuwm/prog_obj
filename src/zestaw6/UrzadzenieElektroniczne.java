package zestaw6;

public abstract class UrzadzenieElektroniczne extends ProduktPrzemyslowy {

    public UrzadzenieElektroniczne(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    public abstract boolean napraw();
    public abstract void uzyj();
    public abstract boolean zepsuj();
    public abstract boolean wlacz();
    public abstract boolean wylacz();
}
