import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tablica wylosowana");

        Sortowanie sortowanie = new Sortowanie();
        sortowanie.losuj();
        System.out.println(sortowanie.getTablicaDoSortowania());
        ArrayList<Integer> p =new ArrayList<Integer>();
        p.add(15);
        p.add(17);
        p.add(20);
        p.add(30);
        ArrayList<Integer> d =new ArrayList<Integer>();
        d.add(8);
        d.add(19);

        System.out.println(sortowanie.scalanieDwoch(p,d));
        sortowanie.losuj();
        System.out.println(sortowanie.getTablicaDoSortowania());
        sortowanie.sortowaniePrzezWstawianie();
        System.out.println(sortowanie.getTablicaDoSortowania());
    }
}