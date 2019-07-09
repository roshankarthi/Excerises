package Excerise;

import java.util.Scanner;

public class Employee {
	float basicsalary;
	double grosssalary;
	public void getInput() {
		Scanner sd = new Scanner(System.in);
		System.out.println("enter the salary");
		basicsalary = sd.nextFloat();
		
		
	}
	public void getOutput() {
		if(basicsalary<=10000) {
			grosssalary=(basicsalary+basicsalary*0.2+basicsalary*0.8);
			System.out.println(grosssalary);
		}
		else if(basicsalary<=20000) {
			grosssalary=(basicsalary+basicsalary*0.25+basicsalary*0.9);
			System.out.println(grosssalary);
		}
		else if(basicsalary>20000) {
			grosssalary=(basicsalary+basicsalary*0.3+basicsalary*0.95);
			System.out.println(grosssalary);
		}
	}

}
