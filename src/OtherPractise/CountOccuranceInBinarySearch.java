package OtherPractise;

public class CountOccuranceInBinarySearch {
    public static void main(String[] args) {
        int []arr = new int[]{2,10,10,10,10,10,10};
        int key = 10;
        int total = countOcc(arr,key);
        System.out.println("total no of occurance : " + total);
    }

    private static int countOcc(int[] arr, int key) {
        int first = firstOccuranceBinarySearch.firstOcc(arr,key,true);
        int last = firstOccuranceBinarySearch.firstOcc(arr,key,false);
        return last-first + 1;
    }
}
