package practicle.java;

import java.util.HashMap;
import java.util.Map;

public class HasMap2 {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(101,"Mango");
		map.put(108,"Orange");
		map.put(105,"Banana");
		map.put(103,"Grapes");
		map.put(105,"Chiku");
		map.put(null,null);
		map.put(102,null);
		map.put(null,"Apple");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());}
			System.out.println("------------------------");
		map.putIfAbsent(102, "CustardApple");
		map.putIfAbsent(101, "Watermelon");
		for(Map.Entry m : map.entrySet()) {
		System.out.println(m.getKey()+""+m.getValue());	
		}
		map.remove(103);
		System.out.println(map);
		}}