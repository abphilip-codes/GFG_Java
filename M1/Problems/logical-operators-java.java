// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

package Problems;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Geeks6 {
    
    void logicOp(boolean a, boolean b){
        /*output (a&&b), (a||b), and ((!a)&&(!b))separated by spaces*/
        System.out.print(a&&b);
        System.out.print(" ");
        System.out.print(a||b);
        System.out.print(" ");
        System.out.print((!a)&&(!b));
    }
}

// { Driver Code Starts.

class GFG6 {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int testcases = sc.nextInt();
		
		while(testcases-- > 0){
		    
		    //taking the two boolean values
		    boolean a = sc.nextBoolean();
		    boolean b = sc.nextBoolean();
		    
		    //creating an object of class Geeks
		    Geeks6 g = new Geeks6();
		    
		    //calling the method logicOp() 
		    //and passing a,b as arguments
		    g.logicOp(a, b);
		    System.out.println();
		}
        sc.close();
	}
}  // } Driver Code Ends