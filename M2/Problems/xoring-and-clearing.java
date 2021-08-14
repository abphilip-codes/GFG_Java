// { Driver Code Starts
//Initial Template for Java

package Problems;
import java.util.*;
class GFG9
{
    
	public static void main (String[] args)
	{
    	 Scanner sc = new Scanner(System.in);
    	 int t = sc.nextInt();
    	
    	 while(t-- > 0){
    	     int n=sc.nextInt();
    	     int arr[]=new int[n];
    	     for(int i=0;i<n;i++)
    	     arr[i]=sc.nextInt();
    	     
    	     
    	        Geeks9 obj=new Geeks9();
            	obj.xor1ToN(arr,n);
        	    obj.printArr(arr,n);
        	    obj.setToZero(arr,n);
        	    obj.printArr(arr,n);
    	   
    	}
        sc.close();
    }
}



 // } Driver Code Ends
//User function Template for Java

class Geeks9 {
    
    void printArr(int arr[],int n)
    {
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    void setToZero(int arr[],int n)
    {
        Arrays.fill(arr,0);
    }
    
    void xor1ToN(int arr[], int n)
    {
        for(int i=0;i<n;i++)
            arr[i]=arr[i]^i;
    }
}

// { Driver Code Starts.
  // } Driver Code Ends