package LInkedList;

class Linkedlist {

    Node head;
    // for the tracking the size
    private int size;
    Linkedlist() {
        this.size = 0;
    }

    // for the Node class to hold data and next reference
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }



    // for the insertion operation at a given index
    public void addfirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }


    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
        }
    }


    public void deletefirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }


    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }


    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int getsize(){
        return size;
    }
}


public class linkedlist_1 {
    public static void main(String[] args) {


        Linkedlist lll = new Linkedlist();

        lll.addfirst(6);
        lll.addfirst(12);
        lll.display();

        lll.addlast(2);
        lll.addlast(3);
        lll.display();

//        lll.deletefirst();
//          lll.display();


        lll.deleteLast();
        lll.display();

        System.out.println(lll.getsize());

    }
}
