package OOPS;
import java.util.*;
public class sets {

	public static void main(String[] args) {
		 
		Set<Integer> t= new TreeSet<Integer>();
		t.add(5);
		t.add(7);
		t.add(8);
		t.add(5);
		t.add(1);
		t.add(0);
		// t.remove(5);
		int z=t.size();
		boolean y=	t.isEmpty();
		System.out.println(t);
boolean x=t.contains(7);
System.out.println(x);
System.out.println(y);
System.out.println(z);
	}

}
