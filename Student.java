package kavin;

public class Student {
	
	String name,address;
	int m1,m2,m3,m4,m5,total;
	

	public Student(String string, String string2, int i, int j, int k, int l, int m) {
		
		// TODO Auto-generated constructor stub
		System.out.println("iam a explicit constructor");
		name = string;
		address = string2;
		m1=i;
		m2=j;
		m3=k;
		m4=l;
		m5=m;
		total = m1+m2+m3+m4+m5;
		
		
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Student1 = new Student("karthi","dgl",25,26,27,28,29);
		Student Student2 = new Student("dinesh","ch",30,31,32,33,34);
		Student Student3 = new Student ();
		
		Student1.display();
		Student2.display();
		Student3.display();
		
		
		

	}
	public Student(){
		
	}
	public void display()
	{
		System.out.println("student name="+name);
		System.out.println("Student Address="+address);
		System.out.println("student m1="+m1);
		System.out.println("student m2="+m2);		
		System.out.println("student m3="+m3);
		System.out.println("student m4="+m4);
		System.out.println("student m5="+m5);
		System.out.println("the total is="+total);
	}


}
