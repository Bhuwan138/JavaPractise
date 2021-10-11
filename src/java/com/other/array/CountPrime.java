package java.com.other.array;

import java.util.Scanner;
class CountPrime{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);

		int flag;
		int count = 0;
		System.out.println("Count Prine Numbers form : "  );
		int start = in.nextInt();
		
		System.out.println(" Prine Numbers ends at : "  );
		int end = in.nextInt();
		System.out.println("Prime Numbers are : ");
		for(int i = start;i<=end;i++){
			flag = 0;
			for(int j=2; j<=i;j++){
				if(i % j == 0) {
					flag = 1;
					break;
				}
			}



			if (flag == 0 && i>=2){
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\nTotal prime numbers are : " + count);		
	}
}




