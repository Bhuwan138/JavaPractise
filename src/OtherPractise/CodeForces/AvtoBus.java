package OtherPractise.CodeForces;

import java.util.Scanner;

public class AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



            long tyreCount = sc.nextLong();
            if(tyreCount <= 3){
                System.out.println(-1);
            }
            else{
                if((tyreCount & 1) != 0) System.out.println(-1);
                else{
                    long no4 = 0;
                    long no6 = 0;
                    long count4 = 0;
                    long count6 = 0;
                    long tempTyer = tyreCount;
                    while (tyreCount % 6 != 0){
                        tyreCount -= 4;
                        count4 += 1;
                    }
                    no6 = tyreCount / 6;
                    tyreCount = tempTyer;
                    while (tyreCount %4 != 0){
                        tyreCount -= 6;
                        count6 += 1;
                    }
                    no4 = tyreCount / 4;
                    no4 += count6;
                    no6 += count4;
                    if(no4 == 0 || no6 == 0){
                        long temp = Math.max(no4,no6);
                        System.out.println(temp + " " + temp);
                    }else{
                        System.out.println(no6 + " " + no4);
                    }
                }
            }





    }
}