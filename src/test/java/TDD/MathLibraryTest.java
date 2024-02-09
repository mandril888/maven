package TDD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathLibraryTest {

    @Test
    public void add_twoPositiveInts_Summed() {
        MathLibrary math = new MathLibrary();
        assertEquals(2, math.add(1, 1));
        assertEquals(18, math.add(3, 15));
    }

    @Test
    public void add_twoNegativeInts_Summed() {
        MathLibrary math = new MathLibrary();
        assertEquals(-2, math.add(-1, -1));
        assertEquals(-18, math.add(-3, -15));
    }
}