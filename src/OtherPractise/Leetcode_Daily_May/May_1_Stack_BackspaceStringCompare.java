package OtherPractise.Leetcode_Daily_May;

import java.util.Stack;

/*
* https://leetcode.com/problems/backspace-string-compare/
* 844. Backspace String Compare
* */
public class May_1_Stack_BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "a#c", t = "a";
        System.out.println(backspaceCompare(s,t));
    }

    String s = "ab#c";
    String t = "#ac#";

    static public boolean backspaceCompare(String s, String t) {
        String s1 =  afterBackspace(s);
        String t1 = afterBackspace(t);
        return s1.equals(t1);
    }

    static String afterBackspace(String str){
        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if(ch != '#'){
                stack.push(ch);
            }
            else{
                if(!stack.isEmpty()) stack.pop();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }

}
