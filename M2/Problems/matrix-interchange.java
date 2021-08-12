// { Driver Code Starts
//Initial Template for Java

package Problems;
import java.util.*;

 // } Driver Code Ends
//User function Template for Java

/*Class Geeks with its member function interchange()
* a[][] = matrix input
* r : number of rows
* c : number of columns
*/
class Geeks3 {
    void interchange(int a[][],int r, int c){
        int temp;
        for(int i=0;i<r;i++){
            temp=a[i][c-1];
            a[i][c-1]=a[i][0];
            a[i][0]=temp;
            for(int j=0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// { Driver Code Starts.

// Driver class
class GFG3 {
    
    // Driver code
	public static void main (String[] args) {
	    
	    // Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    
		    //taking row and column count
		    int rows = sc.nextInt();
            int cols = sc.nextInt();
            
            //creating a 2d-array 
		    int a[][] = new int[rows][cols];
		    
		    //adding elements to the 2d-array
		    for(int i = 0;i<rows;i++){
		        for(int j = 0;j<cols;j++){
		            a[i][j] = sc.nextInt();
		        }
		    }
		    
		    //creating an object of class Geeks
		    Geeks3 obj = new Geeks3();
		    
		    //calling interchange() method 
		    //of class Geeks
		    obj.interchange(a, rows, cols);
		}
        sc.close();
	}
}  // } Driver Code Ends