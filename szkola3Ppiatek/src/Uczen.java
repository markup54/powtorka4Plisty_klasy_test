public class Uczen extends Osoba implements Dyzurny{
    private int nrUcznia;
    public static int liczbaUczniow;

    public Uczen(String imie, int wiek, int nrUcznia) {
        super(imie, wiek);
        //super wywołanie konstruktora klasy bazowej
        this.nrUcznia = nrUcznia;
        liczbaUczniow++;
    }

    public Uczen(String imie, int wiek) {
        super(imie, wiek);
        liczbaUczniow++;
        nrUcznia = liczbaUczniow;
    }

    @Override //adnotacja mówiąca że nadpisujemy istniejącą metodę
    public String toString() {
        return "Uczen{" +
                "nrUcznia=" + nrUcznia +
                "} " + super.toString();
        //super.toString wywołanie toString z klasy bazowej
    }

    @Override
    public void dyzuruj() {
        System.out.println("Zmazywanie tablicy");
    }
}
