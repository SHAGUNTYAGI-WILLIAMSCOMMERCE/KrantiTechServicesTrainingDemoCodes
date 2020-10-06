//Testing final,

package edureka;

public class TestAccessModifiers {

	static final int var=20;  //final is non access modifier(value is fixed)
	
	public static void main(String[] args) {
		Hello obj1=new Hello();  //Object creation
		
	//	obj1.nonStaticMethod();  Here we cannot call this method because it is declared as private in class Hello
        
		obj1.printingMethod();  //calling method with default access modifier
	
		// var=11; we can't perform reassignment for final variables
	}

}
