package rev.pe.math.primes;

import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;
import java.util.LinkedHashSet;

@Slf4j
public class SieveOfEratosthenesTest
{
    //@Test
    public void sieveOfEratosthenesTest() {
        LinkedHashSet<Long> primes = SieveOfEratosthenes.sieveOfEratosthenes(10000);
        Iterator itPrimes = primes.iterator();
        while (itPrimes.hasNext()) {
            log.info("" + itPrimes.next());
        }
    }
}
