package rev.pe.math.primes;

public class Gcd
{
    public static long gcd(long a, long b) {
        if (a < b) {
            long c = a;
            a = b;
            b = c;
        }

        long rem = a % b;
        while (rem != 0) {
            a = b;
            b = rem;
            rem = a % b;
        }
        return b;
    }

}
