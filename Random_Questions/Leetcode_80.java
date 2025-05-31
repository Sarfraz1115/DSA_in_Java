package Random_Questions;

public class Leetcode_80 {
    public static int RemoveDuplicates(int [] nums){
        // My code
        int size = 0;
        int count = 1;
//        1,1,1,2,2,3,3,3
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] == nums[size]) {
                if (count < 2) {
                    size++;
                    nums[size] = nums[right];
                    count++;
                }
            } else {
                size++;
                nums[size] = nums[right];
                count = 1; // reset count for new number
            }
        }
        return size + 1;




//        if(nums.length <= 2){
//            return nums.length;
//        }
//        int i = 2;
//        for(int j = 2; j< nums.length; j++){
//            if(nums[j] != nums[i - 2]){
//                nums[i] = nums[j];
//                i++;
//            }
//        }
//        return i;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3,3,3};
        int len = RemoveDuplicates(nums);
        System.out.println("Length: " + len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
