// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

package Problems;
import java.util.*;

class GFG10 {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases count
		int t=sc.nextInt();
		while(t-->0)
		{
		    //taking n
		    int n =sc.nextInt();
		
	        //creating an object of class Geeks	
		    Geeks10 obj=new Geeks10();
		    
		    //calling isDivisbleByPrime()
		    //method of class Geeks
		    obj.isDivisibleByPrime(n);
		}
	    sc.close();
		
	}
}

 // } Driver Code Ends
//User function Template for Java


//Back-end complete function Template for Java
class Geeks10 {
	 void isDivisibleByPrime (int n) 
	 {
	    if(n%11==0)
	        System.out.println("Eleven");
	    else if(n%3==0)
	        System.out.println("Three");
	    else if(n%2==0)
	        System.out.println("Two");
	    else
            System.out.println("-1");
	 }

}

// { Driver Code Starts.

/*package whatever //do not write package name here */  // } Driver Code Ends