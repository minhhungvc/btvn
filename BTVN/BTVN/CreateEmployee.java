package BTVN;


import java.util.Scanner;

public class CreateEmployee {
	public static void createId() {
		Scanner sc =new Scanner (System.in);
		System.out.print("Moi ban nhap Id: ");
		int id = sc.nextInt();
	}
	public static void createName() {
		Scanner sc =new Scanner (System.in);
		System.out.print("Moi ban nhap ten: ");
		String name = sc.nextLine();
	}
	public static void createSalary() {
		Scanner sc =new Scanner (System.in);
		System.out.print("Moi ban nhap luong: ");
		double salary = sc.nextDouble();
	}
	
}

