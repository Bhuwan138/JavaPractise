package OtherPractise.string;
/*
* https://leetcode.com/problems/multiply-strings/
* 43. Multiply Strings
* */
public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "123", num2 = "456";
        System.out.println(multiply(num1,num2));
    }

    static public String multiply(String num1, String num2) {
            int m = num1.length();
            int n = num2.length();

            //edge cases
            if(n == 0 || m == 0 || "0".equals(num1) || "0".equals(num2))
                return "0";
            if("1".equals(num1))
                return num2;
            if("1".equals(num2))
                return num1;

            int[] result = new int[n+m];

            for(int i = m-1; i>=0; i--){
                for(int j = n-1; j>= 0; j--){
                    int product = (num1.charAt(i) - '0' ) * (num2.charAt(j) - '0');
                    product += result[i+j+1];

                    //adding in result
                    result[i+j+1] = product % 10;
                    result[i+j] += product / 10;
                }
            }

            StringBuilder sb = new StringBuilder();

            for(int res : result){
                if(res==0 && sb.length() == 0){
                    continue;
                }
                sb.append(res);
            }

            return sb.toString();


        }

}
