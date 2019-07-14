package kavin;

import java.util.Scanner;

public class SumofDigits {
	private int n,sum,rem;
	
	public void getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		n= sc.nextInt();
		
	}
	public void getOutput(){
		for(int i=0;n>i;){
			
		   rem=n%10;
		   n=n/10;
			
			sum = sum+rem;
		}
		System.out.println(sum);
	}
	

}
