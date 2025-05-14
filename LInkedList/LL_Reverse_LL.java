package LInkedList;

class myll{
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addlast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newnode;
        }
    }

    public void printList(){
        Node curr = head;
        if(head == null){
            System.out.println("list empty");
            return;
        }
        while(curr != null){
            System.out.print(curr.data + "-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

//    public void reverselist(){
//        if(head == null || head.next == null){
//            System.out.println("list already reversed");
//            return;
//        }
//        Node prev = head;
//        Node current = head.next;
//
//        // iterative loop for reversing
//        while(current != null){
//            Node next = current.next;
//            // reverse the list
//            current.next = prev;
//
//            // move prev and current one step forward
//            prev = current;
//            current = next;
//        }
//        head.next = null;
//        head = prev; // change head to the new reversed head


    // without any if statement and extra head.next liye
//        Node curr = head;
//        Node prev = null;
//        while(curr != null){
//            Node nextnode = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextnode;
//        }
//        head.next = null;
//        head = prev; // change head to the new reversed head

//    }

    // recursive reverse linkedlist
    public Node recursivereverse(Node head){
        // base case
        if(head == null || head.next == null){
            return head;
        }

        // mera kaaam
        Node newhead = recursivereverse(head.next);
        Node headnext = head.next;
        headnext.next = head;
        head.next = null;
        return newhead;
    }




}


public class LL_Reverse_LL {
    public static void main(String[] args) {


        myll ll = new myll();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.printList(); // 1-> 2-> 3-> 4-> null

//        ll.reverselist();
//        ll.printList();

        ll.head = ll.recursivereverse(ll.head);
        ll.printList();
    }
}
