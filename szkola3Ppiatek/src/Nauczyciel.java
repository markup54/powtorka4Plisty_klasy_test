import java.util.ArrayList;

public sealed class Nauczyciel extends Osoba permits Wychowawca{
    private ArrayList<String> przedmioty = new ArrayList<>();

    public Nauczyciel(String imie, int wiek ,String przedmiot) {
        super(imie, wiek);
        przedmioty.add(przedmiot);
    }

    public Nauczyciel(String imie, int wiek, String ...przedmioty) {
        super(imie, wiek);
        for (String przedmiot:
             przedmioty) {
            this.przedmioty.add(przedmiot);
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Nauczyciel{" +
                "przedmioty=" + przedmioty +
                "} " ;
    }
}
