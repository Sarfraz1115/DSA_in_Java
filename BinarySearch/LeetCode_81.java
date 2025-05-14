package BinarySearch;

public class LeetCode_81 {
    public static boolean search(int [] arr, int target){
        int st = 0;
        int end = arr.length - 1;
        while(st <= end){
            int mid = (st+ end) / 2;
            if(arr[mid] == target){
                return true;
            }
            // checking if starting, ending and mid will be same
            if(arr[st] == arr[mid] && arr[mid] == arr[end]){
                st++;
                end--;
                continue;
            }
            if(arr[st] <= arr[mid]){
                if(arr[st] <= target && target <= arr[mid]){
                    end = mid - 1;
                }
                else{
                    st = mid + 1;
                }
            }
            else{
                if(arr[mid] <= target && target <= arr[end]){
                    st = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {2,5,6,0,0,1,2};
        int target = 3;
        boolean result = search(arr, target);
        if(result == false) {
            System.out.println("target is not present " + false);
        }
        else{
            System.out.println("target is present " + true);
        }
    }
}
