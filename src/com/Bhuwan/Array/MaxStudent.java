import java.util.Scanner;
class MaxStudent{

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
		
		int max=0;
		for(int []x : arr){
			int total = 0;
			for(int y : x){
				System.out.print(y + " ");
				total += y;
			}
			System.out.println("\nTotal : " + total);
			if(total > max)
				max = total;
			
		}
		System.out.println("\n\nHighest marks is : " + max);
		

		
	}
}