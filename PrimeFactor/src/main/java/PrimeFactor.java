import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public List<Integer> getPrimeFactors(int input) {
        List<Integer> ret = new ArrayList<>();
        int calcNum = input;

        if (input < 0) throw new IllegalArgumentException();

        for (int primeFactor = 2; primeFactor < input / 2 + 1; primeFactor++) {
            while (calcNum % primeFactor == 0) {
                calcNum /= primeFactor;
                ret.add(primeFactor);
            }
        }
        return ret;
    }
}
