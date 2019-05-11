package buoi3;

public class bt2 {
	protected int id;
	protected String name;
	
	protected double salary;
	protected int age;
	protected  boolean married;
	protected Job Job;
	public bt2( int id,String name, double salary, int age, boolean married, Job job) {
		super();
		this.id = id;
		this.name = name;
		
		this.salary = salary;
		this.age = age;
		this.married = married;
		Job = job;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public Job getJob() {
		return Job;
	}
	public void setJob(Job job) {
		Job = job;
	}
	
	
}
	
	


