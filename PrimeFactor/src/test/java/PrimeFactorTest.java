import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class PrimeFactorTest {

    private PrimeFactor primeFactor;

    @BeforeEach
    void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    void getPrimeFactorsFrom35() {
        List<Integer> expected = List.of(5, 7);

        assertEquals(expected, primeFactor.getPrimeFactors(35));
    }

    @Test
    void getPrimeFactorsFrom72() {
        List<Integer> expected = List.of(2, 2, 2, 3, 3);

        assertEquals(expected, primeFactor.getPrimeFactors(72));
    }

    @Test
    void getPrimeFactorsFrom100() {
        List<Integer> expected = List.of(2, 2, 5, 5);

        assertEquals(expected, primeFactor.getPrimeFactors(100));
    }

    @Test
    void getPrimeFactorsFrom1() {
        List<Integer> expected = List.of();

        assertEquals(expected, primeFactor.getPrimeFactors(1));
    }

    @Test
    void getPrimeFactorsFrom0() {
        List<Integer> expected = List.of();

        assertEquals(expected, primeFactor.getPrimeFactors(0));
    }

    @Test
    void getPrimeFactorsFromMinus25() {
        List<Integer> expected = List.of();

        assertThrowsExactly(IllegalArgumentException.class, () -> primeFactor.getPrimeFactors(-25));
    }
}