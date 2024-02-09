package TDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MathLibraryTest {
    private MathLibrary math;

    @BeforeEach
    public void setUp() {
        math = new MathLibrary();
    }

    @Test
    @DisplayName("Sum 2 positive ints with add() method")
    public void add_twoPositiveInts_Summed() {
        assertEquals(2, math.add(1, 1));
        assertEquals(18, math.add(3, 15));
    }

    @Test
    @DisplayName("Sum 2 negatives ints with add() method")
    public void add_twoNegativeInts_Summed() {
        assertEquals(-2, math.add(-1, -1));
        assertEquals(-18, math.add(-3, -15));
    }

    @Test
    @DisplayName("Sum a List of positive ints with sumList() method")
    void sumList_arrListPositiveInts_Summed() {
        assertEquals(5, math.sumList(Arrays.asList(1,1,1,1,1)));
        assertEquals(15, math.sumList(Arrays.asList(1,2,3,4,5)));
    }

    @Test
    @DisplayName("Sum a List of negative ints with sumList() method")
    void sumList_arrListNegativeInts_Summed() {
        assertEquals(-5, math.sumList(Arrays.asList(-1,-1,-1,-1,-1)));
        assertEquals(-15, math.sumList(Arrays.asList(-1,-2,-3,-4,-5)));
    }
    @Test
    @DisplayName("Sum a List of positive & negative ints with sumList() method")
    void sumList_arrListPositiveAndNegativeInts_Summed() {
        assertEquals(1, math.sumList(Arrays.asList(1,-1,1,-1,1)));
        assertEquals(-5, math.sumList(Arrays.asList(-10,2,3,5,-5)));
    }
}