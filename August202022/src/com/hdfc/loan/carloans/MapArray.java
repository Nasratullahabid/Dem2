package com.hdfc.loan.carloans;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapArray {

	public static void main(String[] args) {
		                          
//		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
//	                        map.put(1, 100);
//	                        map.put(20, 100);
//	                        map.put(30, 100);
//	                        map.put(4, 100);
//	                        System.out.println(map);
//	     System.out.println(map.get(20)); 
	     
//	     Map<Integer,Integer> map1=new LinkedHashMap<Integer,Integer>();
//	     map1.put(10, 100);
//	     map1.put(30, 300);
//	     map1.put(20, 200);
//	     System.out.println(map1);
//	     Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
//         map.put(1, 100);
//         map.put(20, 100);
//         map.put(30, 100);
//         map.put(4, 100);
//         System.out.println(map);
	     
         Map<Integer,String> map=new HashMap<Integer,String>();
         map.put(1, "Password1");
         map.put(2, "Password2");
         map.put(3, "Password3");
         System.out.println(map.get("1"));
         System.out.println("Map Values are"+map);
         
         
         
         
	            }
	

}
