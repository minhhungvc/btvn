package btvn;

import java.util.Scanner;

public class Employee {
	protected int id;
	protected String name;	
	protected double salary;
	protected int age;
	protected boolean Married;
	protected Job job;
	protected int jobId;
	protected String jobName;
	public Employee(int id, String name, double salary, int age, boolean married, Job job) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		Married = married;
		this.job = job;
	}
	
	public Employee() {
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Id: ");
		id = sc.nextInt();
		System.out.print("Name: ");
		name = sc.nextLine();
		String i = sc.nextLine();
		System.out.print("Salary: ");
		salary = sc.nextDouble();
		System.out.print("Age: ");
		age = sc.nextInt();
		System.out.print("Married(True or False):  ");
		Married = sc.nextBoolean();
		System.out.print("Job Id: ");
		jobId = sc.nextInt();
		String a = sc.nextLine();
		System.out.print("Job Name: ");
		jobName = sc.nextLine();
	}
	public void hienThiTT() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Age: " + age);
		System.out.println("Married: " + Married);
		System.out.println("Id job: " + jobId);
		System.out.println("Name job: " + jobName);
		
	}
	
}
