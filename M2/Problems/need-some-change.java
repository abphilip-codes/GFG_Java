// { Driver Code Starts
//Initial Template for Java

import java.util.*;

 // } Driver Code Ends
//User function Template for Java

/*Geeks class with its member function swapElements
* a : array with input elements
* n : size of array
*/
package Problems;
class Geeks1{
    void swapElements(int a[], int n){
        int temp,i;
        for(i=0;i<n-2;i++){
            temp=a[i];
            a[i]=a[i+2];
            a[i+2]=temp;
        }
        for(i=0;i<n-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print(a[n-1]);
    }
}

// { Driver Code Starts.

// Driver class
class GFG1 {
    
    // Driver code
	public static void main (String[] args) {
	    // Input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int sizeof_array = sc.nextInt();
		    int a[] = new int[sizeof_array];
		    
		    for(int i = 0;i<sizeof_array;i++){
		        a[i] = sc.nextInt();
		    }
		    
		    Geeks1 obj = new Geeks1();
		    obj.swapElements(a, sizeof_array);
		}
        sc.close();
	}
}  // } Driver Code Ends