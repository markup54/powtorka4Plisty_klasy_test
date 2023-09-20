import java.util.ArrayList;

public class Uczen extends Osoba{
    private Obecnosc obecnosc;
    private static int licznik = 0;
    private ArrayList<Double> oceny;

    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        this.oceny = new ArrayList<>();
        licznik++;
    }

    public Obecnosc getObecnosc() {
        return obecnosc;
    }

    public void setObecnosc(Obecnosc obecnosc) {
        this.obecnosc = obecnosc;
    }

    public static int getLicznik() {
        return licznik;
    }

    public ArrayList<Double> getOceny() {
        return oceny;
    }

    public void sprawdzObecnosc(int o){
        switch (o){
            case 0:
                obecnosc = Obecnosc.OBECNY;
                break;
            case 1:
                obecnosc = Obecnosc.NIEOBECNY;
                break;
            case 2:
                obecnosc = Obecnosc.SPOZNIONY;
                break;
        }
    }
    public void dopiszOcene (double ocena){
        //System.out.println(obecnosc);
        if(obecnosc == Obecnosc.OBECNY || obecnosc == Obecnosc.SPOZNIONY) {
            oceny.add(ocena);
        }
        else{
            System.out.println("Nie można dopisać oceny nieobecnemu");
        }
    }

    /**
     * nazwa funkcji obliczSrednia
     * zastosowanie metoda słyży do obliczania średniej ocen dla danego obiektu
     * Oceny powinny być zapisane ww własności oceny
     * argumenty brak
     * zwracana wartośc średnia ocen typu rzeczywistego obliczona dla wszystkich ocen
     */
    public double obliczSrednia(){
        double s = 0;
        for(double ocena: oceny){
            s = s+ocena;
        }
        if (oceny.size()>0)
            return s/ oceny.size();
        return 0;
    }
}
