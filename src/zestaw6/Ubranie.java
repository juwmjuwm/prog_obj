package zestaw6;

public abstract class Ubranie extends ProduktPrzemyslowy {

    public Ubranie(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    public abstract boolean wypierz();
    public abstract boolean zaloz();
    public abstract boolean wyprasuj();
    public abstract boolean wysusz();
    public abstract boolean zniszcz();
}
