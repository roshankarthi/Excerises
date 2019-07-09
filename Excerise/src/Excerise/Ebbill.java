package Excerise;

import java.util.Scanner;

public class Ebbill {
     int unit,pay;
     
     
     public void getInput() {
    	 Scanner eb =new Scanner(System.in);
    	 System.out.println("enter the unit");
    	 unit = eb.nextInt();
    	 
     }
     public void getOutput() {
    	 if(unit>1&&unit<=100) {
    		 
    		 pay = (unit*5);
    		 System.out.println(pay);
    		 
    	 }
    	 else if(unit>=101&&unit<=200) {
    		 pay=(100*5)+(unit-100)*7;
    		 System.out.println(pay);
    		 
    		 
    	 }
    	 else if(unit>=201&&unit<=300) {
    		 pay=(100*5)+(200*7)+(unit-200)*10;
    		 System.out.println(pay);
    		 
    		 
    	 }
    	 else if(unit>300) {
    		 pay=(100*5)+(200*7)+((unit-300)*15);
    		 
    		 System.out.println(pay);
    		 
    		 
    	 }
    	 
     }
}
