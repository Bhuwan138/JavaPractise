package OtherPractise;

public class maximumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,7,5,3};
        int k = 3;
        int max = maximumSumOfSubArray(arr,k);
        System.out.println(max);
    }

    public static int maximumSumOfSubArray(int[] arr ,int k){
        int max = Integer.MIN_VALUE;
        int start=0,end=0;
        int sum = 0;
        while (end< arr.length){
            sum += arr[end];

            if(end - start + 1 != k){
                end++;
            }else{
                max = Math.max(max,sum);
                sum -= arr[start];
                start++;
                end++;
            }
        }
        return max;
    }
}



