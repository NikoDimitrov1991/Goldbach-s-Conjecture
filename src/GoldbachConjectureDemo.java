import java.util.Scanner;

public class GoldbachConjectureDemo extends SieveSundaramSolution {

        public static void main (String[] args)
        {
            int firstPrime;
            int secondPrime;
            int thirdPrime;

            Scanner sc = new Scanner(System.in);
            System.out.println("Please input the first Prime number:");
            firstPrime = sc.nextInt();

            System.out.println("Please input the second Prime number:");
            secondPrime = sc.nextInt();

            System.out.println("Please input the third Prime number:");
            thirdPrime = sc.nextInt();


            sieveSundaram();

            findPrimes(firstPrime);
            findPrimes (secondPrime);
            findPrimes(thirdPrime);
        }
}