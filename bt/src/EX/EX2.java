package EX;

import java.util.Iterator;
import java.util.LinkedList;

public class EX2 {
public static void main (String[]agrs) {
	LinkedList<String> linkedList = new LinkedList<String>();
	linkedList.add("java");
	linkedList.add("vb.net");
	linkedList.add("php");
	linkedList.add("C#");
	Iterator<String>itr = linkedList.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next()+",");
	}
	linkedList.addFirst("python");
	System.out.println("");
	for(String obj : linkedList) {
		System.out.println(obj+",");
		}
	linkedList.addLast("12211221");
	
	}
System.out.println("");
for(String obj : linkedList) {
	System.out.println(obj+",");
}
}
