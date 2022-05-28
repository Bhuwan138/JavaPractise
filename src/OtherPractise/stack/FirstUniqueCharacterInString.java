package OtherPractise.stack;

import java.util.*;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s= "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
    static  public int firstUniqChar(String s) {

        Map<Character,Integer> map = new HashMap<>();

        for(Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) return i;
        }

    return -1;
}



}
