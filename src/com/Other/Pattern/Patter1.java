class Pattern1{
	public static void main(String []args){
		for(char cols='D'; cols >= 'A' ; cols --){
			for(int rows= cols; rows >= 'A'; rows --){
				System.out.print((char)rows + " ");
			}
			System.out.println();
		}
	}
}