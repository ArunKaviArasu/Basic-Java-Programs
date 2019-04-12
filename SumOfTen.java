package week3.day1;

public class SumOfTen {
	
	public static void main(String[] args) {
		int sum=0;
		for(int j=1;j<=10;j++) {
			//sum=sum+j;
			
			if(j%2!=0) {
				sum=sum+j;
			}
			
			System.out.println("Sum of Odd numbers from 1 to 10 is: " +sum);
			
		}
		
		//System.out.println("Sum of 1 to 10 is " +sum);
		
	}	

}
