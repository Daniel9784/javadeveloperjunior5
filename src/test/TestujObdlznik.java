package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testovanie zakladnych metod obdlznika")
public class TestujObdlznik {

    @BeforeEach
    void setUp() {
        System.out.println("Metóda setUp sa vykoná ako prvá, ešte pred jUnit testam");
    }

    @DisplayName("Testy na vypocet obvodu")
    @Test
    public void testVypocitajObvod() {
        assertEquals(9, Obdlznik.vypocitajObvod(2, 3), "Výpočet obvodu by mal byť 10"); // Prvy argument je ocakavana hodnota, druhy metoda, ktoru volame a treti hlaska (spatna vazba) v pripade ak test nepresiel
        assertEquals(10, Obdlznik.vypocitajObvod(1.5, 3.5));
        assertEquals(2, Obdlznik.vypocitajObvod(0.9, 0.1));
    }

    @DisplayName("Testy na vypocet obsahu")
    @Test
    public void testVypocitajObsah() {
        assertEquals(20, Obdlznik.vypocitajObsah(2, 10));
        assertEquals(8, Obdlznik.vypocitajObsah(2, 4));
    }
}
