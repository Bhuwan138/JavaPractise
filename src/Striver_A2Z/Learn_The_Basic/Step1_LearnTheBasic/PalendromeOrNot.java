package Striver_A2Z.Learn_The_Basic.Step1_LearnTheBasic;

public class PalendromeOrNot {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean check = isPalendrome(str);
        if(check)
            System.out.println("Palendrome");
        else
            System.out.println("Not a palendrome");
    }

    private static boolean isPalendrome(String str) {
        int left = 0, right = str.length()-1;
        while (left<right){
            char leftCharacter = str.charAt(left);
            char rightCharacter = str.charAt(right);
            if(!Character.isLetterOrDigit(  leftCharacter)){
                left++;
            } else if (!Character.isLetterOrDigit(rightCharacter)) {
                right--;
            }else if(Character.toLowerCase(leftCharacter) != Character.toLowerCase(rightCharacter))
                return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
