package EX;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class EX3_HashSet {
	public static void main (String[]agrs) {
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("vb.net");
		set.add("php");
		set.add("C#");
		Iterator<String>itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()+",");
		}
		System.out.println();
		}
}
