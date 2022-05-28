package OtherPractise.BinarySearch;
/*
* https://leetcode.com/problems/find-the-duplicate-number/
* 287. Find the Duplicate Number
* */
public class FindADuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    static public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        fast = 0;
        while(fast != slow){
            fast = nums[fast];
            slow = nums[slow];
        }
        return fast;
//        int num = -1;
//        for(int i=1;i< nums.length;i++){
//            if(nums[i] == nums[i-1]){
//                num = nums[i];
//                break;
//            }
//        }
//        return num;
    }
}
