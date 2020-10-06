//synchronized method,abstract class and method,concrete method

package edureka.shape;

public abstract class Shape {  //abstract class
	
	
	abstract float area();  //abstract method without implementation

	public synchronized void methodDemo(){  //synchronized method(concrete method with implementation)
		
		System.out.println("I am Non synchronized Method and only 1 thread can access me at a time");
	}
}

