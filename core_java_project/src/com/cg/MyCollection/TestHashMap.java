
package com.cg.MyCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<>();
		
		hm.put("Sakshi", 453);
		hm.put("Joe", 300);
		hm.put("Jacks", 465);
		hm.put("Andy", 555);
		
		Set<Map.Entry<String,Integer>> st = hm.entrySet();  //returns Set view
	    for(Map.Entry<String,Integer> i:st)
	    {
	      System.out.print(i.getKey()+":");
	      System.out.println(i.getValue());
	    }
		
	    for(String str: hm.keySet())
	    {
	    	System.out.println(str);
	    }
	    
	    for(Integer i: hm.values())
	    {
	    	System.out.println(i);
	    }
	     Iterator<Map.Entry<String,Integer>> it=hm.entrySet().iterator();
	     while(it.hasNext())
	     {
	    	 Map.Entry<String, Integer> entry = it.next();
	    	 System.out.println(entry.getKey());
	    	 System.out.println(entry.getValue());
	     }
	}

}
