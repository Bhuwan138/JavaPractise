import java.util.Scanner;

class AddRepeat{

    public static void main(String []args){
            Scanner in = new Scanner(System.in);
            String check;
            do{
	System.out.println("Enter two Number : ");
	int a = in.nextInt();
	int b = in.nextInt();
	System.out.println("Sum :  " + (a+b));
	System.out.println("Do you want to continue (Yes/No) ? ");
	check = in.next();
	
	
            }while(check.equalsIgnoreCase("yes"));
        }

}