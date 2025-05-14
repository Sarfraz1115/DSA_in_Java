package Queue;

class Queuell{
    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
    Node head = null;
    Node tail = null;
    int size = 0;


    public void add(int data) {
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
        size++;
    }

    public int remove(){
        if(head == null){
            System.out.println("Queue is Empty!!!!!");
            return -1;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int peek(){
        if(head == null){
            System.out.println("Queue is Empty!!!!!");
            return -1;
        }
        return head.data;
    }

    public void display(){
        if(head == null){
            System.out.println("Queue is Empty!");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}



public class QueueUsingLinkedList {

    public static void main(String[] args) {
        Queuell q = new Queuell();

        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
//        q.remove();
//        q.display();
//        System.out.println(q.peek());
        System.out.println(q.remove());
    }
}
