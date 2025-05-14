package Queue;

public class QueueUsingArray {

    public static class queuearr{
          int f = -1;
          int r = -1;
          int size =0 ;
          int[] arr;
          queuearr(int size){
              this.size = size;
              this.arr = new int[size];
          }


        public void add(int val){
            if(r == arr.length - 1){
                System.out.println("Queue is full");
                return;
            }
            if(f == -1){
                f = r = 0;
                arr[0] = val;
            }
            else{
//               arr[++r] = val;
                arr[r+1] = val;
                r++;
               size++;
            }
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }else{
                int val = arr[f];
                f++;
                size--;
                return val;
            }
        }

        public boolean isEmpty(){
              return r == -1;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }else{
                return arr[f];
            }
        }

        public void display(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return;
            }else{
                for (int i = f; i<= r; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        queuearr qq = new queuearr(5);
        qq.add(1);
        qq.add(2);
        qq.add(3);
        qq.add(4);
        qq.display();
        qq.remove();
        qq.display();
//        System.out.println(qq.peek());
//        System.out.println(qq.remove());

    }
}
