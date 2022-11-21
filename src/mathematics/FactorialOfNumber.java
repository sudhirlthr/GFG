package mathematics;

import java.net.Inet4Address;

public class FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println(getFactorialOf_a_number(5));
        System.out.println(getFactorialOf_a_number_UsingRecursion(5));
        // 5 * 4 * 3 * 2 * 1 = 120;
    }

    private static Integer getFactorialOf_a_number_UsingRecursion(Integer number) {
        if (number ==1 || number == 0) return 1;
        return number * getFactorialOf_a_number_UsingRecursion(number-1);
    }

    private static Integer getFactorialOf_a_number(Integer number){
        Integer result = 1;
        while (number > 0){
            result *= number--;
        }
        return result;
    }
}
