import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorTest {

    @Test
    void getPrimeFactorsFrom35() {
        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> expected = List.of(5,7);

        List<Integer> ret = primeFactor.getPrimeFactors(35);

        assertEquals(expected, ret);
    }
}