package BinarySearch;

public class FirstOccurence {
    public static int firstOccurrence(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        int firstOccurence = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                firstOccurence = mid;
                end = mid - 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        return firstOccurence;
    }

    public static void main(String[] args) {
        int arr[] = {5,5,5,6,6,7,8,9};
        int target = 6;
        int result = firstOccurrence(arr, target);
        System.out.println("First Occurrence of " + target + " is at index " + result);
    }
}
