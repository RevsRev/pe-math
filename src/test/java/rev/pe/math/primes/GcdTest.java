package rev.pe.math.primes;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
public class GcdTest
{
    @Test
    public void GcdTest() {
        Assertions.assertEquals(3, Gcd.gcd(3, 9));
        Assertions.assertEquals(3, Gcd.gcd(15, 21));
        Assertions.assertEquals(24, Gcd.gcd(24, 48));
        Assertions.assertEquals(1, Gcd.gcd(7, 25));
        Assertions.assertEquals(18, Gcd.gcd(108, 90));
    }
}
