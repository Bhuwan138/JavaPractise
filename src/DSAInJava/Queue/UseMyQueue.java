package DSAInJava.Queue;

public class UseMyQueue {
    public static void main (String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(45);
        queue.enqueue(85);
        queue.enqueue(94);
        queue.enqueue(36);
        queue.enqueue(72);
        queue.enqueue(65);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(65);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

    }
}
