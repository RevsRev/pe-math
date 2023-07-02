package rev.pe.math.primes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeCheckTest
{
    @Test
    public void primeCheckTest() {
        Assertions.assertEquals(true, PrimeCheck.primeCheck(2));
        Assertions.assertEquals(true, PrimeCheck.primeCheck(3));
        Assertions.assertEquals(true, PrimeCheck.primeCheck(11));
        Assertions.assertEquals(true, PrimeCheck.primeCheck(31));
        Assertions.assertEquals(true, PrimeCheck.primeCheck(7919));

        Assertions.assertEquals(false, PrimeCheck.primeCheck(4));
        Assertions.assertEquals(false, PrimeCheck.primeCheck(999));
        Assertions.assertEquals(false, PrimeCheck.primeCheck(7919*101));
        Assertions.assertEquals(false, PrimeCheck.primeCheck(8191*8209));
    }
}
