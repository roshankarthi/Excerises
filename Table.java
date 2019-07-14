package kavin;

import java.util.Scanner;

public class Table {
  int number1;
  int n;
  
  void getInput(){
	  Scanner scan = new Scanner(System.in);
	  System.out.println("enter the number");
	  number1 = scan.nextInt();
	  System.out.println("enter another number");
	  n = scan.nextInt();
	  
	  
	  
  }
 
   void method(){
	   for(int i=1;i<=n;i++)
	   {
		   System.out.println(number1+"*"+i+"="+i*number1);
		   
	   }
   }
}

