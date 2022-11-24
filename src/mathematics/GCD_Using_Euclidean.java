package mathematics;

public class GCD_Using_Euclidean {
    public static void main(String[] args) {
        System.out.println(getGCD_UsingEuclideanAlgorithm(15, 45));
        System.out.println(getGCD_UsingEuclideanAlgorithm(45, 15));
    }

    public static Integer getGCD_UsingEuclideanAlgorithm(Integer a, Integer b) {
        while (a!=b){
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }
}
