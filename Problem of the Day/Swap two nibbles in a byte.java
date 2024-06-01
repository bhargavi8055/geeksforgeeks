=========Problem Description============
  Given a number n, Your task is to swap the two nibbles and find the resulting number. 

A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte. For example, the decimal number 150 is represented as 10010110 in an 8-bit byte. This byte can be divided into two nibbles: 1001 and 0110.

Example 1:

Input: n = 100
Output: 70
Explanation: 100 in binary is 01100100, two nibbles are (0110) and (0100). If we swap the two nibbles, we get 01000110 which is 70 in decimal.
Example 2:

Input: n = 129
Output: 24
Explanation: 129 in binary is 10000001, two nibbles are (1000) and (0001). If we swap the two nibbles, we get 00011000 which is 24 in decimal.
Your Task:
You don't need to read input or print anything. Your task is to complete the function swapNibbles() which takes an integer n as input parameter and returns an integer after swapping nibbles in the binary representation of n.

Expected Time Complexity: O(1)
Expected Space Complexity: O(1)

Constraints:
0 ≤ n ≤ 255

  ==========Solution============
  //{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.swapNibbles(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int swapNibbles(int n) {
        // code here
        // System.out.println("value of n"+n);
      // converting given number to binary string
        String S=Integer.toBinaryString(n);
        // System.out.println("value of n in binary:"+S);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        
        // making binary number string to the length of 8
        if(S.length()<8){
            int less = 8-S.length();
            for(int i=1;i<=less;i++){
                sb.append('0');
            }
        }
        for(int i=0;i<S.length();i++){
            sb.append(S.charAt(i));
        }
        
        String s= sb.toString();
        
        // System.out.println("made string length of 8 "+s);
        
        sb1.append(s.charAt(4));
        sb1.append(s.charAt(5));
        sb1.append(s.charAt(6));
        sb1.append(s.charAt(7));
        sb1.append(s.charAt(0));
        sb1.append(s.charAt(1));
        sb1.append(s.charAt(2));
        sb1.append(s.charAt(3));
        
        String s1= sb1.toString();
        // System.out.println("After reversing"+s1);
        
        return Integer.parseInt(s1,2);
    }
}
