package kavin;

public class Givennumber {
	int n;
	
	
public String Printnum(int n){
		String name1 = "";
	
		
		if(n>1){
			 name1 = "positive";
		}
		else if(n==0){
			name1 = "neither positive nor negative";
			
		}
		else{
			name1 = "negative";
			
		}
		
		return name1 ;
		
	}

}
