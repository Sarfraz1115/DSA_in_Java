package Random_Questions;

public class Leetcode_88 {
    public static int [] Mergersort(int [] num1, int m, int [] num2, int n){
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(i >= 0 && j >= 0){
            if(num1[i] > num2[j]){
                num1[k] = num1[i];
                i--;
            }
            else{
                num1[k] = num2[j];
                j--;
            }
            k--;
        }
        while (i >= 0){
            num1[k] = num1[i];
            i--;
            k--;
        }
        while (j >= 0){
            num1[k] = num2[j];
            j--;
            k--;
        }
        return num1;
    }
    public static void main(String[] args) {
        int [] num1 = {1,2,3,0,0,0};
        int [] num2 = {2,5,6};
        int m = 3; int n = 3;
//        System.out.println(Mergersort(num1, m, num2, n));
        int [] a = Mergersort(num1, m, num2, n);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }

    }
}
