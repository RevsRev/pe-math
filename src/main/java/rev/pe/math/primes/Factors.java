package rev.pe.math.primes;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

@Slf4j
public class Factors
{
    public static LinkedHashMap<Long,Long> factorise(long n) {
        LinkedHashSet<Long> cachedPrimes = PrimeCheck.primeCache;
        long largestCachedPrime = 2;
        LinkedHashMap<Long,Long> factors = new LinkedHashMap<>();

        long reducedN=n;

        Iterator<Long> it = cachedPrimes.iterator();
        while (it.hasNext()) {
            long prime = it.next();
            while (reducedN % prime == 0) {
                if (!factors.containsKey(prime)) {
                    factors.put(prime, (long)0);
                }
                factors.put(prime, factors.get(prime) + 1);
                reducedN = reducedN/prime;
            }
            largestCachedPrime = prime;
        }

        if (largestCachedPrime == 2) {
            while (reducedN % 2 == 0) {
                if (!factors.containsKey((long)2)) {
                    factors.put((long)2, (long)0);
                }
                factors.put((long)2, factors.get(2) + 1);
                reducedN = reducedN/2;
            }
            largestCachedPrime = 3;
        }

        long factorToCheck = largestCachedPrime;
        while (reducedN != 1) {
            while (reducedN % factorToCheck == 0) {
                if (!factors.containsKey(factorToCheck)) {
                    factors.put(factorToCheck, (long)0);
                }
                factors.put(factorToCheck, factors.get(factorToCheck) + 1);
                reducedN = reducedN/factorToCheck;
            }
            factorToCheck += 2;
        }

        return factors;
    }

    public static void printFactors(long n) {
        HashMap<Long, Long> factors = factorise(n);
        StringBuilder sb = new StringBuilder();
        Iterator<Long> itFactors = factors.keySet().iterator();
        while (itFactors.hasNext()) {
            long prime = itFactors.next();
            long pow = factors.get(prime);
            sb.append(prime + "^" + pow);
            if (itFactors.hasNext()) {
                sb.append(" * ");
            }
        }
        log.info(sb.toString());
    }
}
