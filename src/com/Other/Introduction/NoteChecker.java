import java.util.Scanner;
class NoteChecker{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the amount of money : ");
		int notes = in.nextInt();
		int n;
		
		n = notes/2000;
		System.out.println(n + " notes of Rs.2000");
		notes = notes%2000;
		

		
			
		n = notes/1000;
		System.out.println(n + " notes of Rs.1000");
		notes = notes%1000;
		
	
		n = notes/500;
		System.out.println(n + " notes of Rs.500");
		notes = notes%500;
		

			
		n = notes/100;
		System.out.println(n + " notes of Rs.100");
		notes = notes%100;
		

		
		n = notes/50;
		System.out.println(n + " notes of Rs.50");
		notes = notes%50;

		n = notes/20;
		System.out.println(n + " notes of Rs.20");
		notes = notes%20;

		n = notes/10;
		System.out.println(n + " notes of Rs.10");
		notes = notes%10;

		n = notes/5;
		System.out.println(n + " notes of Rs.5");
		notes = notes%5;

		n = notes/2;
		System.out.println(n + " notes of Rs.2");
		notes = notes%2;

		System.out.println(notes + " notes of Rs.1");
	}
}