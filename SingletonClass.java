package main.java.com.monotonic.testing.m2;

public class SingletonClass {
	private static SingletonClass myObj;

	static {
		myObj = new SingletonClass();
	}

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		return myObj;
	}

	public void testMe() {
		System.out.println("Hey.... it is working!!!");
	}

	public static void main(String a[]) {
		SingletonClass ms = getInstance();
		ms.testMe();
	}
}
