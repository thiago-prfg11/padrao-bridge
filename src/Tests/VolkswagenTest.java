package Tests;

import Classes.*;
import Interface.Proconve;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolkswagenTest {
    @Test
    void deveRetornarMediaVolkswagenEuro3() {
        Proconve proconve = new Euro3();
        Volkswagen volkswagen = new Volkswagen(3.2f);
        volkswagen.setProconve(proconve);
        assertEquals(3.84f, volkswagen.calcularMedia(), 0.01f);
    }


    @Test
    void deveRetornarMediaVolkswagenEuro5() {
        Proconve proconve = new Euro5();
        Volkswagen volkswagen = new Volkswagen(3.2f);
        volkswagen.setProconve(proconve);
        assertEquals(4.48f, volkswagen.calcularMedia(), 0.01f);
    }

    @Test
    void deveRetornarMediaVolkswagenEuro6() {
        Proconve proconve = new Euro6();
        Volkswagen volkswagen = new Volkswagen(3.2f);
        volkswagen.setProconve(proconve);
        assertEquals(5.12f, volkswagen.calcularMedia(), 0.01f);
    }
}
