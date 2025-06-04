import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class PrimeFactorTest {

    private PrimeFactor primeFactor;

    @Nested
    class NormalTest {
        @Test
        void getPrimeFactorsFrom35() {
            primeFactorTest(List.of(5, 7), 35);
        }

        @Test
        void getPrimeFactorsFrom72() {
            primeFactorTest(List.of(2, 2, 2, 3, 3), 72);
        }

        @Test
        void getPrimeFactorsFrom100() {
            primeFactorTest(List.of(2, 2, 5, 5), 100);
        }

        @Test
        void getPrimeFactorsFrom1() {
            primeFactorTest(List.of(), 1);
        }

        @Test
        void getPrimeFactorsFrom0() {
            primeFactorTest(List.of(), 0);
        }

        private void primeFactorTest(List<Integer> expected, int input) {
            assertEquals(expected, PrimeFactor.getPrimeFactors(input));
        }
    }

    @Nested
    class AbnormalTest {
        @Test
        void getPrimeFactorsFromMinus25() {
            assertThrowsExactly(IllegalArgumentException.class,
                    () -> PrimeFactor.getPrimeFactors(-25));
        }
    }
}