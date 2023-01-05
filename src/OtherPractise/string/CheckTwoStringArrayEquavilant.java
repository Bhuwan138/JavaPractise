package OtherPractise.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckTwoStringArrayEquavilant {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        String first = String.join("",word1);
        String second = String.join("",word2);
        first.equals(second);
    }
}
