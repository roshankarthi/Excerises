package Excerise;

import java.util.Scanner;

public class Blooddonate {
       int age;
       float weight;
       Scanner sc =new Scanner(System.in);
       public void getInput() {
    	   System.out.println("enter the weight");
    	   weight = sc.nextFloat();
    	   
       }
       public void getOutput() {
    	   if(weight>50) {
    		   System.out.println("enter the age");
    		   age = sc.nextInt();
    		   if(age>18) {
    			   System.out.println("This person eligible to donate blood");
    		   }
    		   else {
    			   System.out.println("This person not eligible to donate blood");
    		   }
    		   
    	   }
    	   else {
			   System.out.println("This person not eligible to donate blood");
		   }
    	   
       }
}
