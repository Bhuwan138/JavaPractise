package OtherPractise.string;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Substringwithconcatination {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        List<Integer> list = new ArrayList<>();
        list = findSubstring(s,words);
        System.out.println(list);
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ls = new ArrayList<>();
        char[] wholeString = s.toCharArray();

        return ls;
    }

}

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String,Integer> map = new HashMap();
        for(String word: words){
            map.put(word,map.getOrDefault(word,0)+1);
        }


        int len= s.length();
        if(words.length == 0){
            return null;
        }

        List<Integer> result = new ArrayList();
        int wordsCount = words.length;
        int wordLength = words[0].length();
        int totalWords = wordsCount * wordLength;

        for(int i=0;i<= len - totalWords;i++){
            Map<String,Integer> seen = new HashMap();
            for(int j=0; j<wordsCount;j++){
                int nextWordIndex = i+j*wordLength;
                String nextWord = s.substring(nextWordIndex,nextWordIndex+wordLength);
                if(!map.containsKey(nextWord)){
                    break;
                }
                seen.put(nextWord,seen.getOrDefault(nextWord,0)+1);
                if(seen.get(nextWord) > map.getOrDefault(nextWord,0)){
                    break;
                }

                if(j+1 == wordsCount){
                    result.add(i);
                }
            }
        }

        return result;
    }
}
