package practicle.java;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
        map1.put(102, "Mango");
        map1.put(108,"Orange");
		map1.put(105,"Banana");
		map1.put(103,"Grapes");
		map1.put(105,"Chiku");
		map1.put(null,null);
		map1.put(102,null);
		map1.put(null,"Apple");
		map1.put(107, "Mango");
		for(Map.Entry m : map1.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());}
			System.out.println("------------------------");
		map1.putIfAbsent(102, "CustardApple");
		map1.putIfAbsent(101, "Watermelon");
		for(Map.Entry m : map1.entrySet()) {
		System.out.println(m.getKey()+""+m.getValue());	}
		//key
		System.out.println("keya:"+map1.keySet());
		//value
		System.out.println("Values:"+map1.values());
		//key-value
		System.out.println("keys & values:"+map1.entrySet());
		map1.remove(103);
		System.out.println("After Removal");
		for(Map.Entry m:map1.entrySet()) {
	    System.out.println(m.getKey()+""+m.getValue());	
		}
	}

}
