// { Driver Code Starts
// Initial Template for Java

package Problems;
import java.util.*;

class GFG12 {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // take testcases
        int t = sc.nextInt();
        while (t-- > 0) {
            // taking the number
            int n = sc.nextInt();
            Geeks12 obj = new Geeks12();

            // caling isPrime method
            // with n as argument
            obj.isPrime(n);
        }
        sc.close();
    }
}

// Position this line where user code will be pasted.
// } Driver Code Ends


// User function Template for Java

class Geeks12 {
    void isPrime(int n) {
        int k=0;
        if(n%2==0 && n!=2)
            k=1;
        if(n==1)
            k=1;
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if(n%i==0)
                k=1;
        }
        if(k==1)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}