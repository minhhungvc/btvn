package btvn;

import java.util.ArrayList;
import java.util.Scanner;



	/**
	 * @author TechCare
	 *
	 */
	public class Main {
		public static Scanner scanner = new Scanner(System.in);
		public static int inputNumber = 0;
		public static int employeeNo = 0;
		public static Employee[] employees;
		public static boolean isEndProgram = false;
		public static void main(String[] args) {
			showMenu();
			System.out.println("The program end!!!");
		}
		
		public static void showMenu() {
			do {
				if (isEndProgram) {
					break;
				}
				System.out.println("Choose one numbers below : ");
				System.out.println("1: Create  new Employees");
				System.out.println("2: Show the existing Employees");
				System.out.println("3: serach employee by name");
				System.out.println("4: update employee by name and salary and age  :");
				System.out.println("5: exit:");
				System.out.println("-------------------------------");
				System.out.println("Type your input number : ");
				inputNumber = scanner.nextInt();
				switch (inputNumber) {
				case 1:
					addEmployee();
					askForContinue();
					break;
				case 2:
					if (employees != null && employees.length > 0) {
						showEmployee();
					} else {
						System.out.println("Please add new employee first!");
						System.out.println("-------------------------------");
					}
					askForContinue();
					break;
				
				case 3:
					System.out.println("Please input name to serach :");
					String nameInput = scanner.next();
					Employee employee = searchByName(nameInput);
					askForContinue();
				case 4:
					System.out.println("Please input name to search :");
					String nameInputUpdate=scanner.next();
					System.out.println("Please input new salary :");
					double newSalary =scanner.nextDouble();
					System.out.println("Please input new age :");
					int newAge =scanner.nextInt();
					updateEmployeeByName(nameInputUpdate,newSalary,newAge);
					askForContinue();
						
				case 5:
					break;
				default:
					System.out.println("your input number is wrong, please input again!");
					System.out.println("-------------------------------");
					showMenu();
				}

			} while (inputNumber != 5);
		}
		
		public static void addEmployee() {
			System.out.println("How many employee you want to create? : ");
			employeeNo = scanner.nextInt();
			employees = new Employee[employeeNo];
			for (int i = 0; i < employeeNo; i++) {
				System.out.println("Please input the information of employee[" + i + 1 + "] : ");
				System.out.println("Name : ");
				Scanner scannerName = new Scanner(System.in);
				String name = scannerName.nextLine();
				System.out.println("Salary : ");
				double salary = scanner.nextDouble();
				System.out.println("Age : ");
				int age = scanner.nextInt();
				System.out.println("Married : ");
				boolean Married = scanner.nextBoolean();
				System.out.println("Job name : ");
				String jobName = scanner.next();
				Employee employee = new Employee(name, i + 1, salary, age, true, new Job(i + 1, jobName));
				employees[i] = employee;
			}
		}
		
		public static void showEmployee() {
			System.out.println("----------------List of employee-----------");
			System.out.println("ID      Name      Salary     Age      Married     Job name");
			for (int i = 0; i < employees.length; i++) {
				System.out.println(employees[i].getId() + "       " + employees[i].getName() + "       " + employees[i].getSalary() + "       "+ employees[i].getAge() + "       "+ employees[i].getMarried() +"       " + employees[i].getJobName());
			}
		}
		public static Employee searchByName(String nameInput) {
			Employee employee = null;
			for(int i=0;i<employees.length;i++) {
				if (nameInput.equals(employees[i].name)) {
					employee = employees[i];
					System.out.println("ID      Name      Salary     Age     Married    Job name");
					System.out.println(employees[i].getId() + "       " + employees[i].getName() + "       " + employees[i].getSalary() + "       "+ employees[i].getAge() + "       "+ employees[i].getMarried() +"       " + employees[i].getJobName());

					break;
				}
				
			}
			return employee;
		}
		public static void updateEmployeeByName(String nameInput, Double newSalary,int newAge) {
			for(int i=0;i<employees.length;i++) {
				if (nameInput.equals(employees[i].name)) {
					employees[i].salary = newSalary;
					employees[i].age = newAge;
					System.out.println("ID      Name      Salary     Age     Married    Job name");
					System.out.println(employees[i].getId() + "       " + employees[i].getName() + "       " + employees[i].getSalary() + "       "+ employees[i].getAge() + "       "+ employees[i].getMarried() +"       " + employees[i].getJobName());

					
					break;
				}
			}
		}
				public static void askForContinue() {
			System.out.println("Do you want to continue? (Press 3 to end proram, 0 to come back menu) : ");
			int inputNo = scanner.nextInt();
			switch (inputNo) {
			case 0:
				showMenu();
				break;
			case 3:
				isEndProgram = true;
				break;
			default:
				break;
			}
		}
	}