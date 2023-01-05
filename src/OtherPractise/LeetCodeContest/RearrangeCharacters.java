package OtherPractise.LeetCodeContest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RearrangeCharacters {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        String s = "ilovecodingonleetcode", target = "code";
        System.out.println(solution4.rearrangeCharacters(s,target));
    }
}

class Solution4 {
    public int rearrangeCharacters(String s, String target) {


       Map<Character,Integer> frequency = new HashMap<>();
        for(char a : s.toCharArray()){
            frequency.put(a,frequency.getOrDefault(a,0)+1);
        }

       int count = 0;

        int targetLength = target.length();



        return count;
    }

}
