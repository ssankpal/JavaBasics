package coreJavaLearnings;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsOfOverrideMethods {

	public static void main(String[] args) {

		// if object created with Child reference then object can access all overridden
		// methods as well as methods available in child
		// and non overridden methods of parent

		Child ch = new Child();
		ch.add(5, 5);
		ch.div(2, 3);
		int mul = ch.mul(3, 3);
		System.out.println(mul);
		System.out.println(ch.add(5, 5));

		// if object created with Parent reference then object can access all overridden
		// methods as well as method only available in Parent
		// but not methods only available in child class
		Parent ch1 = new Child();
		ch1.mul(6, 3);
		ch1.add(4, 4);
				

		// System.out.println(ch.add(2,3));

	}
}

// Exception handling for overridden methods
//Rule 1
// If Parent method does not declared any exception then override method can declare only unchecked exception. For Checked exception it will throw 
// compiler error

// Rule 2
// If Parent method declared exception, then override method can declare no exception, same exception or subclass exception
// but not parent class exception (exception higher than declared in parent method)

class Parent {
	public int add(int a, int b) {
		return a + b;
	}

	public int mul(int x, int y) {
		return x * y;
	}

}

class Child extends Parent {

	public int add(int a, int b) throws ArithmeticException {
		return a + b + 1;
	}

	public int div(int l, int k) {
		return l / k;
	}

	class Child2 extends Parent {

		public int add(int a, int b) {
			return a + b + 1;
		}

		public int div(int l, int k) {
			return l / k;
		}

	}

	// throw vs throws exception

	// Rule - Using throw we can throw unchecked exceptions only

	public static void throwException() {
		int i = 2;
		// if(i!=2) throw new FileNotFoundException("Not expected");
		if (i != 2)
			throw new ArithmeticException("Not expected");
	}

	public static void throwsException() throws FileNotFoundException {
		int i = 2;
		if (i != 2) {
		}
	}
}
