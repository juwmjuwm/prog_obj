//import zestaw6.*;
//
//import java.util.List;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Produkt baklazan = new Produkt("Bakłażan", 9.99, 623);
//        Produkt piano = new Produkt("Pianino", 194999.99, 27);
//        Produkt jablko = new Produkt("Jabłko", 5, 900);
////        baklazan.wyswietlInformacje();
////        piano.wyswietlInformacje();
////        piano.usunZMagazynu(28);
////        piano.wyswietlInformacje();
////        piano.usunZMagazynu(27);
////        piano.wyswietlInformacje();
////        baklazan.dodajDoMagazynu(1000);
////        baklazan.wyswietlInformacje();
//
//        KoszykZakupowy koszyk = new KoszykZakupowy();
//        koszyk.dodajProdukt(baklazan, 1);
//        koszyk.dodajProdukt(piano, 3);
//        koszyk.dodajProdukt(baklazan, 50);
//        koszyk.dodajProdukt(piano, 100);
//        koszyk.toString();
//
//        System.out.println(piano.getIloscNaMagazynie());
//        System.out.println(baklazan.getIloscNaMagazynie());
//        System.out.println(koszyk.obliczCalkowitaWartosc());
//
//        Zamowienie zamowienie = new Zamowienie(koszyk, OrderStatus.PLACED);
//        zamowienie.ustawStatusZamowienia(OrderStatus.CONFIRMED);
//        zamowienie.toString();
//
//        System.out.println("\nKLIENT");
//
//        KoszykZakupowy koszyk2 = new KoszykZakupowy();
//        koszyk2.dodajProdukt(jablko, 3);
//        Zamowienie zamowienie2 = new Zamowienie(koszyk2, OrderStatus.SHIPPED);
//        Klient klient = new Klient("Mark", "Pankov");
//        klient.dodajZamowienie(zamowienie);
//        klient.dodajZamowienie(zamowienie2);
//        klient.toString();
//        System.out.println(klient.obliczLacznyKosztZamowien());
//
//        System.out.println("\nSKLEP");
//        ISklep sklep = new Sklep();
//        sklep.dodajProdukt(baklazan);
//        sklep.dodajProdukt(jablko);
////        System.out.println(sklep.wyszukajProdukt("Jabłko").get().getNazwa());
//        sklep.zakupy("Jabłko", klient);
//        sklep.wyswietlOferty();
//
//        System.out.println("\n PŁATNOŚĆ");
//        System.out.printf("%s %s%n", zamowienie.getStatus(), zamowienie.getPlatnosc().getStatus());
//        zamowienie.finalizujZamowienie();
//        System.out.printf("%s %s%n", zamowienie.getStatus(), zamowienie.getPlatnosc().getStatus());
//        zamowienie.getPlatnosc().zaplac();
//        System.out.printf("%s %s%n", zamowienie.getStatus(), zamowienie.getPlatnosc().getStatus());
//        zamowienie.finalizujZamowienie();
//        System.out.printf("%s %s%n", zamowienie.getStatus(), zamowienie.getPlatnosc().getStatus());
//        zamowienie.zwrocProdukt(baklazan, 30);
//        zamowienie.zwrocProdukt(baklazan, 3000);
//        zamowienie.toString();
//
//        Magazyn magazyn = new Magazyn(List.of(jablko, baklazan));
//        System.out.println(magazyn);
//
//        // ZESTAW 8
//        Jablko szampion = new Jablko("jabłko szampion", 6.99, 678);
//        System.out.println(szampion);
//        Koszula koszula = new Koszula("koszula w kratę", 189.99, 129);
//        System.out.println(koszula);
//
//        sklep.dodajProdukt(szampion);
//        sklep.dodajProdukt(koszula);
//        sklep.wyswietlOferty();
//    }
//
//    private static void separate(int n) {
//        System.out.println("*".repeat(10));
//        System.out.printf("ZADANIE %d%n", n);
//        System.out.println("*".repeat(10));
//    }
//
//    private static void kolokwium1() {
//        separate(1);
//
//        System.out.println(Kolokwium1.dokladnosc(5.402, 5.4, 2));
//        System.out.println(Kolokwium1.dokladnosc(5.402, 5.4, 3));
//        System.out.println(Kolokwium1.dokladnosc(5.4, 5.402, 3));
//
//        separate(2);
//
//        System.out.println(Kolokwium1.najblizszySasiad(31));
//        System.out.println(Kolokwium1.najblizszySasiad(30));
//        System.out.println(Kolokwium1.najblizszySasiad(20));
//
//        separate(3);
//
//        System.out.println(Kolokwium1.pierwiastek(25, 2, 1));
//        System.out.println(Kolokwium1.pierwiastek(25, 2, 2));
//        System.out.println(Kolokwium1.pierwiastek(27, 3, 2));
//        System.out.println(Kolokwium1.pierwiastek(0.2, 2, 9));
//
//        separate(4);
//
//        int[] tab4_1 = {5, 1};
//        int[] tab4_2 = {5, 1, 0, 5, 7, 6, 3, 2, 6};
//        int[] tab4_3 = {5, 7};
//        System.out.println(Kolokwium1.podciag(tab4_1));
//        System.out.println(Kolokwium1.podciag(tab4_2));
//        System.out.println(Kolokwium1.podciag(tab4_3));
//
//        separate(5);
//
//        int[] tab5_1 = {5, 1, -3};
//        int[] tab5_2 = {5, 1, 0, 5, 7, 5, 3, 1, 6};
//        int[] tab5_3 = {5, 7};
//        System.out.println(Kolokwium1.podciag(tab5_1, 4));
//        System.out.println(Kolokwium1.podciag(tab5_2, 2));
//        System.out.println(Kolokwium1.podciag(tab5_3, 2));
//
//        separate(6);
//
//        System.out.println(Kolokwium1.czyPalindrom(4884));
//        System.out.println(Kolokwium1.czyPalindrom(14941));
//        System.out.println(Kolokwium1.czyPalindrom(7));
//        System.out.println(Kolokwium1.czyPalindrom(78));
//        System.out.println(Kolokwium1.czyPalindrom(922));
//        System.out.println(Kolokwium1.czyPalindrom(100));
//
//        separate(7);
//
//        Kolokwium1.palindromLiczbowy(1);
//        Kolokwium1.palindromLiczbowy(2);
//    }
//}
