import java.util.Scanner;

class AddArray{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum=0;
		float avg = 0.0f;
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt(); 
			sum += arr[i];
		}
		avg = sum / (float)n;
		System.out.println(sum + "\n" +  avg);
	}
}