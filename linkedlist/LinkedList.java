package linkedlist;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
           // s1 - create a new node
        Node newNode = new Node(data);
        size++;
        if(head==null) {
            head = tail= newNode;
            return; 
        }
        // s2 - newNode next = head
        newNode.next = head;
        // s3 - head = newNode
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){ //middle - o(n) takes, because I have to find the index in LL but constant time for operations
        //and in array index is known.
        if(idx == 0){
            addFirst(data);
            return;
        }
          Node newNode = new Node(data);
          size++;
          Node temp = head;
          int i=0;
          while(i<idx-1){
            temp=temp.next;
            i++;
          }
          newNode.next = temp.next;
          temp.next = newNode;
            
    }

    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next =  new Node(2);
        ll.addFirst(2);
        ll.addFirst(1); 
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,9);
        ll.print(); 
        System.out.println(ll.size);

        
    }
    
}
