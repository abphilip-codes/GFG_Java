// { Driver Code Starts
//Initial Template for Java

package Problems;
import java.util.*;
class GFG10
{

	public static void main (String[] args)
	{
    	 Scanner sc = new Scanner(System.in);
    	 int t = sc.nextInt();
    	 
    	 while(t-- > 0){
    	  int n=sc.nextInt();
    	  int arr[]=new int[n];
    	  for(int i=0;i<n;i++)
    	  {
    	      arr[i]=sc.nextInt();
    	  }
    	  Geeks10 obj=new Geeks10();
    	  System.out.println(obj.countSumSubsets(arr,n));
    	   
    	 }
         sc.close();
    }
}


 // } Driver Code Ends
//User function Template for Java

class Geeks10 {
    int countSumSubsets(int arr[], int n)
    {
        long z=(long)Math.pow(2,n);
        int x,y,k,ans=0;
        for(x=0;x<z;x++)
        {
            k=0;
            for(y=0;y<n;y++)
            {
                if((x&(1<<y))>0)
                    k=k+arr[y];
            }
            if(k%2==0 & k!=0)
                ans++;
        }
        return ans;
    }
}

// { Driver Code Starts.
  // } Driver Code Ends