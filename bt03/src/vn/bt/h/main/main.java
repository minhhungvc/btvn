package vn.bt.h.main;

import java.util.ArrayList;
import java.util.Scanner;

import vn.bt.h.bo.Student;
import vn.bt.h.dao.studentDao;

public class main {

	public static void main(String[] args) {

		studentDao studentDao = new studentDao();
		Scanner scanner = new Scanner(System.in);
		boolean isContinue = true;
		while (isContinue) {
			System.out.println("=================================================");
			// nhập username
			System.out.print("Enter username: ");
			String name = scanner.nextLine();

			// tìm user bằng username vừa nhập
			ArrayList<Student> studentList = studentDao.findUserByUsername(name);

			// Nếu không tìm thấy: nhập vào các thông tin cần thiết và tạo mới một user và
			// insert vào Database
			if (studentList.size() == 0) {
				System.out.println("No record found");

				// Nhập username
				System.out.print("Enter new username: ");
				String newUsername = scanner.nextLine();

				// Nhập password
				System.out.print("Enter new password: ");
				String newPassword = scanner.nextLine();

				// Nhập password
				System.out.print("Enter new age: ");
				int newAge = scanner.nextInt();

				Student User = new Student();
				// set dữ liệu cho newUser
				User.setName(newUsername);
				User.setPass(newPassword);
				User.setAge(newAge);

				// Gọi userDAO để thêm mới một user vào database
				studentDao.addStudent(User);
				System.out.println("Insert successfully!");
			}

			// Nếu chỉ có 1 user: thì nhập password mới từ bàn phím và update password cho
			// user trong database.
			if (studentList.size() == 1) {
				// Hiển thị kết quả của user tìm được: id - username - password - age

				for (Student users : studentList) {
					System.out.println(
							users.getId() + "-" + users.getName() + "-" + users.getPass() + "-" + users.getAge());
				}

				// Nhập password mới
				System.out.print("Enter new password: ");
				String newPassword = scanner.nextLine();

				// Gọi userDAO để cập nhật password mới cho user
				studentDao.capnhatPass(studentList.get(0).getId(), newPassword);

				System.out.println("Update successfully!");
			}

			// Nếu có hơn nhiều hơn 1 user: thì xóa hết trong database chỉ giữ lại user đầu
			// tiên.
			if (studentList.size() > 1) {
				// Hiển thị kết quả của tất cả user tìm được: id - username - password - age
				for (Student users : studentList) {
					System.out.println(
							users.getId() + "-" + users.getName() + "-" + users.getPass() + "-" + users.getAge());
				}

				// Gọi userDAO để xóa user thứ 2 đến thứ N của listUser trong database.
				for (int i = 1; i < studentList.size(); i++) {
					studentDao.delete(studentList.get(i).getId());
				}
				System.out.println("Delete successfully!");
			}

			// Có tiếp tục làm việc không?
			scanner = new Scanner(System.in);
			System.out.print("Continue (Y/N): ");
			String result = scanner.nextLine();
			isContinue = "Y".equalsIgnoreCase(result);
		}
		scanner.close();

	}
}