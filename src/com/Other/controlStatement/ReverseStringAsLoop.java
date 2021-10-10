import java.util.Scanner;

class ReverseStringAsLoop{

	public static void main(String []sc){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = in.next();
		char reverse;
		for(int i= (str.length() - 1); i>=0;i--){
			reverse = str.charAt(i);
			System.out.print(reverse);
		}
		
	}
}