package OtherPractise;

public class reverseArray {
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,5,6,7};
        int k=3;
        //first part
        reverse(nums,0,nums.length-k-1);
        //second part
        reverse(nums,nums.length-k,nums.length-1);
        //all
        reverse(nums,0,nums.length-1);
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
    static private void reverse(int []arr,int start,int end){
        int mid = (start+end)/2;
        for(int i =start;i<=mid;i++){
            swap(arr,start++, end);
            end--;
        }

    }
    static private void swap(int []arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
