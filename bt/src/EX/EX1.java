package EX;

import java.util.ArrayList;
import java.util.Iterator;

public class EX1 {
public static void main (String[]agrs) {
	ArrayList<String>list = new ArrayList<String>();
	list.add("java");
	list.add("c++");
	list.add("pHp");
	Iterator<String>itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next()+",");
	}
}
}
