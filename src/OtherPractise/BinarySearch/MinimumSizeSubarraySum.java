package OtherPractise.BinarySearch;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int target = 4;
        int [] nums = {1,4,4};
        System.out.println(minSubArrayLen(target,nums));
    }
    static public int minSubArrayLen(int target, int[] nums) {
        int low = 1, high = nums.length;

        boolean ansPossible = false;
        while (low < high){
            int mid = low + (high-low)/2;
            if(slideWindow(nums, target, mid)){
                ansPossible = true;
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        if(ansPossible) return low;
        return 0;
    }
    static public boolean slideWindow(int[] nums,int target, int k ){
        int sum = 0;
        for (int i = 0; i <k; i++) {
            sum += nums[i];
        }
        int low = 0, high = k-1;
        int maxi = sum;
        while (high != nums.length-1){
            sum -= nums[low];
            low++;

            sum += nums[high];
            high++;

            maxi = Math.max(maxi,sum);
        }
        return maxi>=target;
    }
}
