// { Driver Code Starts
//Initial Template for Java

package Contest;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class GfGFunction1{
    
    // Function to find number of jumps
    // N : number inscribed on the last stone.
    // X : number on which we have to reach
    void findJumps(long N, long X){
        if(N%2!=0)
        N--;
        long ind=(long)(X/2);
        long sri=(long)((N-X+1)/2);
        System.out.println(Math.min(ind,sri));    
    }
    
}

// { Driver Code Starts.

class GfG1{
    
    // Driver Code
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        // Testcase Input
        int t = sc.nextInt();
        
        // Iterating through all testcase input
        while(t-- > 0){
            
            long N = sc.nextLong();
            long X = sc.nextLong();
            
            GfGFunction1 g = new GfGFunction1();
            
            g.findJumps(N, X);
            
        }
        sc.close();
    }
    
}  // } Driver Code Ends