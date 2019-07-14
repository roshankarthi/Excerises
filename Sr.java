package kavin;

public class Sr {
	String name, address;
	int m1,m2,m3,m4,m5;
	public Sr(String string, int i, int j, int k, int l, int m, String string2) {
		name= string;
		m1= i;
		m2= j;
		m3= k;
		m4= l;
		m5= m;
		address= string2;
		
	}
	public Sr() {
		System.out.println("Details not avilable");
		
	}
	public static void main(String[]s) {
		Sr st1= new Sr("Kumar",29,90,56,56,89,"Dgl");
		Sr st2= new Sr("kamal",45,56,67,35,89,"Chn");
		Sr st3= new Sr();
		
		st1.display();
		st2.display();
		
		
		
		
		
		
	}
	private void display() {
		System.out.println("Student name:"+name);
		System.out.println("Student m1:"+m1);
		System.out.println("Student m2:"+m2);
		System.out.println("Student m3:"+m3);
		System.out.println("Student m4:"+m4);
		System.out.println("Student m5:"+m5);
		System.out.println("Student address:"+address);
		
		
	}
	
	
	
}