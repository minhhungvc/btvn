package buoi4;

import java.util.Scanner;

public class bt {
	public static void main(String []agrs) {
   	Scanner sc =new Scanner (System.in);
   	System.out.println("Mời nhập a :");
   	int a = sc.nextInt();
   	System.out.println("Mời nhập b :");
   	int b = sc.nextInt();
   	
   	System.out.println("a+b = " + (a+b));
   	System.out.println("a-b = " + (a-b));
   	System.out.println("a%b = " + (a%b));
   	System.out.println("a/b = " + (a/b));
   	System.out.println("a++ = " + (a++));
   	System.out.println("b-- = " + (b--));
	}
   
   	
   /*	if (a>b)
   		System.out.println(" a>b ");
   	else
   		System.out.println("a<b");
   	System.out.println(ktra(a,b));
 }
	public static String ktra (int a , int b) {
		return (a>b) ? "a>b" : "a<b";
   		
   	}*/
	public static String ktra (int a , int b ) {
		if(a>b)
			return ("a>b");
		else
			return("a<b");
		 	
	}
}