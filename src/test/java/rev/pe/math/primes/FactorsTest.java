package rev.pe.math.primes;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

@Slf4j
public class FactorsTest
{
    @Test
    public void factoriseTest() {
        Factors.printFactors(16);
        Factors.printFactors(30);
        Factors.printFactors(31*43*2*7*11);
    }

    @Test
    public void eulerTotientTest() {
        Assertions.assertEquals(1, Factors.eulerTotient(1));
        Assertions.assertEquals(1, Factors.eulerTotient(2));
        Assertions.assertEquals(2, Factors.eulerTotient(3));
        Assertions.assertEquals(2, Factors.eulerTotient(4));
        Assertions.assertEquals(4, Factors.eulerTotient(10));
        Assertions.assertEquals(8, Factors.eulerTotient(15));
        Assertions.assertEquals(20, Factors.eulerTotient(25));
    }

    @Test
    public void fastEulerTotientTest() {
        Assertions.assertEquals(1, Factors.fastEulerTotient(1));
        Assertions.assertEquals(1, Factors.fastEulerTotient(2));
        Assertions.assertEquals(2, Factors.fastEulerTotient(3));
        Assertions.assertEquals(2, Factors.fastEulerTotient(4));
        Assertions.assertEquals(4, Factors.fastEulerTotient(10));
        Assertions.assertEquals(8, Factors.fastEulerTotient(15));
        Assertions.assertEquals(20, Factors.fastEulerTotient(25));
    }

    @Test
    public void compareTotientFunctions() {
        HashMap<Long,Long> totientCache = new HashMap<>();
        for (int i=1; i<1000; i++) {
            Assertions.assertEquals(Factors.eulerTotient(i), Factors.fastEulerTotient(i, totientCache));
        }
    }
}
