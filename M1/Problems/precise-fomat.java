// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

package Problems;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Geeks5 {
    
    void printInFormat(float a, float b){
        float result = a/b;
        
        System.out.print(result+" ");
        System.out.printf("%.3f",result);
        // Your code here to print upto 3 decimal places
        
    }    
    
}

// { Driver Code Starts.

class GFG5 {
	public static void main (String[] args) {
		
		//taking input using class Scanner
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int testcases = sc.nextInt();
		
		while(testcases-- > 0){
		    
		    //taking 2 variables a,b
    		float a = sc.nextFloat();
    		float b = sc.nextFloat();
    		
    		//creating an object of class Geeks
    		Geeks5 g = new Geeks5();
    		
    		//calling printInFormat() method
    		//of class Geeks
    		g.printInFormat(a, b);
    		System.out.println();
		
		}
		sc.close();
	}
}
  // } Driver Code Ends