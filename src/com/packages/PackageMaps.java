package com.packages;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class PackageMaps {

	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Chetan");    
	      hm.put(2,"Mahesh");    
	      hm.put(3,"Chandan");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Arjun");  
	      ht.put(5,"Ravi");  
	      ht.put(6,"Nitya");  
	      ht.put(7,"Shreya");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Shweta");    
	      map.put(9,"Nidhi");    
	      map.put(10,"Kishore");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
