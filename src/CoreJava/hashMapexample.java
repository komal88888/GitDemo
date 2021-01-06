package CoreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapexample {
	public static void main(String[] args){
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Monday");
		hm.put(1, "Tuesday");
		hm.put(2, "Wednesday");
		hm.put(3, "Thursday");
		hm.put(4, "Friday");
		hm.put(25, "Saturday");
		hm.put(16, "Sunday");
		System.out.println(hm.get(25));
		hm.remove(25);
		System.out.println(hm.get(25));
		
		 Set sn = hm.entrySet();
		 Iterator it = sn.iterator();
		 
		 while(it.hasNext())
		 {
			 Map.Entry  mp = (Map.Entry)it.next();
			 System.out.println(mp.getKey());
			 System.out.println(mp.getValue());
		 }
		
		
		
		
	}

}
