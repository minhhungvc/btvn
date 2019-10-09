package vn.btvn.hung.main;

import java.sql.SQLException;
import java.util.ArrayList;

import vn.btvn.hung.bo.User;
import vn.btvn.hung.dao.UserDao;

public class Main {

	public static void main(String[] args) throws SQLException {
		UserDao usersDao = new UserDao();
		ArrayList<User> usersList = usersDao.countUsers();
		System.out.println("Số lượng HS :" + usersList.size());
		System.out.println();
		ArrayList<User> countFemale = usersDao.countFemale();
		System.out.println("Số lượng HS female :" + countFemale.size());
		System.out.println();
		ArrayList<User> countNotTelephone = usersDao.countNotTelephone();
		System.out.println("Số lượng HS NOt Telephone :" + countNotTelephone.size());
		System.out.println();
		ArrayList<User> countOverYears = usersDao.countOverYears();
		System.out.println("Số lượng HS over 18 years :" + countOverYears.size());
		System.out.println();
		ArrayList<User> countGood = usersDao.countGood();
		System.out.println("Số lượng HS Good :" + countGood.size());
		System.out.println();
		ArrayList<User> countBad = usersDao.countBad();
		System.out.println("Số lượng HS Bad :" + countBad.size());
		System.out.println();
		ArrayList<User> countFistNameNike = usersDao.countFistNameNike();
		System.out.println("Số lượng HS fist name Nike :" + countFistNameNike.size());
		System.out.println();
		ArrayList<User> countMedium = usersDao.countMedium();
		System.out.println("Số lượng HS Medium :" + countMedium.size());
		System.out.println();
		//for (User users : countFemale) {
		//	System.out.println(users.getId() + "-" + users.getFirst_name() + "-" + users.getLast_name() );
		//}
	}
}