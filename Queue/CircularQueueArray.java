package Queue;

public class CircularQueueArray {

    public static class Cqueue {
        int front = -1, rear = -1;
        int size;
        int[] arr;

        Cqueue(int size) {
            this.arr = new int[size];
            this.size = size;
        }

        public boolean isFull(){
            return (rear + 1) % size == front;
        }
        public boolean isEmpty(){
            return front == -1;
        }

        public void add(int data) {
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(isEmpty()){
                front = 0;
                rear = 0;
                arr[rear] = data;
            }
            else{
                rear = (rear + 1) % size;
                arr[rear] = data;
            }

        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int value = arr[front];
            if(front == rear){
                front = rear = -1;
            }
            else{
                front = (front + 1) % size;
            }
            return value;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        public void display(){
            if(isEmpty()){
                System.out.println("queue is emp");
                return;
            }
            for(int i = front; ;i= (i+1) % size){
                System.out.print(arr[i] + " ");
                if(i == rear){
                    break;
                }
            }
            System.out.println();


        }

    }

    public static void main(String[] args) {
            Cqueue cq = new Cqueue(5);
            cq.add(1);
            cq.add(2);
            cq.add(3);
            cq.add(4);
            cq.add(5);
            cq.display(); // 1 2 3 4 5
            cq.remove();
            cq.display(); // 2 3 4 5
            cq.add(6);
            cq.display();
            // my actual circular queue is printing  --> 6 2 3 4 5
            for(int i=0; i<cq.arr.length; i++) {
                System.out.print(cq.arr[i] + " ");
            }

    }
}
