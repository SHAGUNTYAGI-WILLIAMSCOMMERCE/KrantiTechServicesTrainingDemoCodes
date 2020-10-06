//testing variables with different methods,performing operations after passing values through constructor

package edureka;

public class variableTesting { 
	
	int x,y; //class level variables
	
	public variableTesting(int x,int y)  //constructor of the class
	{
		this.x=x;  //this keyword for reffering current class object
		this.y=y;
	}

	public int sum() {
		
       return x+y;   //returning the sum of x and y
	
	}
	public void calCulationMultiply() {
		
		final int var01=2;  //local variables (belongs to this method)
		final int var02=2;

	    System.out.print("Hey multiply of"+ var01 +"and"+ var02+"is="+(var01*var02) );  //Result
		
		}

	
	
	public static void main(String[] args) {
		
		variableTesting ob=new variableTesting(2,5); //passing values to the constructor
		System.out.println("Sum is="+ob.sum());  //printing result

		ob.calCulationMultiply(); //calling this method for mutiply 
	}

}
