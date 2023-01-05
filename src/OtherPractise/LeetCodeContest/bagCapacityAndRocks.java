package OtherPractise.LeetCodeContest;

import java.util.Collections;

public class bagCapacityAndRocks {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] capacity = {2,3,4,5};
        int[] rocks =  {1,2,4,4};
        int additionalrocks = 2;
        System.out.println(solution2.maximumBags(capacity,rocks,additionalrocks));
    }
}

class Solution2 {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] remainingRocks = new int[rocks.length];
        for(int i = 0; i < remainingRocks.length; i++){
            remainingRocks[i] = capacity[i] - rocks[i];
        }
        for(int i = 0; i < remainingRocks.length; i++){
            int min = minimum(remainingRocks,i);
            if(additionalRocks == 0){
                continue;
            }

            additionalRocks = additionalRocks -  remainingRocks[min];
            remainingRocks[min] = 0;
        }



        int count  = 0;
        for (int remainingRock : remainingRocks) {
            if (remainingRock == 0) {
                count++;
            }
        }
        return count;
    }

    private int minimum(int[] remainingRocks, int num) {
        int index = 0;
        for(int i = num; i < remainingRocks.length; i++){
            if(remainingRocks[i] == 0 ) {

                continue;
            };
            if(remainingRocks[i] < remainingRocks[index] ){
                index = i;
            }
        }

        return index;
    }
}