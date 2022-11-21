package mathematics;

public class TrailingZerosOf_a_FactorialNumber {
    public static void main(String[] args) {
        System.out.println(getNumberOfTrailingZerosFor_a_Factorial(10));
        // Factorial(5) = 5 * 4 * 3 * 2 * 1 = 120, so number of trailing zero = 1
        System.out.println(getNumberOfTrailingZerosFor_a_Factorial_FasterApproach(251));

    }

    /*
    * IN this approach we will be just caunting number which is multiple of 5, which gives Zero at the end of number
    * TC = O(log n)
    * */
    private static Integer getNumberOfTrailingZerosFor_a_Factorial_FasterApproach(Integer number) {
        int result = 0;
        for (int i = 5; i <= number; i=i*5) {
            result += number/i;
        }
        return result;
    }

    // worst and slower
    private static Integer getNumberOfTrailingZerosFor_a_Factorial(Integer number) {
        Integer result = 0, factorial = 1;
        while (number > 0){
            factorial *= number--;
        }
        while (true){
            if (factorial % 10 == 0){
                result++;
            }else break;
            factorial /= 10;
        }
        return result;
    }
}
