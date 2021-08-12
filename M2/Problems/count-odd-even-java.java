// { Driver Code Starts
// Initial Template for Java

package Problems;
import java.util.*;

// Position this line where user code will be pasted.

class GFG0 {

    // Driver code
    public static void main(String[] args) {

        // Taking input using scanner class
        Scanner sc = new Scanner(System.in);

        // taking count of testcases
        int testcase = sc.nextInt();

        while (testcase-- > 0) {

            // taking size of arary
            int sizeof_array = sc.nextInt();

            // creating an array
            int a[] = new int[sizeof_array];

            // inserting elements in the array
            for (int i = 0; i < sizeof_array; i++) {
                a[i] = sc.nextInt();
            }

            // creating an object of class Geeks
            Geeks0 obj = new Geeks0();

            // calling countOddEven() method
            // of class Geeks
            obj.countOddEven(a, sizeof_array);
            System.out.println();
        }
        sc.close();
    }
}
// } Driver Code Ends


// User function Template for Java

/*Class Geeks with countOddEven() as its member function
* a : input array
* n : size of array
*/
class Geeks0 {
    void countOddEven(int a[], int n) {
        int even=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
            even++;
        }
        System.out.print((n-even)+" "+even);
    }
}