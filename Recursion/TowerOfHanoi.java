package Recursion;

public class TowerOfHanoi {


    // tower of Hanoi
    public static void towerofhanoi(int n, String src, String help, String dest){
        if( n == 1){
            System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerofhanoi(n-1,src,dest,help);
        System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
        towerofhanoi(n-1,help,src, dest);
    }


    public static void main(String[] args) {
        towerofhanoi(3,"S", "H", "D");
    }
}
