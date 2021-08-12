// { Driver Code Starts
//Initial Template for Java
//Initial Template for C++
//Initial Template for C++

/*package whatever //do not write package name here */

package Problems;
import java.util.*;

class GFG11 {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking count of total testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //taking n
		    int n =sc.nextInt();
		    
		    //creating an object of class Geeks
		    Geeks11 obj=new Geeks11();
		    
		    //calling printTable() method
		    //of class Geeks and passing
		    //n as an argument
		    obj.printTable(n);
		}
        sc.close();	
		
	}
}// } Driver Code Ends


//User function Template for Java
class Geeks11 {
	 void printTable (int n) 
	 {
            int multiplier=10;
            while(multiplier>0)
            {
                System.out.print(multiplier*n+" ");
                multiplier--;
            }
       System.out.println();
	 }

}