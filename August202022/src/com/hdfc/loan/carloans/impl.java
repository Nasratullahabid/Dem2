package com.hdfc.loan.carloans;

public class impl  {
	int a,b ;
	
	void add() {  	
	 System.out.println("Add Method= "+(a+b));
	}
	String add(String Name) {
		return Name;  	
		   
	  
		}
		public impl (int a) {  
		   this. a=111;
		   System.out.println("Contractor Sub Method= "+a);	
	}
	      public impl (int a, int b, int c) {  
	          a=a;
	          b=b;
	          c=c;
 
		System.out.println("Contractor Add Method= "+(a+b+c));
	   
		}
	public static void main(String[] args) {
		impl x=new impl(10,20, 30);
	    
		
 
        
	}

}
