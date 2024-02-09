package streamsAndLambdasTest;
import org.junit.Test;
import streamsAndLambdas.AvgOfOddSquares;

import static org.junit.Assert.assertEquals;

public class AvgOfOddSquaresTest {
    @Test
    public void testAverageOfOddSquares(){
        int[] numbers={1,2,3,4,5,6};
        double expected = 11.67;
        double result= AvgOfOddSquares.findAverageOfOddSquares(numbers);
        assertEquals(expected,result,0.01);
    }

    @Test
    public void testAverageOfOddSquaresNo(){
        int[] numbers={2,4,6,8,};
        double expected = 0;
        double result=AvgOfOddSquares.findAverageOfOddSquares(numbers);
        assertEquals(expected,result,0.01);
    }

}
