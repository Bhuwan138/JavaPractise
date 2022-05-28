package OtherPractise.Hashing;

import javax.lang.model.util.ElementScanner6;
import java.util.HashMap;
import java.util.Map;

/*
* https://leetcode.com/problems/isomorphic-strings/
* 205. Isomorphic Strings
* */
public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "babe", t = "bade";
        System.out.println(isIsomorphic(s, t));
    }

    static public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character first = s.charAt(i);
            Character second = t.charAt(i);
            if (map.containsValue(second) && !(map.containsKey(first))) return false;
            if (map.containsKey(first) && !(map.get(first).equals(second))) return false;
            map.put(first, second);
        }
        return true;
    }
}



//    Map<Character, Boolean> map2 = new HashMap<>();
//            if(map.containsKey(first)){
//                if(!(map.get(first).equals(second))){
//                    return false;
//                }
//            }
//            else {
//                if (map2.containsKey(second)) return false;
//                else {
//                    map.put(first, second);
//                    map2.put(second, true);




















//        int l1=s.length();
//        int l2=t.length();
//        if(l1!=l2)
//            return false;
//        char ch1[]=s.toCharArray();
//        char ch2[]=t.toCharArray();
//        var hmap= new HashMap<Character,Character>();
//        for(int i=0;i<l1;i++){
//            Character c=hmap.get(ch1[i]);
//            if(hmap.containsValue(ch2[i]) && !hmap.containsKey(ch1[i]))
//                return false;
//            if(hmap.get(ch1[i])==null)
//                hmap.put(ch1[i],ch2[i]);
//            else{
//                if(c!=ch2[i])
//                    return false;
//            }
//
//        }
//        return true;