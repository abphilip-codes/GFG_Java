// { Driver Code Starts
//Initial Template for Java

package Problems;
import java.util.*;
class GFG6
{
    public static void main(String[] args)
    {
        Scanner br = new Scanner(System.in);
        int T = Integer.parseInt(br.nextLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.nextLine().trim());
            String[] S = br.nextLine().trim().split(" ");
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(S[i]);
            }
            Solution6 obj = new Solution6();
            obj.swapElements(arr, n);
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        br.close();
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