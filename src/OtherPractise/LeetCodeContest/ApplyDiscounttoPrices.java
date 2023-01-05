package OtherPractise.LeetCodeContest;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ApplyDiscounttoPrices {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        String sentence = "there are $1 $2 and 5$ candies in the shop";
        int discount = 50;
        System.out.println(solution5.discountPrices(sentence,discount));
    }
}

class Solution5 {
    public String discountPrices(String sentence, int discount) {
        String[] words = {};
        for(int i=0;i<sentence.length();i++) {
           words = sentence.split(" ");
        }


        for(int i = 0; i< words.length; i++){
            if(validString(words[i])){
                double num = Double.parseDouble(words[i].substring(1));

                num = num - (num * discount/100.00);
                BigDecimal bigDecimal = new BigDecimal(Double.toString(num));
                String str = bigDecimal.toPlainString()+"0";

                words[i] = "$" + str + "";
            }
        }

       StringBuilder s = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            s.append(words[i] + " ");
        }


        return s.toString().substring(0,s.length()-1);
    }

    private boolean validString(String word) {
        boolean numeric = false;
        if(word.charAt(0) == '$'){
            numeric = true;
            try {
                Double num = Double.parseDouble(word.substring(1));
            } catch (NumberFormatException e) {
                numeric = false;
            }
        }
        return numeric;
    }
}




/*

class Solution {
    boolean digitOnly(String s){
        for(char cs:s.toCharArray()) if(cs!='$' && !(cs>='0' && cs<='9')) return false;
        return true;
    }
    public String discountPrices(String sentence, int discount) {
        double val=(double)discount/(double)100 ;
        String[] s=sentence.split(" ");
        for(int i=0;i<s.length;i++){
            if(s[i].indexOf('$')==0 && s[i].lastIndexOf('$')==0 && s[i].length()>1 && digitOnly(s[i])){
                double temp=1.0*Long.parseLong(s[i].substring(1));
                s[i]="$"+String.format("%.2f",(temp-temp*val));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int sk=0;sk<s.length;sk++) {
            sb.append(s[sk]);
            if(sk!=s.length-1) sb.append(" ");}
        return sb.toString();
    }
}
 */