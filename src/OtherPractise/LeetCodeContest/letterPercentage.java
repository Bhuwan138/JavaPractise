package OtherPractise.LeetCodeContest;

import java.util.HashMap;
import java.util.Map;

public class letterPercentage {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        Solution1 solution = new Solution1();
        System.out.println(solution.percentageLetter(s,letter));
    }
}

class Solution1 {
    public int percentageLetter(String s, char letter) {
        Map<Character,Integer> frequency = new HashMap<>();
        for(char a : s.toCharArray()){
            frequency.put(a,frequency.getOrDefault(a,0)+1);
        }
        int percentage = 0;
        if(frequency.containsKey(letter)){
            percentage = (frequency.get(letter) * 100)/s.length();
        }
        return percentage;
    }
}
