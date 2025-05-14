package Recursion;



public class recursion_1 {
// questions and logic available in main notebook of topic recursion
    // Q.1 - printing numbers from 5 to 1
//    public static  void printnums(int n){
//        if( n == 0){
//            return;
//        }
//        System.out.println(n);
//        printnums(n-1);
//    }


    // print sum n of n natural numbers
//    public static void printSum(int i, int n, int sum){
//        if(i == 6){
//            System.out.println(sum);
//            return;
//        }
//        sum = sum + i;
//        printSum(i+1, n, sum);
//    }


    // Factorial of n natural numbers
//    public static void factorial(int n, int ans){
//        if(n==0 ){
//            System.out.println(ans);
//            return;
//        }
//        ans *= n;
//        factorial(n-1, ans);
//    }

    // less in code for calculating the factorial of a number
//    public static int fact(int n){
//        if(n ==0 || n ==1){
//            return 1;
//        }
//        return n = n * fact(n - 1);
//
//    }


// fibonacci series till 8 term
//    public static void fibonacci(int n, int a, int b){
//        if(n == 0){
//            return;
//        }
//        int c = a + b;
//        System.out.print(" ");
//        System.out.print(c);
//        fibonacci(n-1, b, c);
//    }


    // tower of Hanoi
//    public static void towerofhanoi(int n, String src, String help, String dest){
//        if( n == 1){
//            System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
//            return;
//        }
//        towerofhanoi(n-1,src,dest,help);
//        System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
//        towerofhanoi(n-1,help,src, dest);
//    }


    // Reverse a String using revursion
    public static void reverse(String str, int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        reverse(str, idx-1);
    }



    public static void main(String[] args) {
//        printnums(5);
//        printSum(1, 5,0);
//        factorial(3,1);
//        int ans = fact(3);
//        System.out.println(ans);
//        int a = 0, b = 1;
//        System.out.print(a + " " + b );
//        fibonacci(6,a,b); // 0, 1, 1, 2, 3, 5, 8, 13
//        towerofhanoi(3,"S", "H", "D");
        String str = "abcde";
        reverse(str, str.length()-1);





    }
}