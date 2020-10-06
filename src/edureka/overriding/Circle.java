package edureka.overriding;

import java.util.Scanner;

public class Circle  extends TestOverriding {  //achieving inheritance
	 
 private final float pi= (float)3.14;  //value of pi is fixed
	Scanner sc=new Scanner(System.in);
	protected void shape() {
			
			System.out.println("Enter the radius of Circle");
			int rad=sc.nextInt();    //user input
			float res=pi*(rad*rad);
            System.out.println("Area of Circle is="+(res));


}
   }