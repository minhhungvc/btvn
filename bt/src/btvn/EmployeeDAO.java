package btvn;

public interface EmployeeDAO {
int length = 0;
public void addEmployee();
public void showEmployee();
public  Employee searchByName(String nameInput);
public void updateEmployeeByName(String nameInput, Double newSalary,int newAge);
}
