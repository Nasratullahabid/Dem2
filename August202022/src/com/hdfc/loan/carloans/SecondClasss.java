package com.hdfc.loan.carloans;

public class SecondClasss
{
    int x=10,y=20,result;
    void add()
    {
    	result=x+y;
    	System.out.println("Add x and y values= "+ result);
    }
    void sub()
    {
    	result=x-y;
    	System.out.println("substraction x and y values= "+ result);
    }
	public static void main(String[] args)
	{
		SecondClasss obj=new SecondClasss();
		
		obj.add();
        obj.sub();
     
        SecondClasss obj1=new SecondClasss();
	 
//        obj1.add();
//        obj1.sub();
     
     
     
	}

}
