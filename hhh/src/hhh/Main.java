package hhh;

public class Main {
	public static void main(String a[]) {
		Mythread1 thread1 = new Mythread1();
		Thread t = new Thread(thread1);
		t.start();
		
		
		Mythread2 thread2 = new Mythread2();
		thread2.start();
	}
}