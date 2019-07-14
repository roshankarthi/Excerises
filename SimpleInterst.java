package kavin;

public class SimpleInterst {
	float principle;
	int no_of_year;
	int rate;

	SimpleInterst(){
		
	//float simpleinterst = principle*no_of_year*rate/100;
		principle =2500;
		no_of_year = 8;
		rate =5;
		
	}
	
	public void display() {
		// TODO Auto-generated method stub
		float simpleinterst = principle*no_of_year*rate/100;
		System.out.println("the simpleinterst"+simpleinterst);
	}

}
