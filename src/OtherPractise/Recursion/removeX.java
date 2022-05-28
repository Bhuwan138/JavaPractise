package OtherPractise.Recursion;

public class removeX {
    public static void main(String[] args) {
        String a = "xxoaaabbdd";
//        String a = "boba";
//        String count = removY(a);
        String ans = removeDublicate(a);
        System.out.println(ans);
    }

    private static String removeDublicate(String a) {
        if(a.length() == 1) return a;

        char str = a.charAt(0);

        if(str == a.charAt(1)){
            return removeDublicate(a.substring(1));
        }
        return str + removeDublicate(a.substring(1));
    }

    private static String removY(String a) {
        if(a.length() == 1) return a;

        char b= a.charAt(0);
        if(a.charAt(0) == 'x'){
            b = 'b';

        }
        return  b+  removY(a.substring(1));

    }

    private static int removX(String a) {
        if(a.isEmpty()) return 0;

        if(a.charAt(a.length()-1) == 'x'){
            return removX(a.substring(0,a.length()-1));
        }else{
            return 1 + removX(a.substring(0,a.length()-1));
        }


    }

}
