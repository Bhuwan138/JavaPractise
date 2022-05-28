package OtherPractise;

public class firstOccuranceBinarySearch {
    public static void main(String[] args) {
     int []arr = {0,10,10,10,10,24,78};
     int key = 10;
     boolean fl = false;
     int result = firstOcc(arr,key,fl);
     System.out.println("First Index is : " + result);
    }

    protected static int firstOcc(int[] arr, int key, boolean fl) {
        int start = 0;
        int result = -1;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;

            if(key == arr[mid]){
                result = mid;
                if(fl) {
                    end = mid - 1;
                }else {
                    start = mid+1;
                }
            }
            else if(key <arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return result;
    }


}
