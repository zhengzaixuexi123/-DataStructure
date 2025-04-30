
import org.example.queue.LinkedListQueue;
import org.junit.Test;


public class QueueTest {
    @Test
    public void test() {
        LinkedListQueue queue = new LinkedListQueue();
        if (queue.isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        System.out.println(queue.getFront().getVal());
    }
}
