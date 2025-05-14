package Stack;

class  mystack {
    int capacity;
    int [] arr;
    int top;

    public mystack(int size){
        this.capacity = size;
        this.arr = new int[capacity];
        this.top = -1;
    }



    public void push(int value){
        if(top == capacity - 1){
            System.out.println("stack full");
            return;
        }
        top++;
        arr[top]  = value;
    }


    public int pop(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1 ;
        }
        System.out.println();
        return arr[top--];
    }


    public int peek() {
        if(top == -1){
            System.out.println("empty stack");
            return -1;
        }
        return arr[top];
    }


    public void printstack(){
        for(int i = 0 ; i <= top; i++){
            System.out.println(arr[i]);
        }
    }



}


public class stack_Using_Arrays{
    public static void main(String[] args) {

        mystack mm = new mystack(4);
        mm.push(6);
        mm.push(5);
        mm.push(4);
        mm.printstack();


        System.out.println("the top element is of peek " + mm.peek());

        mm.pop();
        mm.printstack();
    }
}
