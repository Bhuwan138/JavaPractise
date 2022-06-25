package OtherPractise.string;

import java.sql.SQLOutput;
import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        String S =  "i.like.this.program.very.much";
        System.out.println(S.length());
    }

    private static String reverse(String S) {
        String a[]=S.split("\\.");
        int lengthArray= a.length;
        for(int i=(lengthArray-1);i>=0;i--) {
            System.out.print(a[i]);
            if(i!=0)
            {
                System.out.print(".");
            }
        }

        return null;
    }
}
