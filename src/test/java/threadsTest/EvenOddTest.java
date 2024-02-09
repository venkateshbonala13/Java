package threadsTest;

import org.junit.jupiter.api.Test;
import threads.EvenOdd;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    @Test
    void testEvenPrinter() {
        EvenOdd.EvenPrinter evenPrinter = new EvenOdd.EvenPrinter();

        Thread evenThread = new Thread(evenPrinter);
        evenThread.start();

    }

    @Test
    void testOddPrinter() {
        EvenOdd.OddPrinter oddPrinter = new EvenOdd.OddPrinter();

        Thread oddThread = new Thread(oddPrinter);
        oddThread.start();

    }
}
