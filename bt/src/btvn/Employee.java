package btvn;

import java.util.Scanner;

public class Employee {

	private int id;
	private String name;
	double salary;
	int age;
	private boolean Married;
	private Job job;
	private int jobId;
	private String jobName;

	public Employee(String name, int id, double salary, int age, boolean Married, Job job) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.Married = Married;
		this.job = job;

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

	public boolean getMarried() {
		return Married;
	}

	public void setMarried(boolean married) {
		Married = married;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

}