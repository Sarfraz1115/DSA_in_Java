package Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int [] arr = {3,4,2,5,1,7};
        int target = 1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("Found at index: " + i);
                break;
            }
            if(i == arr.length-1) {
                System.out.println("Not found in the array");
            }
        }
    }
}
