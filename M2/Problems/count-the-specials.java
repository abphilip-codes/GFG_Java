// { Driver Code Starts
//Initial Template for Java

package Problems;
import java.util.*;
import java.lang.*;


 // } Driver Code Ends
//User function Template for Java

/*Class Geeks with countSpecials as its member function
* a : input array
* n : size of array
k : to calculate floor(n/k)
*/
class Geeks2 {
    void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        int count=0,c=0;
        int al[] = new int[n];
        for(int x=0;x<n;x++) {
            c=1;
            for(int y=x+1;y<n;y++) {
                if(a[x]==a[y]) {
                    c++;
                    al[y]=-1;
                }
            }
            if(al[x]!=-1)
                al[x]=c;
        }
        for(int z=0;z<al.length;z++){
            if(al[z]==f)
            count++;
        }
        System.out.println(count);
    }
}

// { Driver Code Starts.

// Driver class
class GFG2 {
	public static void main (String[] args) {
	    
	    // Taking input through Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking count of testcases
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    
		    //taking size of array
		    int sizeof_array = sc.nextInt();
		    
		    //taking value of k
		    int k = sc.nextInt();
		    
		    //creating an array
		    int a[] = new int[sizeof_array];
		    
		    //inserting elements to the array
		    for(int i = 0;i<sizeof_array;i++){
		        a[i] = sc.nextInt();
		    }
		    
		    //creating an object of class Geeks
		    Geeks2 obj = new Geeks2();
		    
		    //calling countSpecials method of 
		    //class Geeks
		    obj.countSpecials(a, sizeof_array, k);
		}
		sc.close();
	}
}  // } Driver Code Ends