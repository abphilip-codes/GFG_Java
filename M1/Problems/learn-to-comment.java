// { Driver Code Starts
//Initial Template for Java

//Initial Template for C++
//Initial Template for C++
package Problems;
import java.util.*;

 // } Driver Code Ends
//User function Template for Java

//Back-end complete function Template for Java

class Geeks3{
    
    // Function to print a and c
    //comment the line that outputs b
    void comment(int a, int b, int c){
        
        //Prints a
        System.out.println(a);
        //Prints b
        // System.out.println(b);
        //Prints c
        System.out.println(c);
    }
    
}

// { Driver Code Starts.
 
class gfg3{
    
    public static void main(String args[]){
        //Creating an Object of Scanner class
        Scanner sc = new Scanner(System.in);
        
        //Getting number of testcases
        int testcase = sc.nextInt();
        
        // Taking input for all testcases
        while(testcase-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            //Creating an Object of class Geeks
            Geeks3 g = new Geeks3();
            
            //Calling the comments function of class Geeks
            g.comment(a, b, c);
        }
        sc.close();
    }
    
}   // } Driver Code Ends