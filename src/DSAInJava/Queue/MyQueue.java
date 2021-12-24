package DSAInJava.Queue;

class MyQueue {
    private int rear=-1,front=0;
    private int[] arr = new int[5];

    //For Inserting
    public void enqueue(int number){
        //Checking for Overflow
        if(rear == arr.length-1){
            System.out.println("Queue Overflow");
            return;
        }
        rear++;
        arr[rear] = number;
        System.out.println(number + " is added.");
    }

    //For Deleting
    public int dequeue(){
        //Checking for Underflow
        if(front > rear){
            System.out.println("Queue Underflow");
            return 0;
        }

        int number = arr[front];
        front++;
        System.out.println(number + " is deleted");
        return number;
    }
}


