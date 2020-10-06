//Method overloading(same method names within same class only differ in parameters) and Constructors(default and parametrized)

package edureka;

public class methodsConstructors {  //class 
	
          public methodsConstructors() {
        	  
        	  System.out.println("I am default constructor");
        	  
          }
          
  public methodsConstructors(int a,int b) {
        	  
        	  System.out.println("I am Parametrized constructor with values passed as "+a+" and "+b);
        	  
          }
  
	public int sum(int ab,int ac){  //sum method with 2 integer arguments
		
        System.out.println("Hi,I am Sum method with two arguments "+ ab+" and "+ ac);   //printing the arguments
        
       	return ab+ac;    //returning the sum of arguments
	}

    public int sum(int ab,int ac,float ad){  //sum method with 2 integer and 1 float argument 
		
        System.out.println("Hi,I am Sum method with three arguments with one float argument "+ ab+" and "+ ac+" and " +ad); //returning the sum of x and y
       
        return ab+ac+(int)ad; // returning the sum and typecasting float value to int 
	}
	
	public static void main(String[] args) {   //main method

		methodsConstructors m1=new methodsConstructors();  //object creation  and default constructor
		
		methodsConstructors m2=new methodsConstructors(5,7); //passing values in parametrized constructor
		
		int res= m1.sum(5, 10);  //function calling and passing 2 arguments to the function sum
		 System.out.println("Sum of these two numbers is="+res);
		 
		 int res1= m1.sum(5,10,15);  //function calling and passing 3 arguments to the function sum
		 System.out.println("Sum of these three numbers is="+(float)res1);
		
		
	}

}
