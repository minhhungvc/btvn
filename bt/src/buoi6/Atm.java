package buoi6;

public  interface Atm {
	public boolean withdraw(int accNo,double money);
	public boolean deposit(int accNo,double money);
	public double queryBalance(int accNo);
	
}

