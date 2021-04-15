import java.util.*;
import java.awt.Desktop;
import java.net.*;


        public class assistant{

	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	    int rows = sc.nextInt();//this will define rows for 1st array and columns for 2nd array
	    
	    int columns = sc.nextInt();//this will define columns for 1st array and rows for 2nd array
	    //primary array which will have our inputs 
	    int primary[][] = new int[rows][columns];
	    for(int i = 0;i<rows;i++) {
	    	for(int j = 0;j<columns;j++) {
	    		primary[i][j] = sc.nextInt();
	    	}
	    }
	    //This array will have all answer that we wanted.That means this array will have columns of 1st array that is primary in its rows and wise versa
	    int secondary[][] = new int[columns][rows];
	    for(int i = 0;i<columns;i++) {
	    	for(int j = 0;j<rows;j++) {
	    		secondary[i][j] = primary[j][i];
	    		
	    	}
	    }
	    //loop will print all values of secondary array 
	    for(int i = 0;i<columns;i++) {
	    	for(int j = 0;j<rows;j++) {
	    		System.out.print(secondary[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	    		
	    		
    }
}
		
		
		
			
	   
