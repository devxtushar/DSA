package stacksandqueues;
// circular queue has came into the picture to reduce tc from o(n) to o(1) while performing remove operation from array.
public class CircularQueue{
    static class CQueue {
            static int arr[];
    static int size;
    static int rear;
    static int front;
    CQueue(int n){
        arr = new int[n];
        size=n;
        rear=-1;
        front=-1; 

    }
    public static boolean isEmpty(){
       return rear ==-1 && front==-1;
    }
       public static boolean isFull(){
       return (rear+1)%size == front;
    }
    
    public static void add(int data){ // o(1)
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        // add 1st element 
        if(front == -1){
            front=0;
        }
        rear = (rear+1)%size;
        arr[rear] = data;
    }
    public static int remove(){ // o(1)
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        int result = arr[front];
        // last element delete
        if(rear == front){
            rear=front=-1;
        }else{
        front = (front+1)%size;
        }
        return result;
    }
    public static int peek(){ // o(1)
          if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return arr[front];
    }
    
        
    }
    public static void main(String[] args) {
                CQueue q = new CQueue(3);
                       q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}