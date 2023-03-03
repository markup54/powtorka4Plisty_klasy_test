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
        oceny.add(ocena);
    }
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
