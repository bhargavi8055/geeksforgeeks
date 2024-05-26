=========Link for the Problem Statement=========
  https://practice.geeksforgeeks.org/contest/gfg-weekly-156-rated-contest/problems


=========Solution=========
  //{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int k;
            k = Integer.parseInt(br.readLine());

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            boolean res = obj.geeklandElections(n, k, s);

            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static boolean geeklandElections(int n, int k, String s) {
        // code here
        int oc=0,zc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') oc+=1;
            else zc+=1;
        }
        if((oc+k)>zc-k) return true;
        else return false;
        
        // int geek=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='1') geek+=1;
            
        // }
        // int total=geek+k;
        // int ag=n-geek-k;
        // if(total>ag) return true;
        // else return false;
    }
}
