import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> getPrimeFactors(int num) {
        List<Integer> ret = new ArrayList<>();
        int x = num;

        for (int i = 2; i < num / 2 + 1; i++) {
            while (x % i == 0) {
                x /= i;
                ret.add(i);
            }
        }
        return ret;
    }
}
