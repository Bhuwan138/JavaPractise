package DSAInJava.Queue;

class Queue{
    private int  front = -1;
    private int rear = -1;
    private int [] queue = new int[5];

    //creating method for enqueue
    public  void enqueue(int num){
        //checking for overflow
        if( (rear+1)%queue.length == front ){
            System.out.println("Queue OverFlow");
            return;
        }

        rear = (rear + 1)%queue.length;
        queue[rear] = num;

        if(front == -1){
            front++;
        }
        System.out.println(queue[rear]);

    }

    //creating method for dequeue
    public  int dequeue(){
        int returnNumber;
        //checking for underflow
        if(front == -1){
            System.out.println("Queue is undeflow");
            return 0;
        }
        returnNumber = queue[front];
        //printing is just for showing output
        System.out.println(queue[front] + " is deleted.");
        if(front == rear)
            rear = front = -1;
        else
            front = (front+1)%queue.length;

        return returnNumber;
    }
}

public class CircilarQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(45);
        queue.enqueue(75);
        queue.enqueue(95);
        queue.enqueue(64);
        queue.enqueue(39);
        queue.enqueue(92);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
