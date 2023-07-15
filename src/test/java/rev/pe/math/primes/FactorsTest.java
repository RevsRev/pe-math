package rev.pe.math.primes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertEquals(20, Factors.eulerTotient(25));
    }
}
