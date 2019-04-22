package BTVN;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<Employee> arrEmp = new ArrayList<>();
		int n;
		Employee employee;
		System.out.print("Nhap so nhan vien: ");
		n = sc.nextInt();

		int x;
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("1. Create Employee ");
			System.out.println("2. Show the existing employee ");
			System.out.println("3. Exit ");
			System.out.print("Nhap lua chon: ");
			x = sc.nextInt();
		switch(x) {
		
		case 1: 
			System.out.println("Ban da chon 1");
				for (int i =0 ; i<n ; i++) {
					System.out.println("Nhap thong tin nhan vien thu "+ (i+1) + ": " );
					employee = new Employee();
					employee.nhapThongTin();
					arrEmp.add(employee);
				}
			break;
		case 2:
			System.out.println("-----------------------------");
			System.out.println("Ban da chon 2");
			System.out.println("Thong tin nhan vien");
			for(int i = 0; i< arrEmp.size(); i++) {
				System.out.println("Thong tin nhan vien thu "+(i+1) + ": ");
				arrEmp.get(i).hienThiTT();
			}
			break;
		case 3: 
			System.out.println("Ket thuc chuong trinh!!!");
			break;
		default:
			System.out.println("Moi ban nhap lai!!!");
		}
	}
		while(x!=3);
	}

}
