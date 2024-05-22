Link to the problem statement:
https://practice.geeksforgeeks.org/contest/gfg-weekly-155-rated-contest/problems

Solution:


//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int M = Integer.parseInt(line[1]);

            Solution obj = new Solution();
            long res = obj.firstContact(N, M);

            System.out.println(res);
        }
    }
}


// } Driver Code Ends
// User function Template for Java
class Solution {
    public static long firstContact(int N, int M) {
        // code here
       long greater = Math.max(N,M);
       long smallest = Math.min(N,M);
       long ans;
       long i=greater;
       while(true){
           if(i%smallest == 0){
               ans=i;
               break;
           }
           i+=greater;
       }
       return ans;
    }
}

//{ Driver Code Starts.

// } Driver Code Ends
