package mathematics;

import java.util.Random;

public class CheckForPrime {
    private static long startTime = 0l;
    private static long stopTime = 0l;
    public static void main(String[] args) {
        Integer number = new Random().nextInt(1, 1000);
        System.out.println("Checking Prime for number: "+number);
        String isPrime = checkForPrimeIterative(number)? "prime": "not prime";
        stopTime = System.nanoTime();
        System.out.println("Number: "+number+" is "+isPrime+", time: "+(stopTime-startTime));

        String isPrime2 = checkForPrimeWithSquareRootComplexity(number)? "prime": "not prime";
        stopTime = System.nanoTime();
        System.out.println("Number: "+number+" is "+isPrime2+", time: "+(stopTime-startTime));

        String isPrime3 = checkForPrimeMostEfficient(number)? "prime": "not prime";
        stopTime = System.nanoTime();
        System.out.println("Number: "+number+" is "+isPrime3+", time: "+(stopTime-startTime));
    }

    private static boolean checkForPrimeMostEfficient(Integer number) {
        startTime = System.nanoTime();
        if (number == 1) return false;
        if (number == 2 || number == 3) return true;
        if (number%2 == 0 || number%3 == 0) return false;
        for (int i = 5; i*i <=number; i+=6) {
            if (number%i == 0 || number%(i+2) == 0) return false;
        }
        return true;
    }

    private static boolean checkForPrimeWithSquareRootComplexity(Integer number) {
        startTime = System.nanoTime();
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number%i==0)return false;
        }
        return true;
    }

    private static boolean checkForPrimeIterative(Integer number) {
        startTime = System.nanoTime();
        for (int i = 2; i < number; i++) {
            if (number%i==0)return false;
        }
        return true;
    }
}
