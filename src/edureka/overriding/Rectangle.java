package edureka.overriding;

import java.util.Scanner;

public class Rectangle extends TestOverriding{  //achieving inheritance
	
	Scanner sc=new Scanner(System.in);
	protected void shape() {  //overriding shape method
			
			System.out.println("Enter the length of Rectangle");
			int len=sc.nextInt();
			System.out.println("Enter the width of Rectangle");
			int wid=sc.nextInt();
            System.out.println("Area of Rectangle is="+(len*wid));

	
		}

}
