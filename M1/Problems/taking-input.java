// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */
package Problems;
import java.util.*;

 // } Driver Code Ends
//User function Template for Java

class Geeks2{
    
    // Function to take input using Scanner class
    void IOFunction(){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int a = sc.nextInt();
		    System.out.println(a);
		    float b = sc.nextFloat();
		    System.out.println(b);
		    long c = sc.nextLong();
		    System.out.println(c);
		    byte d = sc.nextByte();
		    System.out.println(d);
		    String s = sc.nextLine();
		    s = sc.nextLine();
		    System.out.println(s);
		}
		sc.close();
    }
    
}

// { Driver Code Starts.


class GFG2 {
    
    // Driver Code
    public static void main (String[] args) {
	    
	       //Creating an object of class Geeks
	       Geeks2 g = new Geeks2();
		
		   //Calling the IOFunction() of class Geeks
		   g.IOFunction();
	}
}  // } Driver Code Ends