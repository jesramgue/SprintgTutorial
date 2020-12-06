package spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;

public class Bar {

	private Foo foo;
	
	@Autowired
	public void setFoo(Foo foo) {
		this.foo = foo;
	}

	public String toString() {
		return "Bar! Foo : \n" + foo;
	}
}
