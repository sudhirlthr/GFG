package mathematics;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(isNUmberPallindrom(79897));
    }

    private static boolean isNUmberPallindrom(int number) {
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
