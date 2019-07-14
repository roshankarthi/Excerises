package kavin;

import java.util.Scanner;

public class Javapythontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javapython sd = new Javapython();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		 String name1 = sc.next();
		 System.out.println("enter tha another name");
		 String name2 = sc.next();
		 String result = sd.Getdata(name1, name2);
		 System.out.println(result);
		 
		  

	}

}
