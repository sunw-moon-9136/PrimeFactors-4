import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorTest {

    @Test
    void getPrimeFactorsFrom35() {
        PrimeFactor primeFactor = new PrimeFactor(35);
        List<Integer> expected = List.of(5, 7);

        assertEquals(expected, primeFactor.getPrimeFactors());
    }

    @Test
    void getPrimeFactorsFrom72() {
        PrimeFactor primeFactor = new PrimeFactor(72);
        List<Integer> expected = List.of(2, 2, 2, 3, 3);

        assertEquals(expected, primeFactor.getPrimeFactors());
    }

    @Test
    void getPrimeFactorsFrom100() {
        PrimeFactor primeFactor = new PrimeFactor(100);
        List<Integer> expected = List.of(2, 2, 5, 5);

        assertEquals(expected, primeFactor.getPrimeFactors());
    }

    @Test
    void getPrimeFactorsFrom1() {
        PrimeFactor primeFactor = new PrimeFactor(1);
        List<Integer> expected = List.of();

        assertEquals(expected, primeFactor.getPrimeFactors());
    }

    @Test
    void getPrimeFactorsFrom0() {
        PrimeFactor primeFactor = new PrimeFactor(1);
        List<Integer> expected = List.of();

        assertEquals(expected, primeFactor.getPrimeFactors());
    }
}