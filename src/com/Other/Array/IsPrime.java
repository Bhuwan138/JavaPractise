
class IsPrime{
	public static void main(String []args){
		int count = 0;
		for(int i=2; i<Integer.parseInt(args[0]);i++){
			if(Integer.parseInt(args[0]) % i == 0){
				count++;
			}
		}
		
		if(count == 0)
			System.out.println("Prime number");
		else
			System.out.println("Not a Prime number");
	}
}