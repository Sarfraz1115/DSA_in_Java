package BinarySearch;

public class binarysearchRecursion {
    public static int binarySearch(int[] arr, int st, int end, int target) {
        // base case
        if (st > end) {
            // mera kaam
            return -1;
        }
        int mid = (st + end) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (target < arr[mid]) {
            return binarySearch(arr, st, mid - 1, target);
        } else {
           return binarySearch(arr, mid + 1, end, target);
        }

    }



    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11,12};
        int target = 15;
        int result = binarySearch(arr, 0, arr.length - 1, target);
        if (result != -1) {
            System.out.println("element found at index " + result);
        } else {
            System.out.println("element not found");
        }
    }

}
