package CoreJava;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs =new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("Austrlia");
		hs.add("Canada");
		hs.add("Africa");
		//in output you will see that this 2nd INDIA is ignored or rejected and is not printed in console as it is duplicate value.
		hs.add("INDIA");
		System.out.println(hs);
		hs.remove("UK");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs.contains("USA"));
		
		 Iterator<String> i = hs.iterator();
		 while(i.hasNext())
		 {
		 System.out.println(i.next());
		 }
	

	}

}
