package LInkedList;

class doublylinkedlist {

    class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            prev = null;
            next = null;
        }
    }
    Node head;
    Node tail;


    // add node
    public void addLastNode(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        else{
            newnode.prev = tail;
            tail.next = newnode;
            tail = newnode;
        }
    }


    public void addFisrtNode(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }

    }


    public void deleteFirstNode(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        head.prev = null;
        System.out.println();
    }

    public void deleteLastNode(){
        if(tail == null){
            System.out.println("List is empty");
            return;
        }
        tail = tail.prev;
        tail.next = null;
        System.out.println();
    }


    // insert at random position
    public void insertAtPosition(int data, int position){
        if(head == null){
            System.out.println("empty list");
            return;
        }
        if(position<= 0){
            System.out.println("Invalid position");
            return;
        }
        Node newnode = new Node(data);
        if(position == 1){
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
        Node temp = head;
        for (int i = 1; i < position - 1; i++){
            temp = temp.next;
        }

        temp.next.prev = newnode;
        newnode.next = temp.next;
        newnode.prev = temp;
        temp.next = newnode;

        System.out.println();
    }



    // display the list
    public void displayList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }



}

public class Doubly_Linkedlist {
    public static void main(String[] args) {
        doublylinkedlist dd = new doublylinkedlist();
        // add last node
        dd.addLastNode(3);
        dd.addLastNode(5);
        dd.addLastNode(4);
        dd.addLastNode(6);

        dd.addFisrtNode(2);
        dd.displayList();

//            dd.deleteFirstNode();
//            dd.displayList();

//        dd.deleteLastNode();
//        dd.displayList();


        dd.insertAtPosition(12,3);
        dd.displayList();
    }
}
