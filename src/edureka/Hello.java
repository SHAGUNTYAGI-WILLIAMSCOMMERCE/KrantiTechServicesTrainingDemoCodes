//Static method and Non Static Method, Class with object creation,User defined Methods

package edureka;
public class Hello {   //Here public is our access Modifier means our class and methods are accessible inside and outside the package as well

	private void nonStaticMethod()     //Non Static Method with private modifier means not accessible outside this class
	{

		System.out.println("I am Non static Method");
	}

	public static void staticMethod()    // static method
	{

		System.out.println("I am static Method");
	}
	void printingMethod() {
		System.out.println("Hi,I am Method with Default Access Modifier");

	}

	public static void main(String[] args) {
		
		System.out.println("Hi,Developers");
		Hello obj1=new Hello();  //Object creation
		obj1.nonStaticMethod();  //calling non static method by object of class
		Hello.staticMethod();  //Calling static method with their class name
		
		

	}

	
	
}
