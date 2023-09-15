public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Osoba osoba = new Osoba();
        osoba.setImie("Jaś");
        osoba.setWiek(-12);
        System.out.println(osoba.getImie());
        System.out.println(osoba.getWiek());
        Uczen uczen = new Uczen("Bożydar",7,1235);
        System.out.println(uczen);
        System.out.println("liczba uczniów"+Uczen.liczbaUczniow);
        Uczen uczen1 = new Uczen("Eugenia",7);
        System.out.println(uczen1);
        System.out.println("liczba uczniów"+Uczen.liczbaUczniow);
        Uczen uczen2 = new Uczen("Zygrfyd",7);
        System.out.println(uczen2);
        System.out.println("liczba uczniów"+Uczen.liczbaUczniow);
        Nauczyciel nauczyciel = new Nauczyciel("Vincent",30,"wf","matematyka");
        System.out.println(nauczyciel);
        Nauczyciel nauczyciel1 = new Nauczyciel("Franciszek",25,"język chiński");
        System.out.println(nauczyciel1);
        Klasa klasa2p = new Klasa("klasaP",uczen,uczen1,uczen2);
        Uczen uczen3 = new Uczen("Edek",8);
        Klasa klasa3p = new Klasa(klasa2p);
        Klasa klasa4p = klasa2p;
        klasa2p.dodajUczniaDoKlasy(uczen3);
        System.out.println(klasa2p);
        System.out.println(klasa3p);
        System.out.println(klasa4p);
        Nauczyciel wychowawca = new Wychowawca("Krystyna",60,klasa3p,"język polski");
        System.out.println(wychowawca);
        wychowawca.dyzuruj();
        uczen2.dyzuruj();
    }
}