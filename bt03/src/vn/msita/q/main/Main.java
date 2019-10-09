package vn.msita.q.main;

import java.sql.SQLException;
import java.util.ArrayList;

import vn.msita.q.bo.User;
import vn.msita.q.dao.usersDao;

public class Main {

	public static void main(String[] args) throws SQLException {
		usersDao usersDao = new usersDao();
		ArrayList<User> usersList = usersDao.getAllusers();

		//User newUser = new User();
		//newUser.setName("tranhung");
		//newUser.setPass("12345");
		//newUser.setAge(500);
		//usersDao.addUsers(newUser);
		//usersDao.addUsersViaPreparedStatement(newUser);
		for (User users : usersList) {
			System.out.println(users.getId() + "-" + users.getName() + "-" + users.getPass() + "-" + users.getAge());
		}

	}
}
