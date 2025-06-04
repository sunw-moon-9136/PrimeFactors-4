import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    private final int input;

    public PrimeFactor(int input){
        this.input = input;
    }
    
    public List<Integer> getPrimeFactors() {
        List<Integer> ret = new ArrayList<>();
        int calcNum = input;

        for (int primeFactor = 2; primeFactor < input / 2 + 1; primeFactor++) {
            while (calcNum % primeFactor == 0) {
                calcNum /= primeFactor;
                ret.add(primeFactor);
            }
        }
        return ret;
    }
}
