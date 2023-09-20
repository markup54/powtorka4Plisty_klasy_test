public class Osoba {
    private int id;
    private String imieOsoby;
    public static int licznikKlasy =0;

    public Osoba() {
        this.id = 0;
        this.imieOsoby = "";
        licznikKlasy++;
    }

    public Osoba(int id, String imieOsoby) {
        this.id = id;
        this.imieOsoby = imieOsoby;
        licznikKlasy++;
    }
    public Osoba(Osoba osoba){
        this.id = osoba.id;
        this.imieOsoby = osoba.imieOsoby;
        licznikKlasy++;
    }
    public void wypiszImie(String inneImie){
        if(imieOsoby == "")
            System.out.println("Brak danych");
        else {
            System.out.println("Cześć " + inneImie + " mam na imię " + imieOsoby);
        }
    }
}
