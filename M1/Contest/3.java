// { Driver Code Starts
//Initial Template for Java

package Contest;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

// Class GfGFunction with function forkJava
class GfGFunction2{
    
    // Function to print ForkJava
    // N : input number
    void forkJava(int N){
        if(N%15==0)
        System.out.println("Fork Java");
        else {
            if(N%5==0)
            System.out.println("Java");
            else if(N%3==0)
            System.out.println("Fork");
            else
            System.out.println();
        }
    }
    
}

// { Driver Code Starts.

class GfG2{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            
            int N = sc.nextInt();
            
            GfGFunction2 g = new GfGFunction2();
            g.forkJava(N);
            
        }
        sc.close();
    }
    
}  // } Driver Code Ends