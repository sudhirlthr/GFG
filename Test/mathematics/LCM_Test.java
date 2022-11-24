package mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LCM_Test {
    private Integer a = 12, b = 15, result = 60;
    @Test
    void testNaiveApproach(){
        assertEquals(result, LCM_of_twoNumber.getLCMofTwoNumbers(a,b));
    }

    @Test
    void testLiitleImprovisedApproach(){
        assertEquals(result, LCM_of_twoNumber.getLCMofTwoNumbersLittleOpimized(a,b));
    }
    @Test
    void testMoreOPtimizedApproach(){
        assertEquals(result, LCM_of_twoNumber.getLCMofTwoNumbersMoreOpimized(a,b));
    }
}
