package BinarySearch;

public class binarysearch1 {

    public static int binarySearch(int arr [], int x){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end ) / 2;
            if(arr[mid] == x){
                return mid;
            } else if (arr[mid] < x) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;  // Element is not present in array.
    }

    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};
        int x = 13;
        int result = binarySearch(arr, x);

        if (result == -1)
            System.out.println("Element is not present in array " + result);
        else
            System.out.println("Element is present at index " + result);
    }

}
