package mathematics;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LCM_of_twoNumber {
    public static void main(String[] args) {
        System.out.println(getLCMofTwoNumbers(12, 15));
        System.out.println(getLCMofTwoNumbersLittleOpimized(12, 15));
        System.out.println(getLCMofTwoNumbersMoreOpimized(12, 15));
    }

    public static Integer getLCMofTwoNumbersMoreOpimized(int a, int b) {
        return (a * b)/GCD.gcdOfTwoNumber(a, b);
    }

    // TC: O(a*b)
    public static Integer getLCMofTwoNumbersLittleOpimized(int a, int b) {
        int res = Math.max(a, b);
        while (true){
            if (res % a == 0 && res % b == 0) return res;
            res++;
        }
    }

    public static Integer getLCMofTwoNumbers(int a, int b) {
        Integer divisor = 2;
        List<Integer> list = new ArrayList<>();
        while (a != 1 || b != 1){
            if (a % divisor == 0 || b % divisor == 0){
                if (a % divisor == 0 && b % divisor == 0){
                    a /= divisor;
                    b /= divisor;
                }else if (a % divisor == 0){
                    a /= divisor;
                }else if (b % divisor == 0){
                    b /= divisor;
                }
                list.add(divisor);
            }else {
                divisor++;
            }
        }
        AtomicInteger result = new AtomicInteger(1);
        IntSummaryStatistics summaryStatistics = list.stream().mapToInt(value -> value).summaryStatistics();
        System.out.println("Total Sum: "+summaryStatistics.getSum());
        System.out.println("Total Avg: "+summaryStatistics.getAverage());
        System.out.println("Max : "+summaryStatistics.getMax());
        System.out.println("Total count: "+summaryStatistics.getCount());
        list.forEach(integer -> result.set(result.get()* integer));
        System.out.println("LCM: "+result);
        return result.get();
    }
}
class GCD{
    public static Integer gcdOfTwoNumber(int a, int b) {
     if (b == 0) return a;
     return gcdOfTwoNumber(b, a%b);
    }
}
