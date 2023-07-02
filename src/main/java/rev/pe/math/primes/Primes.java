package rev.pe.math.primes;

import java.util.LinkedHashSet;

public class Primes
{

    private static final long PRIME_CACHE_SIZE = 10000;
    private static LinkedHashSet<Long> primeCache = SieveOfEratosthenes.sieveOfEratosthenes(PRIME_CACHE_SIZE);


}
