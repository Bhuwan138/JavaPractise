//WAP to take some integers using Command line Argument and display their sum
class SumArray{
	public static void main(String []args){
		int sum = 0;
		for(int i=0;i < args.length; i++){
			if(args.length<2){
				System.out.println("Please at least enter 2 number. ");
				//return ;
				System.exit(0);  //- it is used to kill the program
			}
			else
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("Sum is  " + sum);
	}
}