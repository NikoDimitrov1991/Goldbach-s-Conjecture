import java.util.ArrayList;

public class SieveSundaramSolution {
    static int MAX = 10000;

    static ArrayList<Integer> primes = new ArrayList<>();

    static void sieveSundaram()
    {

        boolean[] marked = new boolean[MAX / 2 + 100];

        for (int i = 1; i <= (Math.sqrt(MAX) - 1) / 2; i++)
            for (int j = (i * (i + 1)) << 1; j <= MAX / 2; j = j + 2 * i + 1)
                marked[j] = true;

        primes.add(2);

        for (int i = 1; i <= MAX / 2; i++)
            if (marked[i] == false)
                primes.add(2 * i + 1);
    }

    static void findPrimes(int n)
    {
        if (n <= 2 || n % 2 != 0)
        {
            System.out.println("Invalid Input ");
            return;
        }

        for (int i = 0 ; primes.get(i) <= n / 2; i++)
        {
            int diff = n - primes.get(i);

            if (primes.contains(diff))
            {
                System.out.println(primes.get(i) +
                        " + " + diff + " = " + n);
                return;
            }
        }
    }

}
