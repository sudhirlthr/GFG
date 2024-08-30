package mathematics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeFactor {

    static long startTime = 0l;
    static long endTime = 0l;
    public static void main(String[] args) {
        Integer number = new Random().nextInt(450, 451);
        System.out.println("Prime factors for number: "+number+" are:");
        List<Integer> allPrimeFactorsIterative = findAllPrimeFactorsIterative(number);
        System.out.println("time took for findAllPrimeFactorsIterative: "+(endTime-startTime));
        allPrimeFactorsIterative.forEach(System.out::println);

        System.out.println("For 2nd");
        List<Integer> allPrimeFactorsIterative2 = findAllPrimeFactorsIterative2(number);
        System.out.println("time took for allPrimeFactorsIterative2: "+(endTime-startTime));
        allPrimeFactorsIterative2.forEach(System.out::println);

        System.out.println("For most efficient");
        List<Integer> allPrimeFactorsMostEfficient = findAllPrimeFactorsMostEfficient(number);
        System.out.println("time took for allPrimeFactorsMostEfficient: "+(endTime-startTime));
        allPrimeFactorsMostEfficient.forEach(System.out::println);
    }

    private static List<Integer> findAllPrimeFactorsMostEfficient(Integer number){
        startTime = System.nanoTime();
        List<Integer> result = new ArrayList<>();
        if (number <= 1)return result;
        while (number%2 == 0){
            result.add(2);
            number /=2;
        }
        while (number%3 == 0){
            result.add(3);
            number /=3;
        }
        for (int i = 5; i*i <=number ; i+=6) {
            while (number%i == 0){
                result.add(i);
                number /= i;
            }
            while (number%(i+2)==0){
                result.add(i+2);
                number = number/(i+2);
            }
        }
        if (number>3) result.add(number);
        endTime = System.nanoTime();
        return result;
    }

    private static List<Integer> findAllPrimeFactors(Integer number) {
        List<Integer> list = new ArrayList<>();
        if (number == 1) return list;
        if (number%2 == 0 || number%3 == 0) list.add(number);
        else{
            for (int i = 5; i*i <= number ; i+=6) {

            }
        }
        return list;
    }

    private static List<Integer> findAllPrimeFactorsIterative(Integer number) {
        startTime = System.nanoTime();
        List<Integer> list = new ArrayList<>();
        if (number <= 1) return list;
        else{
            for (int i = 2; i*i <= number ; i++) {
                if (isPrime(i)){
                    int x = i;
                    while (number%x == 0){
                        list.add(i);
                        x*=i;
                    }
                }
            }
        }
        endTime = System.nanoTime();
        return list;
    }

    private static List<Integer> findAllPrimeFactorsIterative2(Integer number) {
        startTime = System.nanoTime();
        List<Integer> list = new ArrayList<>();
        if (number <= 1) return list;
        else{
            for (int i = 2; i*i <= number ; i++) {
                while (number%i == 0){
                    list.add(i);
                    number /=i;
                }
            }
        }
        if (number>1) list.add(number);
        endTime = System.nanoTime();
        return list;
    }

    private static boolean isPrime(int i) {
        if (i==1) return false;
        if (i==2 || i==3) return true;
        if (i%2 == 0 || i%3 == 0) return false;
        for (int j = 5; j*j <= i; j+=6) {
            if (i%j == 0 || i%(j+2) == 0) return false;
        }
        return true;
    }
}
