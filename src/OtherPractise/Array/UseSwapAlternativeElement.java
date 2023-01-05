package OtherPractise.Array;

import java.util.Arrays;

public class UseSwapAlternativeElement {
    public static void main(String[] args) {
        int[] arr = {8,7,9,3,4,8,63,41,34};
        SwapAlternativeElement s = new SwapAlternativeElement();
        System.out.println(Arrays.toString(s.swapAlternativeElement(arr)));
    }
}

class SwapAlternativeElement{
    public int[] swapAlternativeElement(int[]arr){
        boolean checkEvenLength = arr.length%2 == 0;
        if(checkEvenLength){
            for (int i = 0; i < arr.length - 1; i+=2) {
                swap(arr,i,i+1);
            }
        }else{
            for (int i = 0; i < arr.length - 2; i+=2) {
                swap(arr,i,i+1);
            }
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
