public class Uczen extends Osoba{
    private int nrUcznia;

    public Uczen(String imie, int wiek, int nrUcznia) {
        super(imie, wiek);
        //super wywołanie konstruktora klasy bazowej
        this.nrUcznia = nrUcznia;
    }

    @Override //adnotacja mówiąca że nadpisujemy istniejącą metodę
    public String toString() {
        return "Uczen{" +
                "nrUcznia=" + nrUcznia +
                "} " + super.toString();
        //super.toString wywołanie toString z klasy bazowej
    }
}
