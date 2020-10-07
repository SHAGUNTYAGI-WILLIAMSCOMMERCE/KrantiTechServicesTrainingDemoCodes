//Program for matrix user input,displaying the input matrices and displaying their sum

package matrix.array;

import java.util.Scanner;  //importing Scanner class from util package for user input

public class MatrixDemo {  //class

	public static void main(String[] args) {   //main method

		int myarr[][]=new int[3][2];  //1st matrix
		int myarr1[][]=new int[3][2];  //2nd matrix
		int res[][]=new int[3][2];    //resultant matrix for storing results

		Scanner sc=new Scanner(System.in);   //scanner object
		
		try {    //try block to avoid abnormal termination in any exceptional case   
		System.out.println("Enter the values in 1st matrix:");  
		
		for(int i=0;i<3;i++) {   //outer loop
			
			for(int j=0;j<2;j++) {  //inner loop for 1st matrix input
				
				myarr[i][j]=sc.nextInt();   //user input in 1st matrix
				
			}
		
		}
		
			System.out.println("Enter the values in 2nd matrix:");
			
			for(int i=0;i<3;i++) {   //outer loop
				
				for(int j=0;j<2;j++) {    //inner loop for 2nd matrix input
					
					myarr1[i][j]=sc.nextInt();   ////user input in 2nd matrix
					
				}
				
			}
			 
		
		System.out.println("The first matrix is:");
		
      for(int i=0;i<3;i++) {   // outer loop to display the entered matrix 1st
			
		    	for(int j=0;j<2;j++) {    // inner loop to display the entered matrix 1st
			
		    		System.out.print(myarr[i][j]+" "); }   //displaying the 1st matrix

      System.out.println();}  //for new line
 
      System.out.println("The Second matrix is:");
      
      for(int i=0;i<3;i++) {   // outer loop to display the entered matrix 2nd
			
	    	for(int j=0;j<2;j++) {    // inner loop to display the entered matrix 2nd
		
	    		System.out.print(myarr1[i][j]+" "); }   //displaying the 2nd matrix

   System.out.println();   //for new line
      }
		}
		finally {   //finally block to close the connection
		sc.close();	//scanner class connection closed
		}
		
		 for(int i=0;i<3;i++) {  //outer loop for matrix addition
				
		    	for(int j=0;j<2;j++) {  //inner loop for matrix addition
		    		
		    		res[i][j]=myarr[i][j]+myarr1[i][j];  //storing the result
	
		    	}
		    	
		 }
		
			System.out.println("The Addition of 1st and 2nd  matrix is:");
			
		      for(int i=0;i<3;i++) {  //outer loop to display the result
					
				    	for(int j=0;j<2;j++) {   // inner loop to display the result
					
				    		System.out.print(res[i][j]+" "); }   //printing result

		      System.out.println();}  //for new line
		 	 
	}

}
		
	


