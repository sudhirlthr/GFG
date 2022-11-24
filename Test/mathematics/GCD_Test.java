package mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCD_Test {
    private Integer a = 15, b = 45, result = 15;
    @Test
    void testGcd(){
        Integer gcdOfTwoNumber = GCD.gcdOfTwoNumber(a, b);
        assertEquals(result, gcdOfTwoNumber);
    }

    @Test
    void testGCD_usingEuclideanAlgo(){
        Integer gcdUsingEuclideanAlgorithm = GCD_Using_Euclidean.getGCD_UsingEuclideanAlgorithm(a, b);
        assertEquals(result, gcdUsingEuclideanAlgorithm);
    }

    @Test
    void testGcdUSingNaiveApproach(){
        Integer gcdOfTwoNumbers = GCDofTwoNumber.findGcdOfTwoNumbers(a, b);
        assertEquals(result, gcdOfTwoNumbers);
    }
}
