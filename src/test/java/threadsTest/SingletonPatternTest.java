package threadsTest;

import org.junit.Test;
import threads.SingletonPattern;

import static org.junit.Assert.assertEquals;

public class SingletonPatternTest {

    @Test
    public void testSingleton() {
        SingletonPattern instance1 = SingletonPattern.getInstance();
        SingletonPattern instance2 = SingletonPattern.getInstance();


        assertEquals(instance1, instance2);
    }
}