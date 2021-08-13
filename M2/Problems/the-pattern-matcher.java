// { Driver Code Starts
//Initial Template for Java

package Problems;
import java.util.*;
class GFG7
{
    
	public static void main (String[] args)
	{
	     //Taking input using Scanner class
    	 Scanner sc = new Scanner(System.in);
    	 
    	 //taking count of total testcases
    	 int t = sc.nextInt();
    	 
    	 while(t-- > 0){
    	   
    	   //taking the String
    	   String s=sc.next();
    	   
    	   Geeks7 obj=new Geeks7();
    	   
    	   //calling follPatt() method
    	   //of class Geeks and passing
    	   //String as parameter
    	   obj.follPatt(s);
    	}
        sc.close();
    }
}


 // } Driver Code Ends
//User function Template for Java



class Geeks7 {
    
    void follPatt(String s)
    {
        int ans=0,i=0;
        for(i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ans==0){
                if(ch=='x')
                    ans++;
                else {
                    ans=10;
                    break;
                }
            }
            else{
                if(ch=='x'){
                    if(ch==s.charAt(i-1)){
                        ans++;
                    }
                    else {
                        ans=10;
                        break;
                    }
                }
                else
                    ans--;
            }
        }
        if(ans==0)
            System.out.print("1");
        else
            System.out.print("0");
        System.out.println();
    }
}


// { Driver Code Starts.
  // } Driver Code Ends