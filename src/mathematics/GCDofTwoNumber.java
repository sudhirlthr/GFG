package mathematics;

public class GCDofTwoNumber {
    public static void main(String[] args) {
        System.out.println("GCD(Largest) of 2 Nos: "+findGcdOfTwoNumbers(15, 45));
    }

    public static Integer findGcdOfTwoNumbers(Integer a, Integer b) {
        Integer max = a > b ?a:b;
        Integer min = a < b ? a:b;
        Integer result = 1;
        for (int i = 1; i <= min; i++) {
            result = Math.max(result, max % i == 0 && min % i == 0 ? i: 1);
        }
        return result;
    }
}
