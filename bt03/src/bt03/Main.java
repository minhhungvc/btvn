package bt03;

import java.util.ArrayList;

import bt03.Student;
import bt03.StudentUtils;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> listStudent = new ArrayList<Student>();
		listStudent = StudentUtils.readFile();
		System.out.println("Number of student: " + listStudent.size());
		System.out.println();

		int percent = StudentUtils.countMale(listStudent);
		System.out.println("Percent of gender : " + percent + "/" + (100 - percent));
		System.out.println();

		ArrayList<Student> listNotAge = StudentUtils.studentNotAge(listStudent);
		for (Student student : listNotAge) {
			System.out.println("Student not have age");
			System.out.println("-ID " + student.getId() + ":" + student.getFirstName() + "" + student.getLastName());
			System.out.println();
		}

		ArrayList<Student> listNotTelephone = StudentUtils.studentNotTelephone(listStudent);
		for (Student student : listNotTelephone) {
			System.out.println("Student not have telephone");
			System.out.println("-ID " + student.getId() + ":" + student.getFirstName() + "" + student.getLastName());
			System.out.println();
		}
		System.out.println("List of students");
		System.out.println("---------------");
		ArrayList<Student> studentExcellent = StudentUtils.studentExcellent(listStudent);
		System.out.println(" Excellent: ");
		for (Student student : studentExcellent) {
			System.out.println("-ID " + student.getId() + ":" + student.getFirstName() + "" + student.getLastName());
			System.out.println();
		}
		ArrayList<Student> studentGood = StudentUtils.studentGood(listStudent);
		System.out.println(" Good: ");
		for (Student student : studentGood) {
			System.out.println("-ID " + student.getId() + ":" + student.getFirstName() + "" + student.getLastName());
		}
		System.out.println();
		ArrayList<Student> studentBad = StudentUtils.studentBad(listStudent);
		System.out.println(" Bad: ");
		for (Student student : studentBad) {
			System.out.println("-ID " + student.getId() + ":" + student.getFirstName() + "" + student.getLastName());

		}

	}

}
