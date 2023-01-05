package OtherPractise;

import java.util.Scanner;



public class factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        for(int i = 1; i<= num;i++){
            if(num%i==0){
//               if(isPrime(num))
                    System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int num) {

        for (int i = 2; i< num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
