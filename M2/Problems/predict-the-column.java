// { Driver Code Starts
//Initial Template for Java

package Problems;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

/*Class Geeks with its member function columnWithMaxZero()
* a[][] = matrix input
* n : number of rows and columns each
*/
class Geeks4 {
    int columnWithMaxZero(int a[][],int n){
        int zero,ans=0,m=0;
        for(int x=0;x<n;x++){
            zero=0;
            for(int y=0;y<n;y++){
                if(a[y][x]==0)
                zero++;
            }
            if(zero>m){
                m=zero;
                ans=x;
            }
        }
        return ans;
    }
}

// { Driver Code Starts.

// Driver class
class GFG4 {
    
    // Driver code
	public static void main (String[] args) {
	    // Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    
		    //taking size of 2d-array
		    int n = sc.nextInt();

            //creating a 2d-array
		    int a[][] = new int[n][n];
		    
		    //adding elements to the array
		    for(int i = 0;i<n;i++){
		        for(int j = 0;j<n;j++){
		            a[i][j] = sc.nextInt();
		        }
		    }
		    
		    //creating an object of Geeks clas
		    Geeks4 obj = new Geeks4();
		    
		    //calling the method columnWithMaxZero()
		    //of class Geeks
		    System.out.println(obj.columnWithMaxZero(a, n));
		}
        sc.close();
	}
}  // } Driver Code Ends