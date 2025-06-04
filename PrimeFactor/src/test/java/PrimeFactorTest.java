import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorTest {

    @Test
    void getPrimeFactorsFrom35() {
        PrimeFactor primeFactor = new PrimeFactor(35);
        List<Integer> expected = List.of(5, 7);

        List<Integer> ret = primeFactor.getPrimeFactors();

        assertEquals(expected, ret);
    }

    @Test
    void getPrimeFactorsFrom72() {
        PrimeFactor primeFactor = new PrimeFactor(72);
        List<Integer> expected = List.of(2, 2, 2, 3, 3);

        List<Integer> ret = primeFactor.getPrimeFactors();

        assertEquals(expected, ret);
    }

    @Test
    void getPrimeFactorsFrom100() {
        PrimeFactor primeFactor = new PrimeFactor(100);
        List<Integer> expected = List.of(2, 2, 5, 5);

        List<Integer> ret = primeFactor.getPrimeFactors();

        assertEquals(expected, ret);
    }
}