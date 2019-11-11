package queue;

/**
 *
 * @author omPiko
 */
public class QueueMain {
    public static void main(String[] args) {
        LinkQueue lQ = new LinkQueue();
        lQ.enqueue(99);
        lQ.enqueue(69);
        lQ.enqueue(93);
        lQ.dequeue();
        lQ.displayQueue();
        lQ.enqueue(26);
        lQ.enqueue(27);
        lQ.enqueue(46);
        lQ.displayQueue();
        lQ.dequeue();
        lQ.displayQueue();
        System.out.println(lQ.isEmpty());
        System.out.println(lQ.peek());
        lQ.size();
//        System.out.println(lQ.size());
    }
}
