// { Driver Code Starts
//Initial Template for Java

package Problems;
import java.util.*;
import java.lang.*;
class GFG6
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] S = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            obj.swapElements(arr, n);
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution6
{
    public void swapElements(int[] a, int n)
    {
        int temp,i;
        for(i=0;i<n-2;i++){
            temp=a[i];
            a[i]=a[i+2];
            a[i+2]=temp;
        }
    }
}