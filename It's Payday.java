Link for the Question:

https://practice.geeksforgeeks.org/contest/job-a-thon-31-hiring-challenge/problems

Solution:

//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int r2 = scanner.nextInt();

            Solution obj = new Solution();
            System.out.println(obj.Payday(x1, r1, x2, r2));
        }
        scanner.close();
    }
}
// } Driver Code Ends


// User function Template for Java
//Back-end complete function Template for Java
class Solution {
    public String Payday(int x1, int r1, int x2, int r2) {
        // code here
        Long A = Long.valueOf(x1) * Long.valueOf(r1);
        Long B = Long.valueOf(x2) * Long.valueOf(r2);
        
        // System.out.println(A);
        // System.out.println(B);
        int val = Long.compare(A, B); 
        if(val ==0) return "EQUAL"; 
        else if(val>0) return "A";
        else return "B"; 
    }
} 
