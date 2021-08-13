// { Driver Code Starts
//Initial Template for Java

package Problems;
import java.util.*;
class GFG8
{
    
	public static void main (String[] args)
	{
	     //taking input using Scanner class
    	 Scanner sc = new Scanner(System.in);
    	 
    	 //taking total number of testcases
    	 int t = sc.nextInt();
    	 
    	 while(t-- > 0){
    	   
    	   //taking the 2 strings
    	   String s1=sc.next();
    	   String s2=sc.next();
    	   
    	   //creating an object of class Geeks
    	   Geeks8 obj=new Geeks8();
    	   
    	   //calling coutChars method
    	   //of class Geeks and passing
    	   //both the Strings and printing
    	   //the result
    	   System.out.println(obj.coutChars(s1,s2));
    	   
    	 }
         sc.close();
    }
}




 // } Driver Code Ends
//User function Template for Java

/*Function to count number of characters 
* to make s1 and s2 equal
* s1 : first string
* s2 : second string
*/
class Geeks8 {
    int coutChars(String s1, String s2)
    {
        int c1[]=new int[26];
        int c2[]=new int[26];
        int i,ans=0;
        for(i=0;i<s1.length();i++)
            c1[s1.charAt(i)-'a']++;
        for(i=0;i<s2.length();i++)
            c2[s2.charAt(i)-'a']++;
        for(i=0;i<26;i++)
            ans=ans+Math.abs(c1[i]-c2[i]);
        return ans;
    }
}

// { Driver Code Starts.
  // } Driver Code Ends