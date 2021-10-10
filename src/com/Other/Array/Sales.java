import java.util.Scanner;
class Sales{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		
		double avg,max=0;
		System.out.println("Enter the number of sales man ?  ");
		int n = in.nextInt();
		int [][]sales = new int[n][]; 
		int sn;
		for(int i=0;i<sales.length;i++){
			System.out.println("Enter how many sales for salesman " + (i+1) );
			sn= in.nextInt();
			sales[i] = new int[sn];
			for(int j=0;j<sales[i].length;j++){
				System.out.print("Enter sales value of salesman" + (i+1) + " of sale" + (j+1) + "  ?  ");
				sales[i][j] = in.nextInt();
			}
		}

		for(int i=0;i<sales.length;i++){
			
			for(int j=0;j<sales[i].length;j++){
				System.out.print(sales[i][j] + "  ");
				
			}
			System.out.println();		
		}


		for(int i=0;i<sales.length;i++){
			avg = 0;
			for(int j=0;j<sales[i].length;j++){
				avg= (double)sales[i][j] / sales[i].length;
			}
			System.out.println("Average of salesman " + (i+1)+ " is :  " + avg);	
			if(avg > max)
				max = avg;	
		}
		System.out.println("The maximum sales is" + max);
			
		
		
	}
}