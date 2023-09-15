import java.util.ArrayList;

public class Sortowanie {
    private ArrayList<Integer> tablicaDoSortowania;

    public Sortowanie() {
        this.tablicaDoSortowania = new ArrayList<>();
    }

    public void sortowaniePrzezWstawianie(){
        for(int i =1;i<tablicaDoSortowania.size();i++){
            int wybranyElement = tablicaDoSortowania.get(i);
            int k=i-1;
            while(wybranyElement<tablicaDoSortowania.get(k)){
                tablicaDoSortowania.set(k+1,tablicaDoSortowania.get(k));
                k--;
                if(k==-1)
                    break;
            }
            tablicaDoSortowania.set(k+1,wybranyElement);

        }
    }

    public ArrayList<Integer> scalanieDwoch(ArrayList<Integer> pierwsza, ArrayList<Integer> druga) {
        ArrayList<Integer> wynikowa = new ArrayList<>();

        while (pierwsza.size() >= 1 || druga.size() >= 1) {
            System.out.println("Pierwsza"+pierwsza);
            System.out.println("Druga"+druga);
            if (pierwsza.size() == 0) {
                wynikowa.addAll(druga);
                druga.clear();
            }
            else {
                if (druga.size() == 0) {
                    wynikowa.addAll(pierwsza);
                    pierwsza.clear();
                }
                else {
                    if (pierwsza.get(0) > druga.get(0)) {
                        wynikowa.add(druga.get(0));
                        druga.remove(0);
                        System.out.println("Druga"+druga);
                    } else {
                        wynikowa.add(pierwsza.get(0));
                        pierwsza.remove(0);
                        System.out.println("Pierwsza"+pierwsza);
                    }
                }
            }
        }
        return wynikowa;
    }

    public void losuj() {
        tablicaDoSortowania = new ArrayList<>();
        //od 1 do 50 włacznie
        for (int i = 0; i < 10; i++) {
            tablicaDoSortowania.add((int) (Math.random() * 50 + 1));
        }
    }

    public ArrayList<Integer> getTablicaDoSortowania() {
        return tablicaDoSortowania;
    }
}
