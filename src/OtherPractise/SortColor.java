package OtherPractise;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int []nums = {2,0,1};
        int start=0,end=nums.length-1,mid=0;
        int temp;
        while(mid<=end){

            if(nums[mid] == 0){
                swap(nums,start++,mid++);
            }
            else if(nums[mid]==2){
                swap(nums,mid,end--);
            }
            else mid++;

        }
        System.out.println(Arrays.toString(nums));;
//        for(int num : nums){
//            System.out.print(num + " ");
//        }

    }

    private static void swap(int []arr,int x, int y) {
        int temp;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }
}
