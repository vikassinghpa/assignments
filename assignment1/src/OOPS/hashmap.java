package OOPS;
import java.util.*;
public class hashmap {

	public static void main(String[] args) {
		Map m= new HashMap();//you can use linkedHashMap,TreeMap
		m.put("vik","singh");
		m.put("pal", 4);
		m.put("shi", 5.00);
		m.containsValue(5.00);
		m.containsKey("shi");
		System.out.println(m.Values);
		System.out.println(m);
		System.out.println(m.containsValue(5.00));
		System.out.println(m.containsKey("shi"));
		System.out.println(m.get("vik"));
		

	}

}
