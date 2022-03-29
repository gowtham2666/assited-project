package projects;
import java.util.*;
public class map {
	public static void main(String[] args) {
		
		 HashMap<String , Integer> hm = new HashMap<String , Integer>();
		 hm.put("gowtham",  1);
		 hm.put(" ktr",  2 );
		 hm.put("vamsi",  2 );
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }

Hashtable<String ,Integer > ht=new Hashtable<String, Integer>();  
	      
	      ht.put(" gowtham",4);  
	      ht.put(" jaswik",5);  
	      ht.put("jagan ",6);  
	      ht.put("John",7);  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8," Gowtham");    
	      map.put(9,"vamsi");    
	      map.put(10,"jaswik");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      

 
		 
	}

}
