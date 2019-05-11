package buoi6;

public class atmImpl implements Atm,Atmvc {

	@Override
	public boolean withdraw(int accNo, double money) {
		return false;
	}

	@Override
	public boolean deposit(int accNo, double money) {
		return false;
	}

	@Override
	public double queryBalance(int accNo) {
		return 0;
	}

	@Override
	public boolean login(String usserName, String passWord) {
		return false;
	}

	@Override
	public boolean logout(String usserName) {
		return false;
	}

}
