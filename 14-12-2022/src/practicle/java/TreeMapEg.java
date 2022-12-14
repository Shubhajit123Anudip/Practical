package practicle.java;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEg {

	public static void main(String[] args) {
		TreeMap<Integer,String> map2 = new TreeMap<Integer,String>();
        map2.put(102, "Mango");
        map2.put(108,"Orange");
		map2.put(105,"Banana");
		map2.put(103,"Grapes");
		map2.put(105,"Chiku");
      //map2.put(null,"chiku");
	//map2.put(107,null);
		System.out.println(map2);
		map2.putIfAbsent(102,"CustardApple");
		map2.putIfAbsent(101,"Watermelon");
		System.out.println("------------------");
		for(Map.Entry m:map2.entrySet()) {
		System.out.println(m.getKey()+""+m.getValue());	
		}
		map2.remove(103);
		System.out.println("----------------");
		System.out.println("After Removal");
		for(Map.Entry m:map2.entrySet()) {
	    System.out.println(m.getKey()+""+m.getValue());	
		}
		}
	}