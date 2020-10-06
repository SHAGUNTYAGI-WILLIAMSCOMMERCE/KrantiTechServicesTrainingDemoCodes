package edureka.overriding;
import java.util.Scanner;

public class Square  extends TestOverriding {  //achieving inheritance
Scanner sc=new Scanner(System.in); //creating Scanner class object
		protected void shape() {
				
				System.out.println("Enter the length of side");
				int len=sc.nextInt();
				System.out.println("Area of Square is="+(len*len));

		
			}
}
