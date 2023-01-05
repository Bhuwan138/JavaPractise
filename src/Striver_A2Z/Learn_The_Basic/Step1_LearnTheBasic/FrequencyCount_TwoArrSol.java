package Striver_A2Z.Learn_The_Basic.Step1_LearnTheBasic;

import java.util.*;

public class FrequencyCount_TwoArrSol {
    public static void main(String[] args) {
        int[] arr = {10,5,10,5,10,8,5,10,2};
//        frequency(arr);
        hashMapSol(arr);

    }

    private static void hashMapSol(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for(Integer num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        int min = Collections.min(map.values());
        int minKey = Collections.min(map.keySet());
        int max = Collections.max(map.values());
        int maxKey = Collections.max(map.keySet());
        System.out.println("Min val of " + minKey + " is " + min);
        System.out.println("Max val of "+ maxKey + " is " + max);


//        Iterator<Integer> it = map.keySet().iterator();
//        while (it.hasNext()){
//            int num = it.next();
//            System.out.println(num + " -> " + map.get(num));
//        }

//        Time Complexity: O(N)
//        Space Complexity: O(n)

    }

    private static void frequency(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited,false);
        for (int i = 0; i < arr.length; i++) {
            if(visited[i] == true) continue;
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
//        Time Complexity: O(N*N)
//        Space Complexity:  O(N)
    }
}
