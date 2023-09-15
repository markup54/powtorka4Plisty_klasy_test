public final class Wychowawca extends Nauczyciel{
    private Klasa klasa;

    public Wychowawca(String imie, int wiek, Klasa klasa, String... przedmioty) {
        super(imie, wiek, przedmioty);
        this.klasa = klasa;
    }
}
