package ohtu;

import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplierTest {
    @Test
    public void kertominenToimii() {
        Multiplier viisi = new Multiplier(5);
        assertEquals(5, viisi.multiply(1));
        assertEquals(25, viisi.multiply(5));
    }
}