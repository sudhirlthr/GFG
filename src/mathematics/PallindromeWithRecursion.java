package mathematics;

import java.util.Stack;

public class PallindromeWithRecursion {
    public static void main(String[] args) {
        System.out.println(isNumberPallindrom(798976));
        System.out.println(isNumberPallindrom(1001));
        //System.out.println(isNumberPallindrom(1000021));
        //System.out.println(getQuotient(897,1));
    }

    private static boolean isNumberPallindrom(int number) {
        if (number < 10) return true;
        if(getQuotient(number) == number%10) {
            number = getRemaining(number);
            number /= 10;
            return isNumberPallindrom(number);
        }
        return false;
    }

    private static int getRemaining(int number) {
        Stack<Integer> integerStack = new Stack<>();
        int count=0;
        while (number >= 10){
            integerStack.push(number%10);
            number /=10;
            count++;
        }
        number = 0;
        while (count!=0) {
            number = number*10 +integerStack.pop();
            count--;
        }
        return number;
    }

    private static int getQuotient(int number) {
        while (number >= 10) number=Math.floorDiv(number, 10);
        return number;
    }
}
