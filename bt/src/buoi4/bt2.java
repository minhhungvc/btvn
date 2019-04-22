package buoi4;

import java.util.Scanner;

public class bt2 {
	public static void main (String []agrs) {
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Nhập số từ 1 đến 3 :");
		int i=sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("create employee ");
			break;
		case 2:
			System.out.println("show the existing employee ");
			break;
		case 3:
			System.out.println("exit ");
			break;
		default:
			System.out.println("Mời nhập lại :!");
		}
			
		
	}

}
