package streamsAndLambdasTest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import streamsAndLambdas.ArithmeticOperation;

public class ArithmeticOperationTest {
    ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

    @Test
    public void testsum(){
        Assert.assertEquals(4, arithmeticOperation.mathOperation.operate(2,2));
    }
}
