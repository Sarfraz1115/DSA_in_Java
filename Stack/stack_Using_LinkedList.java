package Stack;

class llstack{

    // is llstack ke andar ab node  banaoga
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node top = null;


    // push operation
    public void push(int value){
        Node newnode = new Node(value);
        if(top == null){
            top = newnode;
        }else{
            newnode.next = top;
            top = newnode;
        }

    }

    // pop
    public int pop(){
        if(top == null){
            System.out.println("stack is empty");
            return 1;
        }else{
            // if public void raha tu ye wala kar sakte hai
//            top =  top.next;

            // if public int raha tu ye kar sakte hai
            int tmp = top.data;
            top = top.next;
            return tmp;
        }
    }


    // peek
    public int peek(){
        if(top == null){
            System.out.println("stack is empty");
            return -1 ;
        }
        return top.data;
    }


//    printing the stack
    public void printStack(){
        if(top == null){
            System.out.println("stack is empty");
            return;
        }
        Node curr = top;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }


}




public class stack_Using_LinkedList {
    public static void main(String[] args) {
        llstack lls = new llstack();
        lls.push(11);
        lls.push(12);
        lls.push(13);
        lls.printStack();

        System.out.println();
        lls.pop();
        lls.printStack();

        System.out.println();
        System.out.println(" the top data " + lls.peek());
    }
}
