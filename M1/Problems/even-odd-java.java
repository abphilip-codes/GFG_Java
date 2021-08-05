// { Driver Code Starts
//Initial Template for Java


package Problems;
import java.util.*;

class GFG8 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		Geeks8 obj=new Geeks8();
    		obj.evenOdd(a,b);
		}
		sc.close();
	
		
	}
}


 // } Driver Code Ends
//User function Template for Java


// Function to check if number is even or odd
class Geeks8 {
	 void evenOdd (int a,int b) 
	 {
		if(a%2==0){
		    System.out.println(a);
		    System.out.println(b);
		}
		else {
		    System.out.println(b);
		    System.out.println(a);
		}
	 }
}


// { Driver Code Starts.



  // } Driver Code Ends