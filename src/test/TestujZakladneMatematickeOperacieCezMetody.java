package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ulohy.ZakladneMatematickeOperacieCezMetody;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Testovanie základných matematických metód triedy ZakladneMatematickeOperacieCezMetody")
public class TestujZakladneMatematickeOperacieCezMetody {

    @DisplayName("Testovanie sčítania triedy ZakladneMatematickeOperacieCezMetody")
    @Test
    public void testScitanie() {
        assertEquals(15, ZakladneMatematickeOperacieCezMetody.scitanie(10, 5));
        assertEquals(13, ZakladneMatematickeOperacieCezMetody.scitanie(2, 11));
    }

    @DisplayName("Testovanie odčítania triedy ZakladneMatematickeOperacieCezMetody")
    @Test
    public void testOdcitanie() {
        assertEquals(3, ZakladneMatematickeOperacieCezMetody.odcitanie(3, 0));
        assertEquals(1, ZakladneMatematickeOperacieCezMetody.odcitanie(1.99, 0.99));
    }

    @DisplayName("Testovanie násobenia triedy ZakladneMatematickeOperacieCezMetody")
    @Test
    public void testNasobenie() {
        assertEquals(15, ZakladneMatematickeOperacieCezMetody.nasobenie(3, 5));
        assertEquals(22, ZakladneMatematickeOperacieCezMetody.nasobenie(2, 11));
    }

    @DisplayName("Testovanie delenia triedy ZakladneMatematickeOperacieCezMetody")
    @Test
    public void testDelenie() {
        assertEquals(0, ZakladneMatematickeOperacieCezMetody.delenie(0, 3));
        //assertEquals(Double.isInfinite(3/0.0), Double.isInfinite(ZakladneMatematickeOperacieCezMetody.delenie(3, 0)));
        assertTrue(Double.isInfinite(ZakladneMatematickeOperacieCezMetody.delenie(3, 0)));
    }

    @DisplayName("Testovanie modulo triedy ZakladneMatematickeOperacieCezMetody")
    @Test
    public void testModulo() {
        assertEquals(0, ZakladneMatematickeOperacieCezMetody.modulo(5, 1));
        assertEquals(1, ZakladneMatematickeOperacieCezMetody.modulo(10, 3));
    }

}
