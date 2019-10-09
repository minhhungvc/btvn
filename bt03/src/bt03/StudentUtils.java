package bt03;

import java.io.File;

import java.util.ArrayList;
import java.util.Scanner;

import bt03.Student;

public class StudentUtils {
	public static ArrayList<Student> readFile() {

		ArrayList<Student> listStudent = new ArrayList<Student>();
		try {
			File ObjSt = new File("New.txt");
			Scanner myReader = new Scanner(ObjSt);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] arr = data.split(";");
				Student student = new Student();
				for (int i = 0; i < arr.length; i++) {
					student.setId(Integer.parseInt(arr[0]));
					student.setFirstName(arr[1]);
					student.setLastName(arr[2]);

					if (!arr[3].isEmpty()) {
						student.setGender(arr[3].trim());
					} else {
						student.setGender("");
					}
					if (!arr[4].isEmpty()) {
						student.setAge(Integer.parseInt(arr[4].trim()));
					} else {
						student.setAge(0);
					}
					if (!arr[5].isEmpty()) {
						student.setTelephone(arr[5]);
					} else {
						student.setTelephone("0");
					}
					if (Integer.valueOf(arr[6]) > 10 || Integer.valueOf(arr[6]) > 10 || arr[6].isEmpty()) {
						student.setScores(0);
					} else {
						student.setScores(Integer.parseInt(arr[6]));
					}
				}
				listStudent.add(student);
			}

			myReader.close();
		} catch (Exception e) {
			System.out.println("An error occurred. ");
			e.printStackTrace();

		}
		return listStudent;
	}

	public static int countMale(ArrayList<Student> listStudent) {
		int count = 0;
		for (int i = 0; i < listStudent.size(); i++) {

			if (listStudent.get(i).getGender().equals("Male")) {
				count++;
			}
		}
		return (count * 100 / listStudent.size());
	}

	public static ArrayList<Student> studentNotAge(ArrayList<Student> listStudent) {
		ArrayList<Student> studentNotAge = new ArrayList<Student>();
		for (int i = 0; i < listStudent.size(); i++) {
			if (!hasAge(listStudent.get(i))) {
				studentNotAge.add(listStudent.get(i));

			}
		}
		return studentNotAge;
	}

	public static boolean hasAge(Student student) {

		if ((student.getAge() == 0)) {
			return false;
		}
		return true;
	}

	public static ArrayList<Student> studentNotTelephone(ArrayList<Student> listStudent) {
		ArrayList<Student> studentNotTelephone = new ArrayList<Student>();

		for (int i = 0; i < listStudent.size(); i++) {

			if (!hasTelephone(listStudent.get(i))) {
				studentNotTelephone.add(listStudent.get(i));
			}
		}
		return studentNotTelephone;
	}

	public static boolean hasTelephone(Student student) {

		if ((student.getTelephone() == "0")) {
			return false;
		}
		return true;
	}

	public static ArrayList<Student> studentExcellent(ArrayList<Student> listStudent) {
		ArrayList<Student> studentExcellent = new ArrayList<Student>();
		for (int i = 0; i < listStudent.size(); i++) {
			if (Excellent(listStudent.get(i))) {
				studentExcellent.add(listStudent.get(i));
			}
		}
		return studentExcellent;
	}

	public static boolean Excellent(Student student) {
		if (student.getScores() >= 8) {
			return true;
		}
		return false;

	}

	public static ArrayList<Student> studentGood(ArrayList<Student> listStudent) {
		ArrayList<Student> studentGood = new ArrayList<Student>();
		for (int i = 0; i < listStudent.size(); i++) {
			if (Good(listStudent.get(i))) {
				studentGood.add(listStudent.get(i));

			}
		}
		return studentGood;
	}

	public static boolean Good(Student student) {
		if (student.getScores() < 8 && student.getScores() >= 5) {
			return true;
		}
		return false;

	}

	public static ArrayList<Student> studentBad(ArrayList<Student> listStudent) {
		ArrayList<Student> studentBad = new ArrayList<Student>();
		for (int i = 0; i < listStudent.size(); i++) {
			if (Bad(listStudent.get(i))) {
				studentBad.add(listStudent.get(i));

			}
		}
		return studentBad;
	}

	public static boolean Bad(Student student) {
		if (student.getScores() < 5) {
			return true;
		}
		return false;
	}
}
