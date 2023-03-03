import java.util.ArrayList;

public class Uczen extends Osoba{
    private Obecnosc obecnosc;
    private static int licznik = 0;
    private ArrayList<Double> oceny;

    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        this.oceny = new ArrayList<>();
    }
}
