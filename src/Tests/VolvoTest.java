package Tests;

import Classes.*;
import Interface.Proconve;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolvoTest {
    @Test
    void deveRetornarMediaVolvoEuro3() {
        Proconve proconve = new Euro3();
        Volvo volvo = new Volvo(3.0f);
        volvo.setProconve(proconve);
        assertEquals(3.6f, volvo.calcularMedia(), 0.01f);
    }

    @Test
    void deveRetornarMediaVolvoEuro5() {
        Proconve proconve = new Euro5();
        Volvo volvo = new Volvo(3.0f);
        volvo.setProconve(proconve);
        assertEquals(4.2f, volvo.calcularMedia(), 0.01f);
    }

    @Test
    void deveRetornarMediaVolvoEuro6() {
        Proconve proconve = new Euro6();
        Volvo volvo = new Volvo(3.0f);
        volvo.setProconve(proconve);
        assertEquals(4.8f, volvo.calcularMedia(), 0.01f);
    }
}
