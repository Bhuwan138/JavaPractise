package OtherPractise.Hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class continiousOcc {
    public static void main(String[] args) {
        int n = 6;
        String s = "aabbbbcc";
        String[] ans = count(n,s);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
    static public String[] count(int n,String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 1; i < n; i++) {
            char ch = s.charAt(i);
            if(s.charAt(i) == s.charAt(i-1)){
                map.put(ch, map.getOrDefault(ch,1)+1);
            }
        }
        String[] ans = new String[2];
        char k = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        ans[0] = String.valueOf(k);
        ans[1] = String.valueOf(map.get(k));
        return ans;
    }
}
