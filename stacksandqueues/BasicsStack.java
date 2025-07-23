package stacksandqueues;
import java.util.ArrayList;

// push O(1), pop O(1), peek O(1) - Works in LIFO (Last in first out)
// implementation available with arrays(if have to check everytime either is full or not because it contains only n elements)
// arraylist (variable type), linkedlist (variable type) (stack top must be ll head because it takes O(1) operations at each time)

public class BasicsStack {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        // push
        public static void push(int data){
            list.add(data);
        }
        // pop
        public static int pop(){
            if(isEmpty()) return -1;
            int top=list.get(list.size() -1);
            list.remove(list.size()-1); // o(1) operations
            return top;
        }
        // peek
        public static int peek(){
        if(isEmpty()) return -1;    

           return list.get(list.size() -1);
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        
    }
    
}
