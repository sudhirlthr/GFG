package mathematics;

public class GCD_Using_Euclidean {
    public static void main(String[] args) {
        System.out.println(getGCD_UsingEuclideanAlgorithm(15, 45));
        System.out.println(getGCD_UsingEuclideanAlgorithm(45, 15));
        System.out.println(gdcOfTwoNumberUsingEuclideanMethod(45, 15));
        System.out.println(getGCD_UsingEuclideanAlgorithm(3, 15));
        System.out.println(gdcOfTwoNumberUsingEuclideanMethod(3, 15));
        System.out.println(gdcOfTwoNumberUsingEuclideanMethod(3, 7));
        System.out.println(getGCD_UsingEuclideanAlgorithm(3, 7));
    }

    public static Integer getGCD_UsingEuclideanAlgorithm(Integer a, Integer b) {
        while (a!=b){
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }
    public static Integer gdcOfTwoNumberUsingEuclideanMethod(Integer a, Integer b){
        if (b==0) return a;
        else{
            return gdcOfTwoNumberUsingEuclideanMethod(b, a%b);
        }
    }
}
