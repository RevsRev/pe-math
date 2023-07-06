package rev.pe.math.primes;

import org.junit.jupiter.api.Test;

public class FactorsTest
{
    @Test
    public void factoriseTest() {
        Factors.printFactors(16);
        Factors.printFactors(30);
        Factors.printFactors(31*43*2*7*11);
    }
}
