package btvn;

import java.util.ArrayList;
import java.util.Scanner;



	/**
	 * @author TechCare
	 *
	 */
	public class Main implements EmployeeDAO{
		public static Scanner scanner = new Scanner(System.in);
		public static int inputNumber = 0;
		public static int employeeNo = 0;
		ArrayList<Employee> empArr = new ArrayList<>();
		public static void main(String[] args) {
			showMenu();
			System.out.println("The program end!!!");
		}
		
		public static void showMenu() {
			EmployeeDAO employeeDAO= new Main();
			do {
				
				
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
					employeeDAO.addEmployee();
					
					break;
				case 2:
					if (employeeDAO != null && employeeDAO.length > 0) {
						employeeDAO.showEmployee();
					} else {
						System.out.println("Please add new employee first!");
						System.out.println("-------------------------------");
					}
					//employeeDAO.showEmployee();
					askForContinue();
					break;
				
				case 3:
					System.out.println("Please input name to serach :");
					String nameInput = scanner.next();
					Employee employee = employeeDAO.searchByName(nameInput);
					askForContinue();
				case 4:
					System.out.println("Please input name to search :");
					String nameInputUpdate=scanner.next();
					System.out.println("Please input new salary :");
					double newSalary =scanner.nextDouble();
					System.out.println("Please input new age :");
					int newAge =scanner.nextInt();
					employeeDAO.updateEmployeeByName(nameInputUpdate,newSalary,newAge);
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
		private static void askForContinue() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public  void addEmployee() {
			System.out.println("How many employee you want to create? : ");
			employeeNo = scanner.nextInt();
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
				empArr.add(employee);
			}
		}
		@Override
		public  void showEmployee() {
			System.out.println("----------------List of employee-----------");
			System.out.println("The number of employees is: "+empArr.size());
			System.out.println("ID      Name      Salary     Age      Married     Job name");
			for  (Employee employee : empArr) {
				System.out.println(employee.getId() + "       " + employee.getName() + "       " + employee.getSalary() + "       "+ employee.getAge() + "       "+ employee.getMarried() +"       " + employee.getJobName());
			}
		}
		@Override
		public Employee searchByName(String nameInput) {
			Employee employee = null;
			for(int i=0;i<empArr.size();i++) {
				if (nameInput.equals(empArr.get(i).getName())) {
					employee = empArr.get(i);
					System.out.println("ID      Name      Salary     Age     Married    Job name");
					System.out.println(employee.getId() + "       " + employee.getName() + "       " + employee.getSalary() + "       "+ employee.getAge() + "       "+ employee.getMarried() +"       " + employee.getJobName());

					break;
				}
				
			}
			return employee;
		}
		@Override
		public  void updateEmployeeByName(String nameInput, Double newSalary,int newAge) {
			for(int i=0;i<empArr.size();i++) {
				if (nameInput.equals(empArr.get(i).getName())) {
					empArr.get(i).setSalary(newSalary);			
				}
				}
		}
	}