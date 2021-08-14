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
        int ans=0;
        for (int z=0;z<n;z++) {
            int s=0;
            for (int y=z;y<n;y++) {
                s+=arr[y];
                if(s%2==0)
                    ans++;
            }
        }
        return (ans);
    }
}

// { Driver Code Starts.
  // } Driver Code Ends