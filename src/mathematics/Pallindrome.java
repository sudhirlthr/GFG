package mathematics;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(isNUmberPallindromWithoutZero(1001));
    }

    private static boolean isNUmberPallindromWithoutZero(int number) {
        if (String.valueOf(number).contains("0")) System.out.println("Contains zero");
        int numberCopy = 0, revrse = number, remainder = 0;
        while (number != 0){
            remainder = number%10;
            number /= 10;
            numberCopy = (numberCopy * 10)+remainder;
        }
        System.out.println("number: "+ revrse+" numberCOpy: "+numberCopy);
        return numberCopy == revrse;
    }
}
