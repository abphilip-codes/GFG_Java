// { Driver Code Starts
//Initial Template for Java

package Contest;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

// Class GfGFunction containing function operations()
class GfGFunction0{
    
    /* Function to do the operations.
    * Arguments : a, b and c
    */
    void operations(int a, int b, int c){
        long p = (long)Math.pow(a,b);
        System.out.println(p);
        System.out.println(p^c);
        System.out.println(p%c);
    }
    
}

// { Driver Code Starts.

class GfG0{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int testcases = sc.nextInt();
        
        while(testcases-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            GfGFunction0 func = new GfGFunction0();
            
            func.operations(a, b, c);
            
        }
        sc.close();
    }
    
}  // } Driver Code Ends