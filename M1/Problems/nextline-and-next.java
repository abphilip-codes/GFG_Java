// { Driver Code Starts
//Initial Template for Java
/*package whatever //do not write package name here */

package Problems;
import java.util.*;

class GFG4 {
	public static void main (String[] args) {
		
		Geeks4 g = new Geeks4();
		g.getInput();
	}
}// } Driver Code Ends


//User function Template for Java

//Complete the function
//Take input for a and s 
class Geeks4 {
	void getInput () {
		
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt(); //Taking the number of testcases
	    while(t-->0)
	    {
    		int a = sc.nextInt(); 
    	    String s = sc.nextLine();
    	    s=sc.nextLine();
    	    
    	    //Your code here
    
    		System.out.println(a);
    		System.out.println(s);
	    }
        sc.close();
	}
}