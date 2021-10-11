

import java.util.Scanner;

class IsDiagonalMatrix{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int row  = in.nextInt(), col = in.nextInt();
		int  [][]arr = new int[row][col];
		System.out.println("Enter row and column : ");
		for(int i=0;i<arr.length;i++){
			for(int j = 0; j< arr[i].length;j++){
				//System.out.println("Enter no. : ");
				arr[i][j] = in.nextInt();
			}
		}
		int correct = 0;

		for(int i=0;i<arr.length;i++){
			for(int j = 0; j< arr[i].length;j++){
				if (i == j && arr[i][j] != 1 ){
					correct = -1;
					break;
				}
				else if (i != j && arr[i][j] != 0){
					correct = -1;
					break;
				}

			}
		}
		
		if(correct == 0){
			System.out.println("Matrix is a Unit Matrix");
		}
		else{
			System.out.println("Matrix is not a Unit Matrix");
		}
	}
}