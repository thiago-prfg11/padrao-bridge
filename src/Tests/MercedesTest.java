package Tests;

import Classes.Euro5;
import Classes.Euro6;
import Classes.Mercedes;
import Classes.Euro3;
import Interface.Proconve;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MercedesTest {

    @Test
    void deveRetornarMediaMercedesEuro3() {
        Proconve proconve = new Euro3();
        Mercedes mercedes = new Mercedes(3.4f);
        mercedes.setProconve(proconve);
        assertEquals(4.08f, mercedes.calcularMedia(), 0.01f);
    }

    @Test
    void deveRetornarMediaMercedesEuro5() {
        Proconve proconve = new Euro5();
        Mercedes mercedes = new Mercedes(3.4f);
        mercedes.setProconve(proconve);
        assertEquals(4.76f, mercedes.calcularMedia(), 0.01f);
    }

    @Test
    void deveRetornarMediaMercedesEuro6() {
        Proconve proconve = new Euro6();
        Mercedes mercedes = new Mercedes(3.4f);
        mercedes.setProconve(proconve);
        assertEquals(5.44f, mercedes.calcularMedia(), 0.01f);
    }
}
