package spring.tutorial;

public class Foo {

	private String name;

	private String telephoneNumber;

	private int age;

	public Foo(String name, String telephoneNumber, int age) {
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.age = age;
	}

	public Foo(String name, int age, String telephoneNumber) {
		this.name = name;
		this.age = age;
		this.telephoneNumber = telephoneNumber;
	}

	public String toString() {
		return " name : " + name + " \n telephoneNumber : " + telephoneNumber
				+ "\n age : " + age;
	}
}