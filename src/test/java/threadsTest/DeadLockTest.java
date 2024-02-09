package threadsTest;

import org.junit.Test;
import threads.DeadLock;

public class DeadLockTest {

    @Test
    public void testDeadlock() throws InterruptedException {
        DeadLock deadlockExample = new DeadLock();

        Thread thread1 = new Thread(deadlockExample::thread1);
        Thread thread2 = new Thread(deadlockExample::thread2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}