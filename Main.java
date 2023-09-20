public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //Osoba osoba = new Osoba('Jan',"Nowak"); // udowadniam że się nie da
        System.out.println("Liczba obiektów klasy Uczen " + Uczen.getLicznik());
        Uczen uczen = new Uczen("Jaś","Nowak");
        uczen.sprawdzObecnosc(0);
        uczen.dopiszOcene(6);
        Uczen uczen1 = new Uczen("Ewa","Kowalska");
        uczen1.dopiszOcene(5);
        System.out.println("Liczba obiektów klasy Uczen " + Uczen.getLicznik());
    }
}