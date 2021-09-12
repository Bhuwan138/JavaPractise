import java.util.Scanner;
class SumAverageOfTwoDArray{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the row size : ");		
		int rows = in.nextInt();
		System.out.print("Enter the column size : ");
		int cols = in.nextInt();
		int [][]arr = new int[rows][cols];
		
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print("Enter the size of arr["+i+"]["+j+"]  :  ");
				arr[i][j] = in.nextInt();
			}
		}
		int sum = 0;
		for(int []x : arr){
			for(int y : x){
				System.out.print(y + "  ");
				sum += y;
			}
			System.out.println();
		}
		System.out.println("Sum is " + sum);
		double average = (double)sum/(rows*cols);
		System.out.println("Average is " + average);

	}
}


/*
//Printing each elements and average and um of each row
for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

		for(int i=0;i<rows;i++){
			int sum = 0;
			double average = 0.0;
			for(int j=0;j<cols;j++){
				sum += arr[i][j];
			}
			average = (double)sum/cols;
			System.out.println("Sum of arr["+i+"] : " + sum);
			System.out.println("Average of arr["+i+"] : " + average);
		}

 */