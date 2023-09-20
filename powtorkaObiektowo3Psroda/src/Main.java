import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Liczba zarejestrowanych osób "+Osoba.licznikKlasy);
        Osoba osoba =new Osoba();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj id osoby");
        int id =klawiatura.nextInt();
        System.out.println("Podaj imię osoby");
        String imie = klawiatura.next();
        Osoba osoba1 = new Osoba(id,imie);
        Osoba osoba2 = new Osoba(osoba1);
        osoba.wypiszImie("Jan");
        osoba1.wypiszImie("Jan");
        osoba2.wypiszImie("Jan");
        System.out.println("Liczba zarejestrowanych osób "+Osoba.licznikKlasy);
    }
}