class SumArrayInhancedFor{
	public static void main(String []args){
		if(args.length<2){
			System.out.println("Please Enter At Least two number");
		}
		else{
			int sum = 0;
			
			for(String x : args){
				sum += Integer.parseInt(x);
			}
			System.out.println(sum);
		}
	}
}