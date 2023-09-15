import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UczenTest {
private Uczen uczen;
    @Test
    void obliczSredniaJezeliNieobecny() {
        uczen = new Uczen("Jaś","Nowak");

        uczen.dopiszOcene(4);
        uczen.dopiszOcene(5);
        uczen.dopiszOcene(4.5);
        double oczekiwana = 0;
        double otrzymana = uczen.obliczSrednia();
        assertEquals(oczekiwana,otrzymana);
        //wartosc oczekiwana jest taka jak wartosc otrzymana

    }
    @Test
    void obliczSredniaJezeliObecny() {
        uczen = new Uczen("Jaś","Nowak");
        uczen.sprawdzObecnosc(0);
        uczen.dopiszOcene(4);
        uczen.dopiszOcene(5);
        uczen.dopiszOcene(4.5);
        double oczekiwana = 4.5;
        double otrzymana = uczen.obliczSrednia();
        assertEquals(oczekiwana,otrzymana);
        //wartosc oczekiwana jest taka jak wartosc otrzymana

    }
    @Test
    void obliczSredniaJezeliObecnyWynikNieskonczony() {
        uczen = new Uczen("Jaś","Nowak");
        uczen.sprawdzObecnosc(0);
        uczen.dopiszOcene(4);
        uczen.dopiszOcene(5);
        uczen.dopiszOcene(4);
        double oczekiwana = 4.3333333;
        double otrzymana = uczen.obliczSrednia();
        assertEquals(oczekiwana,otrzymana);
        //wartosc oczekiwana jest taka jak wartosc otrzymana

    }
}