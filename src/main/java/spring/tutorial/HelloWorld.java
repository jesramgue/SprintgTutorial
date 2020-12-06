package spring.tutorial;

public class HelloWorld {

	/** Dependencia de la clase Foo. */
	private Foo foo;

	/** Un constructor en el cual Spring puede inyectar 'Foo' */
	public HelloWorld(Foo foo) {
		this.foo = foo;
	}

	public String toString() {
		return " HelloWorld! foo : \n " + foo;
	}
}
