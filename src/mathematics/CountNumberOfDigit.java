package mathematics;

public class CountNumberOfDigit {
    public static void main(String[] args) {
        System.out.println(countNumberOfDidgit(789648));
    }

    public static Integer countNumberOfDidgit(int number) {
        Integer numberOfDigit = 0;
        while (number > 0){
            numberOfDigit ++;
            number /= 10;
        }
        return numberOfDigit;
    }
}
