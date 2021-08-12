// { Driver Code Starts
//Initial Template for Java

package Problems;
import java.util.*;
import java.lang.*;
class GFG5 {    
	public static void main (String[] args)
	{
        //taking input using class Scanner
            Scanner sc = new Scanner(System.in);
            
            //taking total count of all testcases
            int t = sc.nextInt();
            sc.nextLine();
            boolean flag = false;
            while(t-- > 0){
    	  
            //taking the input String
            String s=sc.nextLine();

            //Creating an object of class Geeks
            Geeks5 obj=new Geeks5();

            //calling the checkString
            //method of class Geeks
            obj.checkString(s);
            sc.close();
    	}
    }
}// } Driver Code Ends


//User function Template for Java



class Geeks5 {
    void checkString(String s)
    {
        int v=0;
        int c=0;
        for(int i=0;i<s.length();i++) {
            char h = s.charAt(i);
            if(Character.isLetter(h))
            if(h=='a' || h=='e' || h=='i' || h=='o' || h=='u' ) 
                v++;
            else
                c++;
        }
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
        System.out.print("Same");
        
        System.out.println();
    }
}

//Position this line where user code will be pasted.