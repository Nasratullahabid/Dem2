package com.hdfc.loan.carloans;

public class Hfdc implements Rbi
{

	@Override
	public void withdraw1() 
	{
		 System.out.println("I am overriden withdraw1 in HDFC...");
		
	}

	@Override
	public void deposit()
	{
		 System.out.println("I am overriden Deposit in HDFC...");
	
	}
	public void check()
	{
		 System.out.println("I am check method in HDFC...");
	
	}
    public static void main(String[] args)    {
      Hfdc obj=new Hfdc();
      obj.deposit();
      obj.withdraw1();
      obj.check();
      Rbi obb=new Hfdc();
      obb.deposit();
      obb.withdraw1();
      
     
     

     
	}
}
