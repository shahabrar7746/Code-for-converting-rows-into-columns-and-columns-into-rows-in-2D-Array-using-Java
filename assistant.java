import java.util.*;
import java.awt.Desktop;
import java.net.*;


        public class assistant{

	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	    int rows = sc.nextInt();//this will define rows for 1st array and columns for 2nd array
	    
	    int columns = sc.nextInt();//this will define columns for 1st array and rows for 2nd array
	    //primary array which will have our inputs 
		//this loop will take our values as input will  push into primary array
	    int primary[][] = new int[rows][columns];
	    for(int i = 0;i<rows;i++) {
	    	for(int j = 0;j<columns;j++) {
	    		primary[i][j] = sc.nextInt();
	    	}
	    }
	    //This array will have all answer that we want.That means this array will have columns of 1st array that is primary in it and rows of 1st array in that is primary in columns of secondary array
	   //in short this loop will push all the rows of primary array into columns of secondary array and will push columns of primary array into rows secondary
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
		
		
		
			
	   
