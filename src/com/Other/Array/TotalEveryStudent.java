import java.util.Scanner;
class TotalEveryStudent{

	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of Student : ");
		int row = in.nextInt();
		System.out.print("Enter the marks of each Subject ");
		int col =  in.nextInt();
		int [][]arr = new int[row][col];

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = in.nextInt();
			}
		}

		for(int []x : arr){
			int total = 0;
			for(int y : x){
				System.out.print(y + " ");
				total += y;
			}
			System.out.println("\nTotal marks " + total);
		}

		
	}
}