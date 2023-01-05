package OtherPractise.bitMinuplation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountTwoDistinct {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,2,1,7,4,3,4};
        checkTwo1(arr);
    }

    private static void checkTwo1(int[] arr) {
        int xor = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
        }

        int count = 0;
        while (xor != 0){
            if((xor & 1) == 1) break;
            count++;
            xor >>= 1;
        }

        int x1 = 0,x2 = 0;
        for (int i = 0; i < n; i++) {
            if( (arr[i] & (1<<count)) > 0 )
                x1 ^=  arr[i];
            else x2 ^= arr[i];
        }
        System.out.println(x1 + " " + x2);

    }

    private static void checkTwo(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) map.remove(arr[i]);
            else map.put(arr[i],1);
        }
//        for(int i: map.keySet()){
//            System.out.print(i + " ");
//        }
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");


    }
}
